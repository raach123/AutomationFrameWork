package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsHomepage {

	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement createnewLeadBtn;
	
	public LeadsHomepage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
	}

	public WebElement getCreatenewLeadBtn() {
		return createnewLeadBtn;
	}
	
	public void clickOnNewLeadBtn() {
		createnewLeadBtn.click();
	}
	
}
