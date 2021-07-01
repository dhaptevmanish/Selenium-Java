package SeleniumTestCases;

public class ExcelDataProvider {
	
	public static void main(String[] args) {
		
		String excelpath = "C:\\\\Users\\\\manisvij\\\\eclipse-workspace\\\\SeleniumCodes\\\\src\\\\excel\\\\Data.xlsx";
		testData (excelpath, "Sheet1");
		
	}

	public static void testData(String excelpath, String sheetname) 
	{
		
		Excelutils excel = new Excelutils(excelpath, sheetname);
		
		int rowcount = excel.getRowCount();
		int Colcount = excel.getColoumnCount();
		
		for (int i=0; i<rowcount; i++) {
			
			for (int j=0 ; j<Colcount ;j++) {
				
			 String celldata= excel.getcelldata(rowcount, Colcount);
				
				System.out.println(celldata);
			}
		}
		


	}
}
