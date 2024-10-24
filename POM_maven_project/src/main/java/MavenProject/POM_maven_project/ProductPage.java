package MavenProject.POM_maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	public WebDriver driver;
	@FindBy(xpath="//h1[contains(text(),'Products')]")
WebElement ProductPageTitle; 
	@FindBy(id="SearchProductName")
	WebElement ProductNameFiled;
	@FindBy(id="search-products")
	WebElement searchBtn;
	public ProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this );
	}
	public String VerifyPageTitle() {
    	return ProductPageTitle.getText();
    }
    
	public void VerifySearchProduct(String pName) {
    	ProductNameFiled.sendKeys(pName);
    	searchBtn.click();
    	}
    



	

}
