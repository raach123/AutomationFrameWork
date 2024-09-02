package tc_Repositary;

import org.testng.annotations.Test;

import genericutilityorlib.BaseClass;
import genericutilityorlib.ExcelUtility;
import genericutilityorlib.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;

public class Org_01 extends BaseClass{
	
	@Test(groups= {"regression"})
	public void org_01Case() throws Exception {
		JavaUtility jutil=new JavaUtility();
		int num=jutil.getRandomNumber(1000);
		ExcelUtility eutil=new ExcelUtility();
		
		String ORGNAME=eutil.readDataFromExcel("Organization", 2,1);
		String WEBSITE=eutil.readDataFromExcel("Organization", 2, 2);
		String EMPLOYEES=eutil.readDataFromExcel("Organization", 2, 3);
		
		HomePage hp=new HomePage(driver);
		hp.clickOnOrg();
		
		OrgHomePage op=new OrgHomePage(driver);
		op.clickOnNewBtn();
		
		CreateNewOrgPage cp=new CreateNewOrgPage(driver);
		cp.createOrganisation(ORGNAME, WEBSITE, EMPLOYEES);
		Thread.sleep(4000);
		
		
	}
	

}
