package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingBasics2 
{

	public int getRowsCnt(String xlFilePath, String sheetName) throws EncryptedDocumentException, IOException
	{
		File f = new File(xlFilePath);
		FileInputStream fis=  new FileInputStream(f);		
		Workbook  wb=  WorkbookFactory.create(fis);
		
		int rowsCnt= wb.getSheet(sheetName).getLastRowNum();
		return rowsCnt;
	}
	
	
	public int getColsCnt(String xlFilePath, String sheetName) throws EncryptedDocumentException, IOException
	{
		File f = new File(xlFilePath);
		FileInputStream fis=  new FileInputStream(f);		
		Workbook  wb=  WorkbookFactory.create(fis);
		
		int colCnt= wb.getSheet(sheetName).getRow(0).getLastCellNum();
		return colCnt;
	}
	
	public  String readDataFromExcel(String xlFilePath, String sheetName, int rowNo,int cellNo) throws EncryptedDocumentException, IOException
	{
		File f = new File(xlFilePath);
		FileInputStream fis=  new FileInputStream(f);		
		Workbook  wb=  WorkbookFactory.create(fis);
		
		String CellData= wb.getSheet(sheetName).getRow(rowNo).getCell(cellNo).toString();
		return CellData;
	}
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		String xlFileName="D:\\Practise\\TestData.xlsx";
		String SheetName= "Login";
		System.out.println("starts");
	
		// 
		ExcelReadingBasics2  xl=  new ExcelReadingBasics2();
		
		int Rowscnt= xl.getRowsCnt(xlFileName, SheetName);
		System.out.println("Rowscnt="+Rowscnt);// 3 
		
		
		int colcnt= xl.getColsCnt(xlFileName, SheetName);
		System.out.println("colcnt="+colcnt);// 2
		
		String cellData = xl.readDataFromExcel(xlFileName, SheetName, 0, 0);
		System.out.println("cellData 00="+cellData);
		
		cellData = xl.readDataFromExcel(xlFileName, SheetName, 0, 0);
		System.out.println("cellData 00="+cellData);
		
		//
		cellData = xl.readDataFromExcel(xlFileName, SheetName, 3, 1);
		System.out.println("cellData 31="+cellData);
		
			
				
	}

}
