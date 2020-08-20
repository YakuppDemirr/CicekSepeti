import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AddtoFavorites extends BasePage{
    public AddtoFavorites(WebDriver driver) {
        super(driver);
    }

    public AddtoFavorites favorilereEkle(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,350)");
        clickByClassname("btn favorite__btn js-favorite-add");

        return new AddtoFavorites(driver);
    }
}
