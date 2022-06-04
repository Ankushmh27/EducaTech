package ethane.web.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ethans_web_Testcript extends ethans_web_cript {
	/*open ethans app
	 * select pune Automation course
	 * check Automation syllabus
	 */
	WebDriver driver; 
   @BeforeSuite
   public void openEthansApp() 
   {
	   OpenBrowser();	
	   System.out.println("Open Ethans app ");
   }
   @Test(priority = 1,groups= {"RegressionTest"},enabled=true)
    public void puneclass() throws IOException
   {
    	SelectCource();
    	System.out.println("go to pune class And select automation Course");
   }	
	@Test(priority = 2,groups= {"SokeTest"},enabled=true)
   public void Automation_syllabus() throws IOException
   {
	   Course_syllabus();
	   System.out.println("check course syllabus");
   }
   @AfterSuite
   public void Api_syllabus() throws IOException 
   {
	   Apisyllybus();
	   System.out.println("Api syllabus check and close browser"); 
   }

}
