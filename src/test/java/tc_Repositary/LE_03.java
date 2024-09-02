package tc_Repositary;

import org.testng.annotations.Test;

import genericutilityorlib.BaseClass;
import genericutilityorlib.ExcelUtility;
import genericutilityorlib.JavaUtility;
import objectRepository.CreateNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomepage;

public class LE_03 extends BaseClass{
	
	@Test
	public void le_03Case() throws Exception {
		JavaUtility jut=new JavaUtility();
		int num=jut.getRandomNumber(1000);
		ExcelUtility eut=new ExcelUtility();
		String FIRSTNAME=eut.readDataFromExcel("Leads",8 , 1);
		String LASTNAME=eut.readDataFromExcel("Leads", 8, 2);
		String COMPANY=eut.readDataFromExcel("Leads", 8, 3);
		String TITLE=eut.readDataFromExcel("Leads", 8, 4);
		String PHONE=eut.readDataFromExcel("Leads", 8, 5);
		String MOBILE=eut.readDataFromExcel("Leads", 8, 6);
		String EMAIL=eut.readDataFromExcel("Leads", 8, 7);
		String NOF=eut.readDataFromExcel("Leads", 8, 8);
		
		
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomepage lp=new LeadsHomepage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadPage cn=new CreateNewLeadPage(driver);
		cn.createLeads(FIRSTNAME, LASTNAME, COMPANY, TITLE, PHONE, MOBILE, EMAIL, NOF);
		Thread.sleep(3000);
		
	}

}
