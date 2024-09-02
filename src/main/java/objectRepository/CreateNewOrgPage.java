package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrgPage {
	
	@FindBy(xpath="//input[@name=\"accountname\"]")
	private WebElement orgName;
	
	@FindBy(xpath="//input[@name=\"website\"]")
	private WebElement webSite;
	
	@FindBy(xpath="//input[@name=\"employees\"]")
    private WebElement employees;
	
	@FindBy(xpath="//input[@name=\"phone\"]")
	private WebElement phn;
	
	@FindBy(xpath="//input[@name=\"otherphone\"]")
	private WebElement otherPhn;
	
	@FindBy(xpath="//input[@name=\"email1\"]")
	private WebElement email;
	
	@FindBy(xpath="//textarea[@name=\"bill_street\"]")
	private WebElement billingAdress;
	
	@FindBy(xpath="//input[@name=\"bill_city\"]")
	private WebElement billingCity;
	
	@FindBy(xpath="//input[@name=\"bill_state\"]")
	private WebElement billingState;
	
	@FindBy(xpath="(//input[@class=\"crmbutton small save\"])[2]")
	private WebElement saveBtn;
	

	public CreateNewOrgPage(WebDriver driver) {
	  PageFactory.initElements(driver,this);
	}

	public WebElement getOrgName() {
		return orgName;
	}

	public WebElement getWebSite() {
		return webSite;
	}

	public WebElement getEmployees() {
		return employees;
	}

	public WebElement getPhn() {
		return phn;
	}

	public WebElement getOtherPhn() {
		return otherPhn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getBillingAdress() {
		return billingAdress;
	}

	public WebElement getBillingCity() {
		return billingCity;
	}

	public WebElement getBillingState() {
		return billingState;
	}
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	public void createOrganisation(String organisationName, String web , String emp) {
		
		orgName.sendKeys(organisationName);
		webSite.sendKeys(web);
		employees.sendKeys(emp);
		saveBtn.click();
		
	}
	
    public void createOrganisation(String organisationName, String web , String emp , String phoneNumber, String otherPhone,String mailId) {
		
		orgName.sendKeys(organisationName);
		webSite.sendKeys(web);
		employees.sendKeys(emp);
		phn.sendKeys(phoneNumber);
		otherPhn.sendKeys(otherPhone);
		email.sendKeys(mailId);
		saveBtn.click();
		
	}
    
  public void createOrganisation(String organisationName, String web , String billadd, String billcity,String billstate) {
		
		orgName.sendKeys(organisationName);
		webSite.sendKeys(web);
		billingAdress.sendKeys(billadd);
		billingCity.sendKeys(billcity);
		billingState.sendKeys(billstate);
		saveBtn.click();
		
	}
    
  public void createOrganisation(String organisationName, String web , String emp , String phoneNumber, String otherPhone,String mailId, String billadd, String billcity,String billstate) {
		
		orgName.sendKeys(organisationName);
		webSite.sendKeys(web);
		employees.sendKeys(emp);
		phn.sendKeys(phoneNumber);
		otherPhn.sendKeys(otherPhone);
		email.sendKeys(mailId);
		billingAdress.sendKeys(billadd);
		billingCity.sendKeys(billcity);
		billingState.sendKeys(billstate);
		saveBtn.click();
		
	}
	

}
