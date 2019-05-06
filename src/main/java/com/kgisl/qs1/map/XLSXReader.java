package com.kgisl.qs1.map;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXReader
{
    public static void main(String[] args)
    {
        try
        {
            String excelPath = "D:\\Kannan\\test1\\Apple\\Employee\\Employee1.xlsx";
            FileInputStream fileInputStream = new FileInputStream(new File(excelPath));

            // Create Workbook instance holding .xls file
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

            // Get the first worksheet
            XSSFSheet sheet = workbook.getSheetAt(0);

            // Iterate through each rows
            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext())
            {
                // Get Each Row
                Row row = rowIterator.next();

                // Iterating through Each column of Each Row
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext())
                {
                    Cell cell = cellIterator.next();

                    // Checking the cell format
                    switch (cell.getCellType())
                    {
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t" + " ");
                        break;
                    case STRING:
                        System.out.print(cell.getStringCellValue() + "\t" + " ");
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue() + "\t" + " ");
                        break;
                    }
                }
                System.out.println("");
            }

        } catch (IOException ie)
        {
            ie.printStackTrace();
        }

    }
}