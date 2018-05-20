package hdfc.TestData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class hdfcTestData 
{

	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public void TestData(String excelPath)
	{
		try 
		{
			
			File fis=new File(excelPath);
			FileInputStream scr=new FileInputStream(fis);
			wb=new XSSFWorkbook(scr);
			
		} catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public String getSheetdata(int SteetIndex,int row,int col)
	{
		sheet1=wb.getSheetAt(SteetIndex);
		DataFormatter formatter = new DataFormatter();

		//String val = formatter.formatCellValue(sheet.getRow(col).getCell(row));
		
		//Cell cell=formatter.formatCellValue(sheet1.getRow(col).getCell(row));
		
		String data=formatter.formatCellValue(sheet1.getRow(col).getCell(row));
		//String data=formatter.formatCellValue(cell);
		
		return data;
	}
	
	public int rowCount(int SheetIndex)
	{
		int rows=wb.getSheetAt(SheetIndex).getLastRowNum();
		rows=rows+1;
		
		return rows;
	}
	
}
