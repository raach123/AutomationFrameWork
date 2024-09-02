package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * this is the pom class for creating lead 
 */
public class OrgHomePage {
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement neworgBtn;

	public OrgHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getNeworgBtn() {
		return neworgBtn;
	}
	
	/**
	 * this is the business lib to click on org btn
	 */
	
	public void clickOnNewBtn() {
		neworgBtn.click();
	}
	
	
	

}
