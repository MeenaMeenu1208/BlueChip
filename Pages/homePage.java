package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Base.baseClass;

public class homePage extends baseClass {
	
	@FindBy(xpath ="//span [text()='Previous']")
	WebElement HMleftarrow;
	@FindBy(xpath ="//span [text()='Next']")
	WebElement HMrightarrow;
	@FindBy(className ="btn btn-primary py-2 px-3 animated slideInDown")
	WebElement HMbookdemobtn;
	@FindBy(xpath ="/html/body/div[5]/div/div[1]/div/a")
	WebElement HMstudyDest;
	@FindBy(xpath ="/html/body/div[8]/div/div/div[2]/div[1]/i")
	WebElement HMfbleftarrow;
	@FindBy(className ="/html/body/div[8]/div/div/div[2]/div[2]/i")
	WebElement HMfbrightarrow;

}
