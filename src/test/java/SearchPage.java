import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public SearchPage urunAra(String productName){

        setByXpath("//*[@id=\"product-search-2\"]/input",productName);
        waitBySeconds(2);
        clickByXpath("//*[@id=\"product-search-2\"]/button");
        return new SearchPage(driver);
    }
}
