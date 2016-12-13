import org.openqa.selenium.WebDriver;

/**
 * Created by magda on 13.12.2016.
 */
public class HomePage extends Page{

    //konstruktor z parametrem
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //metoda open - otwiera strone HomePage
    public void open() {
    }
    //metoda - sprawdza czy post został dodany
    public boolean postPublished(String title) {
        return false;
    }
}
