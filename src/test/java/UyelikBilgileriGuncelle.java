import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class UyelikBilgileriGuncelle extends BasePage{
    public UyelikBilgileriGuncelle(WebDriver driver) {
        super(driver);
    }

    public UyelikBilgileriGuncelle bilgiGuncelle(){
        clickByXpath("//span[text()='Hesabım' and @class='user-menu__title']");
        clickByXpath("//span[text()='Üyelik Bilgilerim' and @class='account-menu__text']");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,300)");
        waitBySeconds(2);
        setById("address","Akasya Avm - İstanbul");
        waitBySeconds(1);
        setById("CompanyName","Testinium");
        waitBySeconds(1);
        clickByXpath("//button[text()='Güncelle']");

        return new UyelikBilgileriGuncelle(driver);
    }
}
