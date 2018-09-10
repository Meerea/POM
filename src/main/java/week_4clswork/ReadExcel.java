package week_4clswork;



import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public String[][] getData(String filename) throws IOException {
		// open workbook
		XSSFWorkbook wBook= new XSSFWorkbook("./data/"+filename +".xlsx");
		// go to sheet
		XSSFSheet sheet=wBook.getSheetAt(0);
		int rowcount= sheet.getLastRowNum();
		int columncount=sheet.getRow(0).getLastCellNum();
		System.out.println(rowcount+" "+columncount);
		// to get values in 2 dimensional array string create a array String[][] 
		String[][] data=new String[rowcount][columncount];
		//go to row
		for(int i=1;i<=rowcount;i++) {
		XSSFRow row= sheet.getRow(i);
		//go to cell
		for(int j=0;j<columncount;j++) {
		XSSFCell cell = row.getCell(j);
		//read the data
		//String data = cell.getStringCellValue();
		//System.out.println(data);
		/* now store the values in the array. 
		here the i-1 is to store the value in excel from first row since the row i=1*/  
		data[i-1][j]=cell.getStringCellValue();
		
			}

		}
		wBook.close();
		return data;


	}

}
