import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import static org.junit.Assert.assertTrue;

/**
 * Created by magda on 13.12.2016.
 */
@RunWith(JUnitParamsRunner.class)
public class LogInTest extends Scenario {

    @Test
    public void shouldLogIn() {
        //GIVEN
        openUrl();
        //WHEN
        tryLogIn(CORRECT_LOGIN, CORRECT_PASS);
        //THEN
        assertTrue(isElementPresent(By.id("wp-admin-bar-my-account")));
        //tryLogOut();
    }


    @Test
    @Parameters({"CORRECT_LOGIN,wrongPass","wrongUser,CORRECT_PASS","aaa,bbb"})
    public void shouldNotLogIn(String userId, String pass) {
        //GIVEN
        openUrl();
        //WHEN
        tryLogIn(userId, pass);
        //THEN
        assertTrue(isElementPresent(By.id("login_error")));
        //tryLogOut();


    }

}
