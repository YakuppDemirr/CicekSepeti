import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
        driver.get("https://www.ciceksepeti.com");
        clickByXpath("/html/body/main/div/div[1]/div[1]/div[1]/a/span");
        //hoverElement(By.xpath("//span[text() = 'Üyelik']"));
        //linkText("Üye Ol");
    }
}
