import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class OrderDetailsPage extends BasePage {
    public OrderDetailsPage(WebDriver driver) {
        super(driver);
    }

    public OrderDetailsPage siparisDetay(String aliciAdSoyad,String aliciTel, String aliciAdres,String sirket)
    {
        setById("GroupDeliveryAddressList_0__Address_AddressName",aliciAdSoyad);
        setById("GroupDeliveryAddressList_0__Address_Phone_Phone",aliciTel);
        setById("GroupDeliveryAddressList_0__Address_AddressLine",aliciAdres);
        setByXpath("//input[contains(@placeholder, 'Şirket veya Okul İsmi (İsteğe Bağlı)')]",sirket);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,350)");

        /*dropdownSelect("GroupDeliveryAddressList_0__Address_SendingReasonId","Doğum Günü");
        waitBySeconds(2);
        dropdownSelect("GroupDeliveryAddressList_0__DeliveryOptionId","Elden teslim edin");
        waitBySeconds(2);*/
        clickByClassname("order-next-button__text");

        return new OrderDetailsPage(driver);
    }

    public OrderDetailsPage ekUrunlerIleri()
    {
        waitBySeconds(2);
        //clickByClassname("btn-wrapper");
        clickByXpath("/html/body/main/div/div/form/div[2]/div[1]/button");
        return new OrderDetailsPage(driver);
    }
    public OrderDetailsPage faturaBilgileriIleri()
    {
        waitBySeconds(2);
        //clickByClassname("btn-wrapper");
        clickByXpath("/html/body/main/div/div/div[2]/div[1]/button");
        return new OrderDetailsPage(driver);
    }

    public OrderDetailsPage odemeYap()
    {
        setById("CreditCardNumber","1234567812345678");
        waitBySeconds(1);
        dropdownSelect("ExpMonth","10");
        waitBySeconds(1);
        dropdownSelect("ExpYear","24");
        waitBySeconds(1);
        setById("Cvv","123");
        waitBySeconds(1);
        clickByXpath("//button[text () = 'Ödeme Yap']");
        //clickByClassname("modal-icon");
        return new OrderDetailsPage(driver);

    }
}
