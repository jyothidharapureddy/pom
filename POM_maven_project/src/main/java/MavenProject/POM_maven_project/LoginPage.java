package MavenProject.POM_maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	@FindBy(id="Email")
	WebElement username;
	@FindBy(name="Password")
	WebElement Password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn;
	@FindBy(tagName = "h1")
	WebElement pageTitle;
	@FindBy (xpath="/html/body/div[3]/div[1]/div[1]/h1")
	WebElement Dashboard;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void performLoging() throws InterruptedException {
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("admin@yourstore.com");
		Password.clear();
		Thread.sleep(2000);
		Password.sendKeys("admin");
		loginbtn.click();
	}
 public String getpageTitle() {
	 return pageTitle.getText();
 }
 public String getDashboardTitle() {
	 return Dashboard.getText();
 }
}
