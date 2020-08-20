import org.junit.Test;
import static com.testinium.constants.ConstantsPage.*;

public class CicekSepetiTest  extends BaseTest {

    @Test
    public void cicekSepetiTestleri(){
        new HomePage(driver);
        new RegisterPage(driver).kayitOl("Yakup Demir",USER_NAME,PASSWORD);
        new LoginPage(driver).girisYap(USER_NAME,PASSWORD);
        new SearchPage(driver).urunAra("çiçek");
        new SelectProduct(driver).selectProductByIndex();
        new OrderPage(driver).siparisVer();
        new OrderDetailsPage(driver).siparisDetay("Melih Sakarya","05000000000","İstanbul-Akasya Avm","Testinium")
                                    .ekUrunlerIleri()
                                    .faturaBilgileriIleri()
                                    .odemeYap();
    }

    @Test
    public void senaryo2(){
        new HomePage(driver);
        new LoginPage(driver).girisYap(USER_NAME,PASSWORD);
        new SearchPage(driver).urunAra("çikolata");
        new SelectProduct(driver).selectProductByIndex();
        new AddtoFavorites(driver).favorilereEkle();
    }

    @Test
    public void senaryo3(){
        new HomePage(driver);
        new LoginPage(driver).girisYap(USER_NAME,PASSWORD);
        new SiparişTakip(driver).siparişTakip();
    }

    @Test
    public void senaryo4(){
        new HomePage(driver);
        new LoginPage(driver).girisYap(USER_NAME,PASSWORD);
        new AbonelikPage(driver).abonelikKontrol();
    }

    @Test
    public  void senaryo5(){
        new HomePage(driver);
        new LoginPage(driver).girisYap(USER_NAME,PASSWORD);
        new SifreDegistir(driver).sifreDegistir();
    }

    @Test
    public void senaryo6(){
        new HomePage(driver);
        new LoginPage(driver).girisYap(USER_NAME,PASSWORD);
        new UyelikBilgileriGuncelle(driver).bilgiGuncelle();
    }

    @Test
    public void senaryo7(){
        new HomePage(driver);
        new LoginPage(driver).girisYap(USER_NAME,PASSWORD);
        new IletisimIzınleriPage(driver).iletisimGuncelle();
    }
}
