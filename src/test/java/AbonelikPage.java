import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AbonelikPage extends BasePage {
    public AbonelikPage(WebDriver driver) {
        super(driver);
    }

    public AbonelikPage abonelikKontrol(){
        clickByXpath("//span[text()='Hesabım' and @class='user-menu__title']");
        clickByXpath("//span[text()='Aboneliklerim' and @class='account-menu__text']");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,600)");
        waitBySeconds(2);
        clickByXpath("//button[@class='accordion-toggle js-accordion-collapse js-subs-faq-item' and @data-target='#collapse0']");

        return new AbonelikPage(driver);
    }
}
