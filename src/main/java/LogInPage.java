import org.openqa.selenium.WebDriver;

/**
 * Created by magda on 13.12.2016.
 */

public class LogInPage extends Page {

    //konstruktor klasy LogInPage z parametrem
    public LogInPage(WebDriver driver) {
        super(driver);

    }
    //metoda correctLogin zwracająca obiekt klasy AdminPage (otwiera stronę Admin po zalogowaniu)
    public AdminPage correctLogIn() {
        return new AdminPage(driver);
    }
}
