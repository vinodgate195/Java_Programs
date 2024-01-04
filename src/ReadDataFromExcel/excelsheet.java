package ReadDataFromExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class excelsheet {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
String file ="C:\\Users\\vinod.gate\\eclipse-workspace\\JavaPrograms\\src\\Data_reader.xls";
FileInputStream input =new FileInputStream(file);	

		XSSFWorkbook workbook = new XSSFWorkbook(input);	
		
		XSSFSheet sheet =workbook.getsheet("");
		
		int rowcount=sheet.getLastRowNum();
		int columncout=sheet.getrowNum(1).getlastCellNum();
		
		for(int i=0i<=rowcount;i++)
		{
		
		XSSFROW rw=sheet.getrow(i)
		
		for(int c=0;c<=columncoutn;c++)
		
		{
		
		             XSSFCell=rw.getcell(c)
		      System.out.println(sheet.getrow(i).getcell(c).getStringcellvalue)      		 
		}
		
		
		}
		
		
		
		
		
	}

}
