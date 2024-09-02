package genericutilityorlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	
	public String readDataFromExcel(String sheetname,int rowNum, int cellNum) throws Exception, Exception {
		
		FileInputStream fis=new FileInputStream(IconstantUtility.ExcelPath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetname);
		DataFormatter format=new DataFormatter();
		String value=format.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
		return value;
		
		
	}
	public String writeDataFromExcel(String sheetname,int rowNum, int cellNum,String value) throws Exception, Exception {
	FileInputStream fis=new FileInputStream(IconstantUtility.ExcelPath);
	Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getSheet(sheetname);
	sh.createRow(rowNum).createCell(cellNum).setCellValue(value);
	FileOutputStream fos=new FileOutputStream(IconstantUtility.ExcelPath);
	book.write(fos);
	return value;
	}

}
