import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SifreDegistir extends BasePage{
    public SifreDegistir(WebDriver driver) {
        super(driver);
    }

    public SifreDegistir sifreDegistir(){
        clickByXpath("//span[text()='Hesabım' and @class='user-menu__title']");
        waitBySeconds(2);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        waitBySeconds(2);
        clickByXpath("//span[text()='Şifre Değiştir' and @class='account-menu__text']");
        setById("OldPassword","Bjk.1903");
        waitBySeconds(1);
        setById("NewPassword","123456");
        waitBySeconds(1);
        setById("NewPasswordConfirm","123456");
        waitBySeconds(1);
        clickByXpath("//button[text()='Güncelle']");

        return new SifreDegistir(driver);
    }
}
