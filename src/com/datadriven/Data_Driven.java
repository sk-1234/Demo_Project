package com.datadriven;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class Datadriven_Reader {

	public static void Read_Parthicular_Data() {
		File f = new File("");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook();

		Sheet sheetAt = w.getSheetAt(0);

		Row row = sheetAt.getRow(0);
		Cell cell = row.getCell();

		CellType celltype = cell.getCellType();

		if (celltype.equals(celltype.STRING)) {

			String value = cell.getStringCellValue();

			System.out.println(value);

		} else if (celltype.equals(CellType.NUMERIC)) {

			double value = cell.getNumericCellValue();

			int n = (int) value;
			System.out.println(n);
		}
	}

	public static void allRead_Data() {
	
        File f = new File("");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook();
		
		Sheet sheetAt = w.getSheetAt(0);
		
		int NumberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for(int i=0;i<NumberOfRows;i++) {
			
			Sheet sheetAt = w.getSheetAt(i);
			
			int NumberOfCell = sheetAt.getPhysicalNumberOfRows();
			
			for(int j=0; j<NumberOfCell;i++) {
				
				Cell cell = row.getCell();
				
				CellType celltype  = cell.getCellType();			
			}
		}
		
	}

	public static void main(String[] arg) {
		Read_Parthicular_Data();
		allRead_Data();

	}

}

