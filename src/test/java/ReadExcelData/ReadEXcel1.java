package ReadExcelData;

import Utilities.ExcelReader;

public class ReadEXcel1 {

	public static void main(String[] args) {
		
		String xlpath= "D:\\Practise\\FrameWorkDeisgnsPractiseWorkSpace\\MyMavenProjectFirst\\src\\main\\resources\\TestData\\testdata.xlsx";
		ExcelReader xl=  new ExcelReader(xlpath);
		
		int rowCnt=xl.getRowCount("test_suite");
		System.out.println("rowCnt="+rowCnt);//4
		
		int colCnt= xl.getColumnCount("test_suite");
		System.out.println("colCnt="+colCnt);//2
		
		
		// is sheet exist
		boolean isSheetExist =xl.isSheetExist("test_suite");
		System.out.println("isSheetExist="+isSheetExist);
		
				
		// get cell data
		String data= xl.getCellData("test_suite", 0, 1);
		System.out.println("data 01="+data);
		
		data= xl.getCellData("test_suite", 1, 1);
		System.out.println("data 11="+data);
		
		data= xl.getCellData("test_suite", 0, 2);
		System.out.println("data 02="+data);
		
		data= xl.getCellData("test_suite", 1, 2);
		System.out.println("data 12="+data);
					
		data= xl.getCellData("test_suite", 0, 3);
		System.out.println("data 03="+data);
		
		data= xl.getCellData("test_suite", 1, 3);
		System.out.println("data 13="+data);
		
		System.out.println("*******");
		for(int i=1;i<=rowCnt;i++)
		{
			data= xl.getCellData("test_suite", 0, i);
			System.out.println("data =0"+i+"="+data);
		}
		
	}

}
