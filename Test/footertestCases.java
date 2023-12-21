package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.baseClass;
import Pages.footerPage;

public class footertestCases extends baseClass {
	footerPage FDP = new footerPage();
	
	
	  @Test
	    public void TC_footerPage001() throws InterruptedException {
		  FDP.FAboutusPage();
			String exptitle1 = "Bluechip | About Us";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	  
	  @Test
	    public void TC_footerPage002() throws InterruptedException {
		  FDP.FContactusPage();
			String exptitle1 = "Bluechip | Contact Us";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	  
	  @Test
	    public void TC_footerPage003() throws InterruptedException {
		  FDP.FServicesPage();
			String exptitle1 = "Bluechip | Services";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	  
	  @Test
	    public void TC_footerPage004() throws InterruptedException {
		  FDP.FTandCPage();
			String exptitle1 = "Bluechip | Terms and Conditions";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	  
	  @Test
	    public void TC_footerPage005() throws InterruptedException {
		  FDP.FSupportPage();
			String exptitle1 = "Bluechip | Support";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	  
	  
	    @BeforeTest
	    public void declareSheetName() {
	        sheetName = "Footer";
	    }
	  
	  @Test(dataProvider = "BluChipExcelData")
	    public void TC_footerPage006(String email) throws InterruptedException {
		  FDP.Femailentry(email);
		}
	  
	  @Test
	    public void TC_footerPage007() throws InterruptedException {
		  FDP.FTwtlogoPage();
			String exptitle1 = "Bluechip | Twitter";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	  
	  @Test
	    public void TC_footerPage008() throws InterruptedException {
		  FDP.FFblogoPage();
			String exptitle1 = "Bluechip | Facebook";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	  
	  @Test
	    public void TC_footerPage009() throws Exception {
		  FDP.FYTlogoPage();
			String exptitle1 = "Bluechip | YouTube";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	  @Test
	    public void TC_footerPage010() throws Exception {
		  FDP.FLInlogoPage();
			String exptitle1 = "Bluechip | linkedIn";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	  
	  @Test
	    public void TC_footerPage011() throws Exception {
		  FDP.FBluechiplinkPage();
			String exptitle1 = "Bluechip | Home";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	  
	  @Test
	    public void TC_footerPage012() throws Exception {
		  FDP.FMinelinkPage();
			String exptitle1 = "Home-Merry's Info-tech New-Gen Educare";
			titleAssertion(exptitle1);
			Thread.sleep(3000);
		}
	  
	  @Test
	    public void TC_footerPage013() throws Exception {
		  FDP.gotoTopPage();
			
		}
	  
	
	  
	  

}
