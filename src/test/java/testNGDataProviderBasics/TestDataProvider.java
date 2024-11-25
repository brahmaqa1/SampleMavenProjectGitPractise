package testNGDataProviderBasics;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Hashtable;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

import ReadExcelData.ExcelReadingBasics3;

public class TestDataProvider {

	
	@DataProvider
	public Object [] [] getData(Method m) throws EncryptedDocumentException, IOException
	{
//		 get method anme
//		System.out.println("get method name="+ m.getName());
//		
//		Object  [] []dataArr = new Object [3][2];
//		// 3- how many times we have to execute test
//		// 2 represents how many parameters we have to pass ot sets of data
//		dataArr [0][0] = "Ram";
//		dataArr [0][1] = "mercury";
//		
//		dataArr [1][0] = "Swathi";
//		dataArr [1][1] = "mercury";
//		
//		dataArr [2][0] = "John";
//		dataArr [2][1] = "mercury";
//		
//		return dataArr;
		//***********************************
		ExcelReadingBasics3 xl3=  new ExcelReadingBasics3();
		String xlfile="D:\\Practise\\FrameWorkDeisgnsPractiseWorkSpace\\POMBrahmaProject\\src\\test\\java\\ReadExcelData\\testdata.xlsx";
		String sheetName = "AddCustomerTest";
		String data;
		int rowsCnt=xl3.getRowsCnt(xlfile, sheetName);
		int colCnt= xl3.getColsCnt(xlfile, sheetName);
		Object  [] []dataArr = new Object [rowsCnt][1];// 	
			
		Hashtable<String, String>  hTable = null;
		for(int i=1;i<=rowsCnt;i++)
		{
			hTable = new Hashtable<String,String>();
			for(int j=1;j<=colCnt;j++)
			{
				data=xl3.readDataFromExcel(xlfile, sheetName, 1, j);// 1,1  1,2  1,5
//				System.out.println("data="+data);
				hTable.put(data, xl3.readDataFromExcel(xlfile, sheetName, i, j));// 2,1   ,2,2   ,2,5
				dataArr [i-1] [0]  = hTable;	// 0-4			
			}
			System.out.println("**********");
			System.out.println("htable-"+hTable);
		}
		
		return dataArr;		
		
	}
}
