import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    protected WebDriver driver;

    @Before
    public void hazirla(){
        System.setProperty("webdriver.chrome.driver", "file/chromedriver.exe");
        driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    /*@After
    public void bitir() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }*/
}
