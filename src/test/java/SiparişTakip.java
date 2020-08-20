import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SiparişTakip extends BasePage {
    public SiparişTakip(WebDriver driver) {
        super(driver);
    }

    public SiparişTakip siparişTakip(){
        clickByXpath("//a[@href='/hesabim/siparislerim' and @class='user-menu__link user-menu__link--order']");
        return new SiparişTakip(driver);
    }
}
