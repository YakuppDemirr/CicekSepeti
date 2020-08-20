import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
        /*setById("NameIndivual","Yakup Demir");
        waitBySeconds(1);
        setById("EmailIndivual","yakuppdemirr@hotmail.com");
        waitBySeconds(1);
        setById("PasswordIndivual","Bjk.1903");
        waitBySeconds(1);
        clickByXpath("//*[@id=\"newMemberFormIndividual\"]/div[9]/label/span");
        waitBySeconds(1);
        clickByClassname("js-individual-register-button");
        clickByXpath("//button[text()='Tamam']");
        linkText("Üye Girişi");*/
    }

    public RegisterPage kayitOl(String name,String userName,String password)
    {
        hoverElement(By.xpath("//span[text() = 'Üyelik']"));
        linkText("Üye Ol");
        setById("NameIndivual",name);
        waitBySeconds(1);
        setById("EmailIndivual",userName);
        waitBySeconds(1);
        setById("PasswordIndivual",password);
        clickByXpath("//*[@id=\"newMemberFormIndividual\"]/div[9]/label/span");
        clickByClassname("js-individual-register-button");
        clickByXpath("//button[text()='Tamam']");
        linkText("Üye Girişi");
        return new RegisterPage(driver);
    }
}
