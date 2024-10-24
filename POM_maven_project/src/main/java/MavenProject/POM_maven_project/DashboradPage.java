package MavenProject.POM_maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class DashboradPage {
	public WebDriver driver;
	@FindBy(xpath="//h1[contains(text(),'Dashboard')]")
	WebElement DashboardTitle;
	@FindBy(xpath="//a[@href='/logout']")
	WebElement logout;
	@FindBy(xpath="class=\"nav-icon fas fa-book\"")
	WebElement catalog;
	@FindBy(xpath="//a[@href=\"/Admin/Product/List\"]")
	WebElement productlink;
	@FindBy(xpath="//a[@href=\"/Admin/Category/List\"]")
	WebElement catagorieslink;
	@FindBy(xpath="//a[@href=\"/Admin/Manufacturer/List\"]")
	WebElement Manufacturerlink;
	@FindBy(xpath="//a[@href=\"/Admin/ProductReview/List\"]")
	WebElement ProductReview;
	@FindBy(xpath="//a[@href=\"/Admin/Product/ProductTags\"]")
	WebElement ProductTags;
	@FindBy(xpath="//p[contains(text(),'Attributes')]")
	WebElement Attributes;
	
	public DashboradPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this );
		}
       public void logoutFuntion() {
		logout.click();
		}
       public String VerifyDashboardpageTitle() {
    	   String data=DashboardTitle.getText();
    	   return data;
       }
	
public void productlink() throws InterruptedException {
	catalog.click();
	Thread.sleep(2000);
	productlink.click();
}
public void catagorieslink() throws InterruptedException {
	catalog.click();
	Thread.sleep(2000);
	catagorieslink.click();
}
public void Manufacturerlink() throws InterruptedException {
	catalog.click();
	Thread.sleep(2000);
	Manufacturerlink.click();
	}
public void ProductReview() throws InterruptedException {
	catalog.click();
	Thread.sleep(2000);
	ProductReview.click();
	}
public void ProductTags() throws InterruptedException {
	catalog.click();
	Thread.sleep(2000);
	ProductTags.click();
	}
public void Attributes() throws InterruptedException {
	catalog.click();
	Thread.sleep(2000);
	Attributes.click();
	
	
}

	}

 
