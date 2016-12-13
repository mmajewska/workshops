import org.openqa.selenium.WebDriver;

/**
 * Created by magda on 13.12.2016.
 */

//klasa abstrakcyjna

public abstract class Page {

    //pola klasy Page
    protected final WebDriver driver;

    //konstruktor klasy Page z parametrem
    public Page(WebDriver driver) {
        this.driver = driver;
    }
}
