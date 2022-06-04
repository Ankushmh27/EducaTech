package ethane.web.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Ethanstech.EthaneWeb.Sceenshot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ethans_web_cript extends Sceenshot{
    static WebDriver driver;
	@SuppressWarnings("deprecation")
	public static void OpenBrowser()
	{
    WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.ethans.co.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void SelectCource() throws IOException 
	{
	//classroom pro
	Actions action =new Actions(driver);
	WebElement classroomprogram=driver.findElement(By.id("menu-item-73"));   
	action.moveToElement(classroomprogram).perform();
	//select pune
	WebElement pune=driver.findElement(By.xpath("//a[text()='Pune']"));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	pune.click();
	Screenshot(driver, "../EthaneWeb/testScreenshots/ethanehome.png");
	//course select selenium
	WebElement sele=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div[2]/div[8]/div/div/div[3]/a"));
	sele.click();
	
	}
	public void Course_syllabus() throws IOException 
	{
	//syllybus
    Actions action =new Actions(driver);
	WebElement syllabus= driver.findElement(By.xpath("//a[text()=' Syllabus ']"));
	action.moveToElement(syllabus).perform();
	syllabus.click();
	Screenshot(driver, "../EthaneWeb/testScreenshots/syllabus.png");
	}
	public void Apisyllybus() throws IOException {
	//api syllabus
	Actions action =new Actions(driver);
	WebElement apitest=driver.findElement(By.xpath("//div[@id='syllabusheading-8']"));
	action.moveToElement( apitest).perform();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	apitest.click();
	Screenshot(driver, "../EthaneWeb/testScreenshots/Apisyl.png");
	driver.close();
	System.out.println("check rest api syllabus");
	}
	

}


