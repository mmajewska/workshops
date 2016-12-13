import org.junit.Test;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;

/**
 * Created by magda on 13.12.2016.
 */
public class AddNewPostTest extends Scenario{

    WebDriver driver;

    @Test
    public void shouldAddNewPost(){

        //otwieramy strone logowania
        LogInPage lp = new LogInPage(driver);
        //po poprawnym zalogowaniu mamy stronę AdminPage
        AdminPage ap = lp.correctLogIn();
        //na stronie AdminPage klikamy na add_new_blog_post - otworzy się strona dodawania nowego postu
        AddNewPostPage anp = ap.addNewPost();
        //na stronie dodwania postu wypełniamy pola title i text i klikamy na publish
        anp.publishNewPost("title", "text");
        //wylogowanie - otworzy się strona HomePage
        anp.logOut();
        HomePage hp = new HomePage(driver);
        hp.open();
        assertTrue(hp.postPublished("title"));

    }
}
