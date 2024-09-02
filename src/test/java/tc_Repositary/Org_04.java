package tc_Repositary;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import genericutilityorlib.BaseClass;
import genericutilityorlib.ExcelUtility;
import genericutilityorlib.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

public class Org_04 extends BaseClass{
	
	
	@Test(groups= {"regression"})
	public void org_04Case() throws Exception {
		

		JavaUtility jutil=new JavaUtility();
		int num=jutil.getRandomNumber(1000);
		ExcelUtility eutil=new ExcelUtility();
		
		String ORGNAME=eutil.readDataFromExcel("Organization", 11,1);
		String WEBSITE=eutil.readDataFromExcel("Organization", 11, 2);
		String EMPLOYEES=eutil.readDataFromExcel("Organization", 11, 3);
		String PHNO=eutil.readDataFromExcel("Organization", 11, 4);
		String OTHERPHN=eutil.readDataFromExcel("Organization", 11, 5);
		String EMAIL=eutil.readDataFromExcel("Organization", 11, 6);
		String BILLINGADRESS=eutil.readDataFromExcel("Organization", 11, 7);
		String BILLINGCITY=eutil.readDataFromExcel("Organization", 11, 8);
		String EBILLINGSTATE=eutil.readDataFromExcel("Organization", 11, 9);
		
		
		HomePage hp=new HomePage(driver);
		hp.clickOnOrg();
		
		OrgHomePage op=new OrgHomePage(driver);
		op.clickOnNewBtn();
		
		CreateNewOrgPage cp=new CreateNewOrgPage(driver);
		cp.createOrganisation(ORGNAME+num, WEBSITE, EMPLOYEES, PHNO, OTHERPHN, EMAIL, BILLINGADRESS, BILLINGCITY, EBILLINGSTATE);
		Thread.sleep(3000);
	}

}
