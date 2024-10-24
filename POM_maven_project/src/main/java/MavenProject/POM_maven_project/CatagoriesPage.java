package MavenProject.POM_maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatagoriesPage {
	public WebDriver driver;
	@FindBy(xpath="//i[@class=\"nav-icon fas fa-book\"]")
			WebElement CatalogLink;
	@FindBy(xpath="//a[@href=\"/Admin/Category/List\"]")
	WebElement Categorylink;
	@FindBy(xpath="//h1[@class=\"float-left\"]")
	WebElement Categoriestitle;
	@FindBy(xpath="//input[@id='SearchCategoryName']")
	WebElement SearchCategoryName;
@FindBy(xpath="//button[@id='search-categories']")
WebElement searchcategoryButton;

 public void CatagoriesPage(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
}
	public String VerifyCategoriestitlePage() {
		 return Categoriestitle.getText();
		}
	public void VerifySearchCategoryName(String Cname) {
	
	SearchCategoryName.sendKeys(Cname);
	searchcategoryButton.click();
}

}