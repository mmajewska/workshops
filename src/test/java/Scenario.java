import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/**
 * Created by magda on 13.12.2016.
 */
public class Scenario {
    final String CORRECT_LOGIN = "Warsztatautomatyzacja";
    final String CORRECT_PASS = "notsosimplepass123";
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp() throws Exception {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().deleteAllCookies(); //do usuwania cookies, żeby nie blokowało strony jak za dużo razy niepoprawnie się zalogujemy
        baseUrl = "http://streser.nazwa.pl/szkolenia/wp-login.php";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void openUrl() {
        driver.get(baseUrl);
    }

    public void tryLogIn(String userId, String password) {
        driver.findElement(By.id("user_login")).clear();
        driver.findElement(By.id("user_login")).sendKeys(userId);
        driver.findElement(By.id("user_pass")).clear();
        driver.findElement(By.id("user_pass")).sendKeys(password);
        driver.findElement(By.id("wp-submit")).click();
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void tryLogOut() {
        driver.findElement(By.id("wp-admin-bar-user-actions")).isSelected();
        driver.findElement(By.id("wp-admin-bar-logout")).click();
    }
}
