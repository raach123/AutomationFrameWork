package tc_Repositary;

import org.testng.annotations.Test;

import genericutilityorlib.BaseClass;
import genericutilityorlib.ExcelUtility;
import genericutilityorlib.JavaUtility;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;




public class Org_02 extends BaseClass{
	
	@Test(groups= {"regression"})
	public void org_02Case() throws Exception {
	
	JavaUtility jutil=new JavaUtility();
	int num=jutil.getRandomNumber(1000);
	ExcelUtility eutil=new ExcelUtility();
	
	String ORGNAME=eutil.readDataFromExcel("Organization", 5,1);
	String WEBSITE=eutil.readDataFromExcel("Organization", 5, 2);
	String EMPLOYEES=eutil.readDataFromExcel("Organization", 5, 3);
	String PHNO=eutil.readDataFromExcel("Organization", 5, 4);
	String OTHERPHN=eutil.readDataFromExcel("Organization", 5, 5);
	String EMAIL=eutil.readDataFromExcel("Organization", 5, 6);
	
	HomePage hp=new HomePage(driver);
	hp.clickOnOrg();
	
	OrgHomePage op=new OrgHomePage(driver);
	op.clickOnNewBtn();
	
	CreateNewOrgPage cp=new CreateNewOrgPage(driver);
	cp.createOrganisation(ORGNAME+num, WEBSITE, EMPLOYEES, PHNO, OTHERPHN, EMAIL);
	Thread.sleep(3000);
	
	}

}
