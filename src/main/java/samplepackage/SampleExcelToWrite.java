package samplepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericutilityorlib.IconstantUtility;

public class SampleExcelToWrite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream(IconstantUtility.ExcelPath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		sh.createRow(9).createCell(5).setCellValue("ironMan");
		FileOutputStream fos=new FileOutputStream(IconstantUtility.ExcelPath);
		book.write(fos);

	}

}
