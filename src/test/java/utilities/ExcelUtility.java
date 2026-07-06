package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	public static String getData(String sheetName ,int row, int cell) throws IOException {

	    FileInputStream file = new FileInputStream("src\\test\\resources\\DaikinorgaDatas.xlsx");

	    XSSFWorkbook workbook = new XSSFWorkbook(file);

	    XSSFSheet sheet = workbook.getSheet(sheetName);

	    DataFormatter formatter = new DataFormatter();

	    String data = formatter.formatCellValue(
	            sheet.getRow(row).getCell(cell));

	    workbook.close();

	    return data;
    }


public static int getRowCount(String sheetName) throws IOException {
    FileInputStream fis = new FileInputStream("src\\test\\resources\\DaikinorgaDatas.xlsx");
    Workbook wb = WorkbookFactory.create(fis);
    Sheet sheet = wb.getSheet(sheetName);

    int rowCount = sheet.getLastRowNum(); // excluding header

    wb.close();
    fis.close();

    return rowCount;
}
}
