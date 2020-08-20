import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class OrderPage extends BasePage {
    public OrderPage(WebDriver driver) {
        super(driver);
    }

    public OrderPage siparisVer(){

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,300)");
        clickByXpath("//div[contains(@class, 'selectize-control product__location')]");
        //clickByClassname("selectize-control product__location product-location selectize-control--location-green js-region-selectize single plugin-no_results_cs plugin-start_typing plugin-preserve_on_blur");
        waitBySeconds(1);
        setByXpathValue("//input[contains(@placeholder,'Göndereceğiniz mahalleyi, Okul, Hastane vb. seçin')]","Adana");
        waitBySeconds(2);
        clickByXpath("//div[@data-value='0' and @class='product-location__results-item']");
        waitBySeconds(3);
        clickByXpath("//span[text()='Sipariş Ver']");
        return new OrderPage(driver);
    }
}
