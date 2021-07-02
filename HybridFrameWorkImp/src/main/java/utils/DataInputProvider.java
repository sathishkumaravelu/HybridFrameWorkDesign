package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataInputProvider {

	public static Object[][] getSheet(String dataSheetName, String sheetName) {

		Object[][] data = null;
		try {

			FileInputStream fis = new FileInputStream("./data/" + dataSheetName + ".xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet(sheetName);

			int rowCount = sheet.getLastRowNum();

			int columnCount = sheet.getRow(0).getLastCellNum();

			data = new String[rowCount][columnCount];

			for (int i = 1; i <= rowCount; i++) {

				try {
					XSSFRow row = sheet.getRow(i);

					for (int j = 0; j < columnCount; j++) {
						try {
							String cellValue = "";
							try {

								  XSSFCell cell = row.getCell(j);
								  if(cell.getCellType()==CellType.STRING) {
									  cellValue = cell.getStringCellValue(); 
									}				
									else if(cell.getCellType()==CellType.NUMERIC) {
										cellValue = String.valueOf(cell.getNumericCellValue());
									}
								
								
							} catch (NullPointerException e) {
								//System.out.println("Null Pointer Exception in ReadExcel file" + e);
							}

							data[i - 1][j] = cellValue;
						} catch (Exception e) {

							e.printStackTrace();
						}

					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			fis.close();
			workbook.close();
		} catch (Exception e) {
			System.out.println("Data Input Provider class IO exeception" + e);
			e.printStackTrace();
		}
		return data;
	}
}
