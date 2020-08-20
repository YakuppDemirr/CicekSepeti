import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {

    public WebDriver driver;


    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public HomePage callHomePage(){
        driver.get("https://www.ciceksepeti.com");
        return new HomePage(driver);
    }

    public void setById(String id, String value){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        element.clear();
        element.sendKeys(value);
    }

    public void setByXpath(String xpath, String value){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        element.clear();
        element.sendKeys(value);
    }

    public void setByXpathValue(String xpath, String value){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        element.clear();
        element.sendKeys(value);
    }

    public void setByClassName(String className, String value){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.className(className)));
        element.clear();
        element.sendKeys(value);
    }

    public void hoverElement(By by) {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(by)).build().perform();
    }

    public void clickById(String id){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.id(id)));
        driver.findElement(By.id(id)).click();
    }

    public  void dropdownSelect(String id,String value)
    {
        Select dropdown = new Select(driver.findElement(By.id(id)));
        dropdown.selectByVisibleText(value);
    }

    public void clickByXpath(String xpath){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath)).click();
    }

    public void clickByClassname(String classname){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.className(classname)));
        driver.findElement(By.className(classname)).click();
    }

    public void linkText(String text){
        WebElement element = new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.linkText(text)));
        driver.findElement(By.linkText(text)).click();
    }

    public List<WebElement> getElementsByXpath(String s) {
        return new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//div[contains(@class, 'products__item js-category-item-hover')][2]"))));
    }

    //Saniye cinsinden bekleme
    public void waitBySeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //Milisaniye cinsinden bekleme
    /*public void waitByMilliSeconds(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/
}
