package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base.baseClass;

public class headerPage extends baseClass {
	@FindBy(xpath="//img [@alt=\"logo\"]")
	WebElement HLogo;
	@FindBy(xpath="//a [text()='Home']")
	WebElement Hhome;
	@FindBy(xpath="//a [text()='About Us']")
	WebElement HAboutus;
	@FindBy(xpath="//a [text()='Study MBBS/PG']")
	WebElement HStudymbbs;
	@FindBy(xpath="//a [text()='Study Destination']")
	WebElement HStudyDest;
	@FindBy(xpath="//a [text()='Services']")
	WebElement HServices;
	@FindBy(xpath="//a [text()='Events']")
	WebElement HEvents;
	@FindBy(xpath="//a [text()='Contact']")
	WebElement HContact;
	@FindBy(xpath="//a [text()='Get Started']")
	WebElement HGetStarted;
	@FindBy(xpath="//div [text()='                 Study Abroad             ']")
	WebElement StudyAbroadPage;
	
	
	
	public headerPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void HLogoPage() {
		clickOn(HLogo);
	}
	public void HhomePage() {
		clickOn(Hhome);
	}
	public void HAboutusPage() {
		clickOn(HAboutus);
	}
	public void HStudymbbsPage() {
		clickOn(HStudymbbs);
	}
	public void HStudyDestPage() {
		clickOn(HStudyDest);
	}
	public void HServicesPage() {
		clickOn(HServices);
	}
	public void HEventsPage() {
		clickOn(HEvents);
	}
	public void HContactPage() {
		clickOn(HContact);
	}
	
	public void HGetStartedPage() {
		clickOn(HGetStarted);
		Assert.assertTrue(StudyAbroadPage.isDisplayed());
	}
	
		
		
}
		

	
	

