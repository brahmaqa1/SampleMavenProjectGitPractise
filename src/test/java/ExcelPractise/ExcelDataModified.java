package ExcelPractise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataModified {

	public static int getRowsCount(String path, String sheet) throws EncryptedDocumentException, IOException
	{
		//		File file= new File("./data/TestData.xlsx");
		File file= new File(path);
		FileInputStream fis= new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh= wb.getSheet(sheet);

		int RowsCnt= sh.getLastRowNum();
//		System.out.println("RowsCnt="+RowsCnt);// 4  but actual rows count =5
		return RowsCnt+1;		
	}

	public static int getColumnsCount(String path, String sheet) throws EncryptedDocumentException, IOException
	{
		File file= new File(path);
		FileInputStream fis= new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh= wb.getSheet(sheet);;

		int ColCnt= sh.getRow(0).getLastCellNum();
//		System.out.println("ColCnt="+ColCnt);//3  // actual cnt =3 

		return ColCnt;		
	}

	public static String getData(String path, String sheet,int rowNo,int colNo) throws EncryptedDocumentException, IOException
	{
		File file= new File(path);
		FileInputStream fis= new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh= wb.getSheet(sheet);
		System.out.println("rowno="+rowNo+",colno="+colNo);
		String data=sh.getRow(rowNo-1).getCell(colNo-1).toString();

		return data;
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String path= "./data/TestData.xlsx";
		String sheet= "Login";
		int rowsCnt=getRowsCount(path, sheet);
		int colsCnt= getColumnsCount(path, sheet);
		System.out.println("Rows Cnt="+rowsCnt);// 5
		System.out.println("Cols Cnt="+colsCnt);// 3
		
		System.out.println("get data ="+getData(path, sheet, 1, 1));//1,1
		System.out.println("get data ="+getData(path, sheet, 1, 2));// 1,2
		System.out.println("get data ="+getData(path, sheet, 1, 3));
		
		System.out.println("get data ="+getData(path, sheet, 2, 1));
		System.out.println("get data ="+getData(path, sheet, 2, 2));
		System.out.println("get data ="+getData(path, sheet, 2, 3));
		
		System.out.println("get data ="+getData(path, sheet, 3, 1));
		System.out.println("get data ="+getData(path, sheet, 3, 2));
		System.out.println("get data ="+getData(path, sheet, 3, 3));
			
		System.out.println("get data ="+getData(path, sheet, 3, 4));//
		//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.toString()" because the return value of "org.apache.poi.ss.usermodel.Row.getCell(int)" is null
		
		System.out.println("****************Read all");
		for(int i=1;i<=5;i++)// 1 to 5
		{
			for(int j=1;j<=3;j++)// 1 to 3
			{
				System.out.println("data= i="+i +",j="+j +","+getData(path, sheet, i, j));
			}			
		}
		

//		Rows Cnt=5
//				Cols Cnt=3
//				rowno=1,colno=1
//				get data =UserName
//				rowno=1,colno=2
//				get data =Password
//				rowno=1,colno=3
//				get data =Amount
//				rowno=2,colno=1
//				get data =admin
//				rowno=2,colno=2
//				get data =manager
//				rowno=2,colno=3
//				get data =100.0
//				rowno=3,colno=1
//				get data =Raj
//				rowno=3,colno=2
//				get data =manager
//				rowno=3,colno=3
//				get data =10.85
//				****************Read all
//				rowno=1,colno=1
//				data= i=1,j=1,UserName
//				rowno=1,colno=2
//				data= i=1,j=2,Password
//				rowno=1,colno=3
//				data= i=1,j=3,Amount
//				rowno=2,colno=1
//				data= i=2,j=1,admin
//				rowno=2,colno=2
//				data= i=2,j=2,manager
//				rowno=2,colno=3
//				data= i=2,j=3,100.0
//				rowno=3,colno=1
//				data= i=3,j=1,Raj
//				rowno=3,colno=2
//				data= i=3,j=2,manager
//				rowno=3,colno=3
//				data= i=3,j=3,10.85
//				rowno=4,colno=1
//				data= i=4,j=1,Swathi
//				rowno=4,colno=2
//				data= i=4,j=2,mercury
//				rowno=4,colno=3
//				data= i=4,j=3,200.0
//				rowno=5,colno=1
//				data= i=5,j=1,Sam
//				rowno=5,colno=2
//				data= i=5,j=2,Sampwd
//				rowno=5,colno=3
//				data= i=5,j=3,500.0

		
	}

}
