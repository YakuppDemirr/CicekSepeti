import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage girisYap(String userName,String password)
    {
        driver.get("https://www.ciceksepeti.com/uye-girisi");
        setById("EmailLogin",userName);
        waitBySeconds(1);
        setById("Password",password);
        waitBySeconds(1);
        clickByXpath("//button[text()='Giriş']");
        return new LoginPage(driver);
    }
}
