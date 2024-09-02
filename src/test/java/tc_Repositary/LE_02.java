package tc_Repositary;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericutilityorlib.BaseClass;
import genericutilityorlib.ExcelUtility;
import genericutilityorlib.JavaUtility;
import objectRepository.CreateNewLeadPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomepage;

@Listeners(genericutilityorlib.ListnerImplementationClass.class)
public class LE_02 extends BaseClass{
	
	@Test
	public void le_02Case() throws Exception {
		JavaUtility jut=new JavaUtility();
		int num=jut.getRandomNumber(1000);
		ExcelUtility eut=new ExcelUtility();
		String FIRSTNAME=eut.readDataFromExcel("Leads",5 , 1);
		String LASTNAME=eut.readDataFromExcel("Leads", 5, 2);
		String COMPANY=eut.readDataFromExcel("Leads", 5, 3);
		String TITLE=eut.readDataFromExcel("Leads", 5, 4);
		String PHONE=eut.readDataFromExcel("Leads", 5, 5);
		String MOBILE=eut.readDataFromExcel("Leads", 5, 6);
		String EMAIL=eut.readDataFromExcel("Leads", 5, 7);
		String NOF=eut.readDataFromExcel("Leads", 5, 8);
		String STREET=eut.readDataFromExcel("Leads", 5, 9);
		String POBOX=eut.readDataFromExcel("Leads", 5, 10);
		String PCODE=eut.readDataFromExcel("Leads", 5, 11);
		String CITY=eut.readDataFromExcel("Leads", 5, 12);
		String STATE=eut.readDataFromExcel("Leads", 5, 13);
		String COUNTRY=eut.readDataFromExcel("Leads", 5, 14);
		
		
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomepage lp=new LeadsHomepage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadPage cn=new CreateNewLeadPage(driver);
		cn.createLeads(FIRSTNAME, LASTNAME, COMPANY, TITLE, PHONE, MOBILE, EMAIL, NOF, STREET, POBOX, PCODE, CITY, COUNTRY, STATE);
		Thread.sleep(3000);
	}

}
