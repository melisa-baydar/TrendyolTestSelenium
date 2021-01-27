package StepDefinitions;

import java.util.List;
//import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

//import com.google.inject.spi.Element;
//import com.pages.Loginpage;
//import com.qa.factory.DriverFactory;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	WebDriver driver;
	WebElement element;

	//private static String title;
	//private Loginpage loginPage;
	
	////////////////////////////////////Element/////////////////////////////////////////////
	
	@FindBy(css= ".fancybox-item.fancybox-close")
	WebElement btn_PopupKapat;            
	
	@FindBy(className =".search-box")
	WebElement btn_UrunAra;
	
	@FindBy(className =".search-icon")
	WebElement btn_AramaButonunaTýkla;
	
	@FindBy(className =".fltr-cntnr-show-more-button")
	WebElement btn_DahaFazlaGoster;
	
	By btn_Listele             =By.className("fltr-item-wrppr");
	 	
	@FindBy(className =".p-card-img")
	WebElement btn_RandomUrunSec;
	
	@FindBy(className =".add-to-bs-tx")
	WebElement btn_SepeteEkle;
	
	@FindBy(className =".basket-item-count")
	WebElement btn_SepeteGit;
	
	@FindBy(className =".goBasket")
	WebElement btn_SepeteGitTýkla;
	
	@FindBy(className =".i-trash")
	WebElement btn_SepetiTemizle;
	
	By btn_SepetiSilTýkla             =By.className("btn");

	@When("Trendyola giris yapilir")
	public void Trendyolu_giris_yapilir() {
		System.setProperty("webdriver.chrome.driver",
				"src\\test\\resources\\Driver\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@When("User gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		driver.get("https://www.trendyol.com/");
		System.out.println("Login Page Title is: ");
	}

	@When("Popup kapatilir")
	public void Popup_kapatilir() {
		btn_PopupKapat.click();
		
	}

	@When("urun aranir")
	public void  urun_aranir() {
		element.clear();
		btn_UrunAra.sendKeys("msi");
	}

	@When("arama butonuna tiklanir")
	public void  arama_butonuna_tiklanir() {
		btn_AramaButonunaTýkla.click();
	}
	    
    @When("daha fazla goster")
    public void daha_fazla_goster() {
		btn_DahaFazlaGoster.click();
	}

	@When("Dongu olusturulur")
	public  void Dongu_olusturulur() {
		List<WebElement> elements = driver.findElements( btn_Listele );
		for (WebElement element : elements) {
			if (element.getText().equals("Masaüstü Bilgisayar")) {
				element.click();
				break;
			}
		}
	}

	@When("random urun secilir")
	public void random_urun_secilir() {
		btn_RandomUrunSec.click();

	}

	@When("Sepete eklenir")
	public void Sepete_eklenir() {
		btn_SepeteEkle.click();
	}
	
	@When("Sepete girilir")
	public void Sepete_girilir() {
		btn_SepeteGit.click();
	
	}
	@When("Sepete git tiklanir")
	public void Sepete_gir_tiklanir(){
		btn_SepeteGitTýkla.click();
	}

	@When("Sepet temizlenir")
	public void Sepet_temizlenir() {
		btn_SepetiTemizle.click();

	}

	@When("Sepetten sil secilir")
	public  void Sepetten_sil_secilir() {
		List<WebElement> elements =  driver.findElements(btn_SepetiSilTýkla);
		for (WebElement element : elements) {
			if (element.getText().equals("Sil")) {
				element.click();
				break;
			}
		}
	}

}
