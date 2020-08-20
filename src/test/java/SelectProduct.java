import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SelectProduct extends BasePage {
    public SelectProduct(WebDriver driver) {
        super(driver);
    }

    public void selectProductByIndex(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickByXpath("//div[contains(@class, 'products__item js-category-item-hover')][2]");
        //JavascriptExecutor jse = (JavascriptExecutor)driver;
        //jse.executeScript("window.scrollBy(0,450)");
    }

}