package samplepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SampleProp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Selenium folder\\A4CommonData.properties");
		Properties pro= new Properties();
		pro.load(fis);
		String URL=pro.getProperty("url");
		String UNAME=pro.getProperty("username");
		String PASS=pro.getProperty("password");
		
		System.out.println(URL);
		System.out.println(UNAME);
		System.out.println(PASS);
		System.out.println("khguyjff");
		

	}

}
