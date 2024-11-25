package testNGDataProviderBasics;

import java.io.IOException;
import java.util.Hashtable;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import ReadExcelData.ExcelReadingBasics3;

public class TestExcelReaderHashTable {

	@Test
	public void testA() throws EncryptedDocumentException, IOException {		
		ExcelReadingBasics3 xl3=  new ExcelReadingBasics3();
		String xlfile="D:\\Practise\\FrameWorkDeisgnsPractiseWorkSpace\\POMBrahmaProject\\src\\test\\java\\ReadExcelData\\testdata.xlsx";
		String sheetName = "AddCustomerTest";
		String data;
		Hashtable<String, String>  hTable = new   Hashtable<String, String>();
		for(int i=1;i<=xl3.getRowsCnt(xlfile, sheetName);i++)
		{
			for(int j=1;j<=xl3.getColsCnt(xlfile, sheetName);j++)
			{
				data=xl3.readDataFromExcel(xlfile, sheetName, 1, j);// 1,1  1,2  1,5
//				System.out.println("data="+data);
				
				hTable.put(data, xl3.readDataFromExcel(xlfile, sheetName, i, j));// 2,1   ,2,2   ,2,5
				//hTable.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
			}
			System.out.println("**********");
			System.out.println("htable-"+hTable);
		}
			
		
		
	}

}
