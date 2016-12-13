import org.openqa.selenium.WebDriver;

/**
 * Created by magda on 13.12.2016.
 */

public class AdminPage extends Page{

    //konstruktor klasy AdminPage z parametrem
    public AdminPage(WebDriver driver) {
        super(driver);
    }
    //metoda zwracająca obiekt klasy AddNewPostPage - otwiera stronę dodawania nowego posta
    public AddNewPostPage addNewPost() {
        return new AddNewPostPage(driver);
    }
}
