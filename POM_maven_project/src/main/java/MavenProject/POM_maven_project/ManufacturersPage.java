package MavenProject.POM_maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManufacturersPage {
	
public WebDriver driver;
@FindBy(xpath="//p[contains(text(),'Manufacturers')]")
WebElement ManufacturersLink;
@FindBy(xpath="//h1[contains(text(),'Manufacturers')]")
WebElement ManufacturersTitle;
@FindBy(xpath="//input[@id='SearchManufacturerName']")
WebElement SearchManufacturerName;
@FindBy(xpath="//button[@id=\"search-manufacturers\"]")
WebElement SearchManufacturerButton;
public void ManufacturersPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public String ManufacturersTitle() {
	String data=ManufacturersTitle.getText();
	return data;
}
public void SearchButtonFuntion(String pManufacturers ) {
	SearchManufacturerName.sendKeys(pManufacturers);
	SearchManufacturerButton.click();
	
	}
}
