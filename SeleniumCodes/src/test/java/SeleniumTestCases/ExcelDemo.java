package SeleniumTestCases;

public class ExcelDemo {

	
	public static void main(String[] args) {
		
		Excelutils excel = new Excelutils("C:\\\\Users\\\\manisvij\\\\eclipse-workspace\\\\SeleniumCodes\\\\src\\\\excel\\\\Data.xlsx", "Sheet1");
	
		excel.getRowCount();
		excel.getcelldata(0, 0);
		
	}
}
