import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class IletisimIzınleriPage extends BasePage {
    public IletisimIzınleriPage(WebDriver driver) {
        super(driver);
    }

    public IletisimIzınleriPage iletisimGuncelle(){
        clickByXpath("//span[text()='Hesabım' and @class='user-menu__title']");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,300)");
        waitBySeconds(2);
        clickByXpath("//span[text()='İletişim İzinleri' and @class='account-menu__text']");
        waitBySeconds(1);
        clickByXpath("//label[text()='E-posta almak istiyorum.']");
        waitBySeconds(1);
        clickByXpath("//label[text()='Telefonla bilgilendirilmek istiyorum.']");
        waitBySeconds(1);
        clickByXpath("//button[text()='Kaydet']");

        return new IletisimIzınleriPage(driver);
    }
}
