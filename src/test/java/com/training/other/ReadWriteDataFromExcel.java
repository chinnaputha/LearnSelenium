package com.training.other;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.training.utils.TestBaseUtils;

public class ReadWriteDataFromExcel extends TestBaseUtils {

	@Test
	public void readData() throws Exception {
		//WebDriver driver = null;
		File file = null;
		FileInputStream fis = null;
		XSSFWorkbook wb = null;
		XSSFSheet sheet = null;
		XSSFRow row = null;
		String username = null;
		String password = null;

		lanuchBrowser("https://www.gmail.com");

		try {
			// find the file path
			file = new File("xls\\loginDetails.xlsx");
			// read file data
			fis = new FileInputStream(file);
			// convert file input work book
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet("Gmail");
			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("Total no rows:" + rowcount);
			row = sheet.getRow(1);
			XSSFCell cell1 = row.getCell(0);
			XSSFCell cell2 = row.getCell(1);
			System.out.println("cell value -->" + cell1);
			username = cell1.toString();
			password = cell2.toString();

			System.out.println("Cell1 value " + username);
			System.out.println("Cell2 value " + password);

		} catch (FileNotFoundException e) {
			System.out.println("File Not available ");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("File not in read mode");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("File not in read mode");
			e.printStackTrace();
		} finally {
			System.out.println("close the workbook and file");
			//wb.close();// close the workbook
			fis.close();// close the file

		}

		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(username);
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();

		//sheet.createRow(1).createCell(2).setCellValue("Testcase passed");
		row.createCell(3).setCellValue("FAIL");

		FileOutputStream fos = new FileOutputStream(file);//file write mode
		wb.write(fos);//write the cell value in file

		fos.close();//close the write mode
		wb.close(); //close the workbook

	}

	

}
