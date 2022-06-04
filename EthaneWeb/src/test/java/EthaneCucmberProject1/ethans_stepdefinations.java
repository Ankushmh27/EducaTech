package EthaneCucmberProject1;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ethans_stepdefinations{
	//public WebDriver driver;
	@Given("^open Ethan app$")
	public void open_ethan_app()
	{
//     	WebDriverManager.chromedriver().setup();
//	    driver=new ChromeDriver();
//		driver.get("https://www.ethans.co.in/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("ethane app");
	}


	@Then("^go to pune classes$")
	public void go_to_pune_classes() 
	{
	System.out.println("pune class");	
	}


	@And("^check automation testing syllabus$")
	public void check_automation_testing_syllabus()
	{
	System.out.println("Syllabus"); 	 
	}



	@Then("^check api syllabus$")
	public void check_api_syllabus()
	{
	System.out.println("Api syllabus");	
	}


}
