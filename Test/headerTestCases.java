package Test;

import org.testng.annotations.Test;

import Base.baseClass;
import Pages.headerPage;


public class headerTestCases extends baseClass {
	headerPage HDP = new headerPage();	
	
    @Test
    public void TC_HeaderPage001() throws Exception {
		HDP.HLogoPage();
		String exptitle1 = "Bluechip | Pursuing Education Abroad";
		titleAssertion(exptitle1);
		Thread.sleep(3000);
	}
    
    @Test
    public void TC_HeaderPage002() throws Exception {
		HDP.HhomePage();
		String exptitle1 = "Bluechip | Pursuing Education Abroad";
		titleAssertion(exptitle1);
		Thread.sleep(3000);
	}
    
    @Test
    public void TC_HeaderPage003() throws Exception {
    	HDP.HAboutusPage();
		String exptitle1 = "Bluechip | About Us";
		titleAssertion(exptitle1);
		Thread.sleep(3000);
	}
    
    @Test
    public void TC_HeaderPage004() throws Exception {
    	HDP.HStudymbbsPage();
		String exptitle1 = "Bluechip | Study in MBBS";
		titleAssertion(exptitle1);
		Thread.sleep(3000);
	}
    
    @Test
    public void TC_HeaderPage005() throws Exception {
    	HDP.HStudyDestPage();
		String exptitle1 = "Bluechip | Study Destination";
		titleAssertion(exptitle1);
		Thread.sleep(3000);
	}
    
    @Test
    public void TC_HeaderPage006() throws Exception {
    	HDP.HServicesPage();
		String exptitle1 = "Bluechip | Services";
		titleAssertion(exptitle1);
		Thread.sleep(3000);
	}
    
    @Test
    public void TC_HeaderPage007() throws Exception {
    	HDP.HEventsPage();
		String exptitle1 = "Bluechip | Our Events";
		titleAssertion(exptitle1);
		Thread.sleep(3000);
	}
    
    @Test
    public void TC_HeaderPage008() throws Exception {
    	HDP.HContactPage();
		String exptitle1 = "Bluechip | Contact Us";
		titleAssertion(exptitle1);
		Thread.sleep(3000);
	}
    
    @Test
    public void TC_HeaderPage009() throws Exception {
    	HDP.HContactPage();
		Thread.sleep(3000);
	}
    
    
    

}
