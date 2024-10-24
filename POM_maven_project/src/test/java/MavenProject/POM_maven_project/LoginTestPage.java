package MavenProject.POM_maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTestPage {
	public WebDriver driver;
	LoginPage lp;
	@BeforeMethod
	public void lanchBrowser() {
		driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		lp=new LoginPage(driver);
	}
@Test
public void VerifyLoginPage() {
	String actulValue=lp.getpageTitle();
	String ExpectValue="Admin area demo";
	Assert.assertEquals(actulValue, ExpectValue);
	System.out.println("u r in login page");
}
@Test
public void verifyloginFun() throws InterruptedException {
	lp.performLoging();
}
}
