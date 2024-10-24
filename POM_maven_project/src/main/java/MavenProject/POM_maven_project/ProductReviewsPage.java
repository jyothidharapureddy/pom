package MavenProject.POM_maven_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductReviewsPage {
	public WebDriver driver;
	@FindBy(xpath="//a[@href=\"/Admin/ProductReview/List\"]")
	WebElement ProductReviewsPageLink;
	@FindBy(xpath="//h1[contains(text(),'Product reviews')]")
	WebElement ProductReviewsPageTitle;
	@FindBy(xpath="//input[@id=\"CreatedOnFrom\"]")
	WebElement SearchProductReviewsField;
	@FindBy(xpath="//button[@id=\"search-productreviews\"]")
	WebElement SearchProductReviwesButton;
	public  ProductReviewsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	public String VerifyProductReviewsPageTitle() {
	return   ProductReviewsPageTitle.getText();
	}
	public void VerifySearchProductReviewsField( String PReviewsField) {
	 SearchProductReviewsField.sendKeys(PReviewsField);
		SearchProductReviwesButton.click();
	}
}
