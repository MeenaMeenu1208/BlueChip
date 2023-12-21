package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.baseClass;

public class footerPage extends baseClass {
	
	@FindBy(xpath="//a [@class =\"btn btn-link\"][text()='About Us']")
	WebElement FAboutus;
	@FindBy(xpath="//a [@class =\"btn btn-link\"][text()='Contact Us']")
	WebElement FContactus;
	@FindBy(xpath="//a [@class =\"btn btn-link\"][text()='Our Services']")
	WebElement FServices;
	@FindBy(xpath="//a [@class =\"btn btn-link\"][text()='Terms & Condition']")
	WebElement FTandC;
	@FindBy(xpath="//a [@class =\"btn btn-link\"][text()='Support']")
	WebElement FSupport;
	@FindBy(xpath="//input [@placeholder=\"Your email\"]")
	WebElement Femail;
	@FindBy(xpath="//button [text()='SignUp']")
	WebElement FSignupbtn;
	
	@FindBy(className ="fab fa-twitter")
	WebElement FTwtlogo;
	@FindBy(className ="fab fa-facebook-f")
	WebElement FFblogo;
	@FindBy(className ="fab fa-youtube")
	WebElement FYTlogo;
	@FindBy(className ="fab fa-linkedin-in")
	WebElement FLInlogo;
	@FindBy(xpath ="//a [text()='BLUECHIP']")
	WebElement FBluechiplink;
	@FindBy(className ="bi bi-arrow-up")
	WebElement FUparrow;
	@FindBy(xpath="//a[text()='Merrys Info-Tech & New-Gen Educare']")
	WebElement FMinelink;
	@FindBy(xpath="//a [text()='Home']")
	WebElement Hhome;

	
	public footerPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void FAboutusPage() {
		clickOn(FAboutus);
	}
	public void FContactusPage() {
		clickOn(FContactus);
	}
	public void FServicesPage() {
		clickOn(FServices);
	}
	public void FTandCPage() {
		clickOn(FTandC);
	}
	public void FSupportPage() {
		clickOn(FSupport);
	}
	public void Femailentry(String email) {
		clickOn(Femail);
		type(Femail,email);
		clickOn(FSignupbtn);
	}
	
	public void FTwtlogoPage() {
		clickOn(FTwtlogo);
	}
	
	public void FFblogoPage() {
		clickOn(FFblogo);
	}
	
	public void FYTlogoPage() {
		clickOn(FYTlogo);
	}
	
	public void FLInlogoPage() {
		clickOn(FLInlogo);
	}
	
	public void FBluechiplinkPage() {
		clickOn(FBluechiplink);
	}
	
	public void FMinelinkPage() {
		clickOn(FMinelink);
	}
		
	public void gotoTopPage() {
		clickOn(FUparrow);
		Assert.assertTrue(Hhome.isDisplayed());
	}
		
	

}
