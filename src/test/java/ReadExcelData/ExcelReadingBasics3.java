package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadingBasics3 
{
	public static String xlFilePath="D:\\Practise\\TestData.xlsx";
	public File f;
	public FileInputStream fis;
	public static Workbook  wb;

	public ExcelReadingBasics3() throws EncryptedDocumentException, IOException
	{
		
		f = new File(xlFilePath);
		fis=  new FileInputStream(f);
		wb=  WorkbookFactory.create(fis);
	}

	public static int getRowsCnt(String xlFilePath, String sheetName) throws EncryptedDocumentException, IOException
	{
		File f = new File(xlFilePath);
		FileInputStream fis=  new FileInputStream(f);		
		Workbook  wb=  WorkbookFactory.create(fis);

		int rowsCnt= wb.getSheet(sheetName).getLastRowNum();
		rowsCnt=rowsCnt+1;
		System.out.println("Rows cnt="+rowsCnt);
		return rowsCnt;//  0 to 3  --but actual cnt -- 4
	}

	public static int getRowsCnt( String sheetName) throws EncryptedDocumentException, IOException
	{
		//File f = new File(xlFilePath);
		//FileInputStream fis=  new FileInputStream(f);		
		//Workbook  wb=  WorkbookFactory.create(fis);
		System.out.println("wb="+wb + "-->,sheet Name="+sheetName );
		int rowsCnt= wb.getSheet(sheetName).getLastRowNum();
		rowsCnt=rowsCnt+1;
		System.out.println("Rows cnt="+rowsCnt);
		return rowsCnt;//  0 to 3  --but actual cnt -- 4
	}


	public static int getColsCnt(String xlFilePath, String sheetName) throws EncryptedDocumentException, IOException
	{
		File f = new File(xlFilePath);
		FileInputStream fis=  new FileInputStream(f);		
		Workbook  wb=  WorkbookFactory.create(fis);

		int colCnt= wb.getSheet(sheetName).getRow(0).getLastCellNum();
		return colCnt;// colcnt=2 ,.. actula cnt ==2
	}

	// readDataFromExcel("xlFilePath"  ,"Login",1,1);
	//      1,2
	public  static String readDataFromExcel(String xlFilePath, String sheetName, int rowNo,int cellNo) throws EncryptedDocumentException, IOException
	{
		File f = new File(xlFilePath);
		FileInputStream fis=  new FileInputStream(f);		
		Workbook  wb=  WorkbookFactory.create(fis);

		//   0 , 0
		//   0, 1
		String CellData= wb.getSheet(sheetName).getRow(rowNo-1).getCell(cellNo-1).toString();
		return CellData;
	}

	public static Hashtable<String, String> readDataintoHashTable(String xlFilePath, String sheetName) throws EncryptedDocumentException, IOException
	{
		Hashtable<String, String> hTable = new Hashtable<String, String>();
		String col1Data, col2Data;
		int rowsCnt= getRowsCnt(xlFilePath, sheetName);
		int colsCnt= getColsCnt(xlFilePath, sheetName);
		for(int i=1;i<=rowsCnt;i++)
		{			
			col1Data = readDataFromExcel(xlFilePath, sheetName, i, 1);
			col2Data = readDataFromExcel(xlFilePath, sheetName, i, 2);
			System.out.println("col1Data="+col1Data +",col2Data="+col2Data);
			// 1,1   1,2
			// 2,1  ,2,2
			hTable.put(col1Data, col2Data);
		}
		System.out.println("hash table data="+hTable);
		return hTable;		
	}

	public static Hashtable<String, String> readDataintoHashTable(String sheetName) throws EncryptedDocumentException, IOException
	{
		Hashtable<String, String> hTable = new Hashtable<String, String>();
		String col1Data, col2Data;
		int rowsCnt= getRowsCnt(xlFilePath, sheetName);
		int colsCnt= getColsCnt(xlFilePath, sheetName);
		for(int i=1;i<=rowsCnt;i++)
		{			
			col1Data = readDataFromExcel(xlFilePath, sheetName, i, 1);
			col2Data = readDataFromExcel(xlFilePath, sheetName, i, 2);
			System.out.println("col1Data="+col1Data +",col2Data="+col2Data);
			// 1,1   1,2
			// 2,1  ,2,2
			hTable.put(col1Data, col2Data);
		}
		System.out.println("hash table data="+hTable);
		return hTable;		
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		String xlFileName="D:\\Practise\\TestData.xlsx";
		String SheetName= "Login";
		System.out.println("starts");

		// 
		ExcelReadingBasics3  xl=  new ExcelReadingBasics3();

		int Rowscnt= xl.getRowsCnt(xlFileName, SheetName);
		System.out.println("Rowscnt="+Rowscnt);// 3 


		int colcnt= xl.getColsCnt(xlFileName, SheetName);
		System.out.println("colcnt="+colcnt);// 2


		String cellData11 = xl.readDataFromExcel(xlFileName, SheetName, 1, 1);
		System.out.println("cellData 11="+cellData11);

		String cellData12= xl.readDataFromExcel(xlFileName, SheetName, 1, 2);
		System.out.println("cellData12="+cellData12);


		// get  all rows  and all cells data
		System.out.println("****** get  all rows  and all cells data");
		for(int i=1;i<=Rowscnt ; i++) //  1 to 4
		{
			for(int j=1;j<=colcnt;j++) //    1 to   2
			{
				cellData12= xl.readDataFromExcel(xlFileName, SheetName, i, j);// 1, 1 ,,1,2 
				System.out.println("cellData="+i + j+"-"+cellData12);
			}
		}

		//		****** get  all rows  and all cells data
		//		cellData=11-UserName
		//		cellData=12-Password
		//		cellData=21-admin
		//		cellData=22-manager
		//		cellData=31-Ram
		//		cellData=32-rampwd
		//		cellData=41-Sita
		//		cellData=42-Sitapwd

		System.out.println("test hash table d");
		xlFileName="D:\\Practise\\FrameWorkDeisgnsPractiseWorkSpace\\POMBrahmaProject\\src\\test\\java\\ReadExcelData\\testdata.xlsx";

		Hashtable<String, String> dataTable= readDataintoHashTable(xlFileName, "MyData");
		System.out.println("get all data in table=" + dataTable);
		System.out.println("get data from table for EmployeeName=" + dataTable.get("EmployeeName"));


		//
//		dataTable= readDataintoHashTable( "MyData");
//		System.out.println("2.get all data in table=" + dataTable);
//		System.out.println("2.get data from table for EmployeeName=" + dataTable.get("EmployeeName"));

		//  test 
		ExcelReadingBasics3 xl3=  new ExcelReadingBasics3();
		xl.getRowsCnt("MyData");//????
		
		
	}

}
