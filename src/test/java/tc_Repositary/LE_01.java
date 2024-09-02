package tc_Repositary;

import org.testng.annotations.Test;

import genericutilityorlib.BaseClass;
import genericutilityorlib.ExcelUtility;
import genericutilityorlib.JavaUtility;
import genericutilityorlib.RetryAnalyzerImplimentationClass;
import objectRepository.CreateNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomepage;


public class LE_01 extends BaseClass {
	
	@Test(retryAnalyzer=genericutilityorlib.RetryAnalyzerImplimentationClass.class)
	public void le_01Case() throws Exception {
		JavaUtility jut=new JavaUtility();
		int num=jut.getRandomNumber(1000);
		ExcelUtility eut=new ExcelUtility();
		
		String FIRSTNAME=eut.readDataFromExcel("Leads", 2, 1);
		String LASTNAME=eut.readDataFromExcel("Leads", 2, 2);
		String COMPANY=eut.readDataFromExcel("Leads", 2, 3);
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		
		LeadsHomepage lp=new LeadsHomepage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadPage cn=new CreateNewLeadPage(driver);
		cn.createLeads(FIRSTNAME, LASTNAME, COMPANY);
		Thread.sleep(4000);
	}

}
