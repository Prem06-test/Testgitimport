package Test1;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
//		File file=new File("");
//		FileInputStream inputstream=new FileInputStream(file);
//		XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
//		XSSFSheet sheet=workbook.getSheetAt(0);
//		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
//		for (int i = 0; i < rowCount+1; i++) {
//
//	        Row row = sheet.getRow(i);
//
//	        //Create a loop to print cell values in a row
//
//	        for (int j = 0; j < row.getLastCellNum(); j++) {
//
//	            //Print Excel data in console
//
//	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");
//
//	        }
//
//	        System.out.println();
//	    } 
		String excelFilePath = "C:\\Users\\225453\\Desktop\\Sindhu.xlsx";
        FileInputStream fis = new FileInputStream(excelFilePath);

        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);

        for (Row row : sheet) {
            for (Cell cell : row) {
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    default:
                        System.out.print("Unknown Cell Type\t");
                        break;
                }
            }
            System.out.println();
        }

        workbook.close();
        fis.close();
    }
	    }  
	


