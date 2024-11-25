package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingBasics 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		String xlFileName="D:\\Practise\\TestData.xlsx";
		String SheetName= "Login";
		System.out.println("starts");
		
		File file= new File(xlFileName);
		FileInputStream fis= new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh= wb.getSheet(SheetName);
//		System.out.println("rowno="+rowNo+",colno="+colNo);
		String data00 =sh.getRow(0).getCell(0).toString();
		System.out.println("data00="+data00);
		
		String data01 =sh.getRow(0).getCell(1).toString();
		System.out.println("data01="+data01);
		
		// if 3rd cell is not there
//		String data02 =sh.getRow(0).getCell(2).toString();
//		System.out.println("data02="+data02);
		//java.lang.NullPointerException: Cannot invoke "Object.toString()" because the return value of "org.apache.poi.ss.usermodel.Row.getCell(int)" is null
		
		
		String data10 =sh.getRow(1).getCell(0).toString();
		System.out.println("data10="+data10);
		
		String data11 =sh.getRow(1).getCell(1).toString();
		System.out.println("data11="+data11);
		
		
		// get rows cnt
		int RowNo= sh.getLastRowNum();	
		System.out.println("RowNo="+RowNo);// returns  3   but actual we have actual rows =4 in excel
		
		
		// get columns cnt		
		int ColCnt= sh.getRow(0).getLastCellNum();
		System.out.println("Col cnt= "+ColCnt);
		
				
	}

}
