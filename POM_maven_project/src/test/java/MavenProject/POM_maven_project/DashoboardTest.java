package MavenProject.POM_maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class DashoboardTest {
	public WebDriver driver;
	LoginPage lp;
	DashboradPage dp;
@BeforeMethod
	public void lanchBrowser() {
		driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
				lp=new LoginPage(driver);
				dp=new DashboradPage(driver);
				
				
	}
 public void VerifyDashboardpageTitle() {
	 WebElement actualValue= dp.DashboardTitle;
	 String execptedValue="Dashboard";
	 Assert.assertEquals(actualValue, execptedValue);
	 System.out.println(" you are in dashborad page");
 }
 	 
	 
 }
 
	



