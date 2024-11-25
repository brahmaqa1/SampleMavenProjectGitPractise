package ExcelPractise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {

	public static int getRowsCount(String path, String sheet) throws EncryptedDocumentException, IOException
	{
		//		File file= new File("./data/TestData.xlsx");
		File file= new File(path);
		FileInputStream fis= new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh= wb.getSheet(sheet);

		int RowsCnt= sh.getLastRowNum();
//		System.out.println("RowsCnt="+RowsCnt);// 4
		return RowsCnt;		
	}

	public static int getColumnsCount(String path, String sheet) throws EncryptedDocumentException, IOException
	{
		File file= new File(path);
		FileInputStream fis= new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh= wb.getSheet(sheet);;

		int ColCnt= sh.getRow(0).getLastCellNum();
//		System.out.println("ColCnt="+ColCnt);//3

		return ColCnt;		
	}

	public static String getData(String path, String sheet,int rowNo,int colNo) throws EncryptedDocumentException, IOException
	{
		File file= new File(path);
		FileInputStream fis= new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh= wb.getSheet(sheet);
		System.out.println("rowno="+rowNo+",colno="+colNo);
		String data=sh.getRow(rowNo).getCell(colNo).toString();

		return data;
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path= "./data/TestData.xlsx";
		String sheet= "Login";
		int rowsCnt=getRowsCount(path, sheet);
		int colsCnt= getColumnsCount(path, sheet);
		System.out.println("Rows Cnt="+rowsCnt);// 4 but we have  5 rows..retuen index no
		System.out.println("Cols Cnt="+colsCnt);//3
		
		System.out.println("get data ="+getData(path, sheet, 0, 0));//1,1
		System.out.println("get data ="+getData(path, sheet, 0, 1));// 1,2
		System.out.println("get data ="+getData(path, sheet, 0, 2));
		
		System.out.println("get data ="+getData(path, sheet, 1, 0));
		System.out.println("get data ="+getData(path, sheet, 1, 1));
		System.out.println("get data ="+getData(path, sheet, 1, 2));
		
		System.out.println("get data ="+getData(path, sheet, 2, 2));
		System.out.println("get data ="+getData(path, sheet, 2, 2));
		System.out.println("get data ="+getData(path, sheet, 2, 2));
		
	
		System.out.println("****************Read all");
		for(int i=0;i<=3;i++)// 1 to 4
		{
			for(int j=0;j<=2;j++)// 1 to 3
			{
				System.out.println("data= i="+i +",j="+j +","+getData(path, sheet, i, j));
			}			
		}
		

	}

}
