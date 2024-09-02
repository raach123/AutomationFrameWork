package genericutilityorlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectRepository.HomePage;
import objectRepository.LoginPage;

public class BaseClass {
	public static WebDriver driver=null;
	Seleniumutility sut=null;
	Propertiesutility put=new Propertiesutility();
	
	@BeforeSuite(alwaysRun=true)
	public void createConnection() {
		System.out.println("connection established");
		
	}
	
	@BeforeClass(alwaysRun=true)
	public void launchBrowser() throws Exception {
	String URL=	put.getDataFromProperties("url");
	sut=new Seleniumutility();
	driver=new ChromeDriver();
	driver.get(URL);
	sut.implicitWait(driver,10);
	sut.maximizeWindow(driver);
		
	}
	
	@BeforeMethod(alwaysRun=true)
	public void loginApp() throws Exception {
		String USERNAME=put.getDataFromProperties("username");
		String PASSWORD=put.getDataFromProperties("password");
		LoginPage lp= new LoginPage(driver);
		lp.LoginOperation(USERNAME, PASSWORD);
		System.out.println("login sucessfull");
		
	}
	
	@AfterMethod(alwaysRun=true)
	public void logoutApp() throws Exception {
		HomePage hp=new HomePage(driver);
		hp.logoutOpretaion(driver);
		System.out.println("logout sucessfull");
		
	}
	
	@AfterClass(alwaysRun=true)
	public void closeApp() {
		driver.close();
		System.out.println("browser closed sucessfully");
		
	}

	@AfterSuite(alwaysRun=true)
	public void closeConnection() {
		System.out.println("connection closed seccessfull");
		
	}
}
