package SeleniumTestCases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	
	 static XSSFWorkbook workbook;
	 static XSSFSheet sheet ;

	 
	 public Excelutils (String excelpath, String sheetname)
	 {
			try {
				workbook = new XSSFWorkbook ("C:\\Users\\manisvij\\eclipse-workspace\\SeleniumCodes\\src\\excel\\Data.xlsx");
				sheet =  workbook.getSheet("Sheet1");
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
	

	public static void main(String[] args) {
		// getRowCount();
		// getcelldata(0, 0);
	}

	public static int getRowCount() 
	{
		int Rowcount = 0;
		
		try {

			workbook = new XSSFWorkbook ("C:\\Users\\manisvij\\eclipse-workspace\\SeleniumCodes\\src\\excel\\Data.xlsx");
			sheet =  workbook.getSheet("Sheet1");
			 Rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("Count is" + " "+ Rowcount);
		}
		catch (IOException exp)  
		{
			exp.printStackTrace();
			exp.getMessage();
			exp.getCause();
		}
		return Rowcount;
		
	}
		
		
		public static int getColoumnCount() 
		{
			int Colcount = 0;
			
			try {

				workbook = new XSSFWorkbook ("C:\\Users\\manisvij\\eclipse-workspace\\SeleniumCodes\\src\\excel\\Data.xlsx");
				sheet =  workbook.getSheet("Sheet1");
				Colcount = sheet.getRow(0).getPhysicalNumberOfCells();
				System.out.println("Count is" + " "+ Colcount);

			} 
		

		catch (IOException e) 
		{
			e.printStackTrace();
			e.getMessage();
			e.getCause();
		}
		
		return Colcount;

	}
	
	public static String getcelldata(int row, int col)
	{
		String getcelldata = null;
		
		try {
			workbook = new XSSFWorkbook ("C:\\Users\\manisvij\\eclipse-workspace\\SeleniumCodes\\src\\excel\\Data.xlsx");
			sheet =  workbook.getSheet("Sheet1");
			
			 String celldata = sheet.getRow(row).getCell(col).getStringCellValue();
			 int celldata1 = (int) sheet.getRow(1).getCell(1).getNumericCellValue();

			 
			 System.out.println("Data is"+ " " + celldata);
			 System.out.println("Data is"+ " " + celldata1);

		
		} catch (IOException e) 
		{
		e.printStackTrace();
		}
		return getcelldata;
	}

}
