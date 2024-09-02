package tc_Repositary;

import org.testng.annotations.Test;

import genericutilityorlib.BaseClass;
import genericutilityorlib.ExcelUtility;
import genericutilityorlib.JavaUtility;
import objectRepository.CreateNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomepage;

public class LE_04 extends BaseClass{

	@Test
	public void le_04Case() throws Exception {
	    
		JavaUtility jut=new JavaUtility();
		int num=jut.getRandomNumber(1000);
		ExcelUtility eut=new ExcelUtility();
		String FIRSTNAME=eut.readDataFromExcel("Leads",11 , 1);
		String LASTNAME=eut.readDataFromExcel("Leads", 11, 2);
		String COMPANY=eut.readDataFromExcel("Leads", 11, 3);
		String STREET=eut.readDataFromExcel("Leads", 11, 4);
		String POBOX=eut.readDataFromExcel("Leads", 11, 5);
		String PCODE=eut.readDataFromExcel("Leads", 11, 6);
		String CITY=eut.readDataFromExcel("Leads", 11, 7);
		String STATE=eut.readDataFromExcel("Leads", 11, 8);
		String COUNTRY=eut.readDataFromExcel("Leads", 11, 9);
		
		
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomepage lp=new LeadsHomepage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadPage cn=new CreateNewLeadPage(driver);
		cn.createLeads(FIRSTNAME, LASTNAME, COMPANY, STREET, POBOX, PCODE, CITY, COUNTRY, STATE);
		Thread.sleep(3000);
	}
}
