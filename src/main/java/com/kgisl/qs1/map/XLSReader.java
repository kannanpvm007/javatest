package com.kgisl.qs1.map;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class XLSReader {
    public static void main(String[] args) throws IOException{
        try {
            FileInputStream fileInputStream = new FileInputStream(
                    new File("D:\\Kannan\\test1\\Apple\\Employee\\Employee.xls"));

            // Create Workbook instance holding .xls file
            HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);

            // Get the first worksheet
            HSSFSheet sheet = workbook.getSheetAt(0);

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
                        case NUMERIC :
                        System.out.print(cell.getNumericCellValue() + "\t" + " "+"\n");
                        break;
                    case STRING:
                        System.out.print(cell.getStringCellValue() +  "\t" +" "+" \n");
                        break;
                    // case BOOLEAN:
                    //     System.out.print(cell.getBooleanCellValue() +  "\t" + "  "+" "+" " +"\t");
                    //     break;
                    }
                }
                System.out.println("\n");
            }

        } catch (IOException ie)
        {
            ie.printStackTrace();
        }

    }
}