package tc_Repositary;

import org.testng.annotations.Test;

import genericutilityorlib.BaseClass;
import genericutilityorlib.ExcelUtility;
import genericutilityorlib.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

public class Org_03 extends BaseClass{
	
	@Test(groups= {"regression"})
	public void org_03Case() throws Exception {
		
		JavaUtility jutil=new JavaUtility();
		int num=jutil.getRandomNumber(1000);
		ExcelUtility eutil=new ExcelUtility();
		
		String ORGNAME=eutil.readDataFromExcel("Organization", 8,1);
		String WEBSITE=eutil.readDataFromExcel("Organization", 8, 2);
		
		String BILLINGADRESS=eutil.readDataFromExcel("Organization", 8, 3);
		String BILLINGCITY=eutil.readDataFromExcel("Organization", 8, 4);
		String EBILLINGSTATE=eutil.readDataFromExcel("Organization", 8, 5);
		
		HomePage hp=new HomePage(driver);
		hp.clickOnOrg();
		
		OrgHomePage op=new OrgHomePage(driver);
		op.clickOnNewBtn();
		
		CreateNewOrgPage cp=new CreateNewOrgPage(driver);
		cp.createOrganisation(ORGNAME+num,  BILLINGADRESS, BILLINGCITY, EBILLINGSTATE, EBILLINGSTATE);
		Thread.sleep(3000);
		
	}

}
