package com.kgisl.qs1.map;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.ConditionalFormattingRule;
import org.apache.poi.ss.usermodel.FontFormatting;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.PatternFormatting;
import org.apache.poi.ss.usermodel.SheetConditionalFormatting;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Fills and Colors
 */
public class Fil {
    public static void main(String[] args) throws Exception {
    	XSSFWorkbook wb = new XSSFWorkbook(); //or new HSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("new sheet");

        // Create a row and put some cells in it. Rows are 0 based.
        XSSFRow row1 = sheet.createRow(0);

        // Create a cell
        row1.createCell(0).setCellValue("EmpID");
        row1.createCell(1).setCellValue("Name");
        row1.createCell(2).setCellValue("Degree");
        
        XSSFRow row2 = sheet.createRow(1);
        row2.createCell(0).setCellValue("54601");
        row2.createCell(1).setCellValue("Soha SK");
        row2.createCell(2).setCellValue("M.Sc");

        
        XSSFRow row3 = sheet.createRow(2);
        row3.createCell(0).setCellValue("54602");
        row3.createCell(1).setCellValue("Muneer SK");
        row3.createCell(2).setCellValue("B.Tech");
        
        XSSFRow row4 = sheet.createRow(3);
        row4.createCell(0).setCellValue("54603");
        row4.createCell(1).setCellValue("Sania SK");
        row4.createCell(2).setCellValue("M.Tech");
        
        XSSFRow row5 = sheet.createRow(4);
        row5.createCell(0).setCellValue("54604");
        row5.createCell(1).setCellValue("Adam SK");
        row5.createCell(2).setCellValue("B.Sc");
        
        XSSFRow row6 = sheet.createRow(5);
        row6.createCell(0).setCellValue("54605");
        row6.createCell(1).setCellValue("Supriya");
        row6.createCell(2).setCellValue("B.Sc");
        
        XSSFRow row7 = sheet.createRow(6);
        row7.createCell(0).setCellValue("54606");
        row7.createCell(1).setCellValue("Gayatri");
        row7.createCell(2).setCellValue("B.Tech");
        
        
        SheetConditionalFormatting sheetCF = sheet.getSheetConditionalFormatting();
  
        ConditionalFormattingRule rule = sheetCF.createConditionalFormattingRule("MOD(ROW() - 1, 1) = 0");
               	     	
        PatternFormatting fill = rule.createPatternFormatting();
        fill.setFillBackgroundColor(IndexedColors.GREY_40_PERCENT.index);
        fill.setFillPattern(PatternFormatting.SOLID_FOREGROUND);
        
        
        FontFormatting ffRed = rule.createFontFormatting();
        ffRed.setFontColorIndex(IndexedColors.WHITE.index);
        
        CellRangeAddress[] regions = {  CellRangeAddress.valueOf("A1:C1") };
        
        sheetCF.addConditionalFormatting(regions,rule);
            
        ConditionalFormattingRule rule1 = sheetCF.createConditionalFormattingRule(
        	    "MOD(ROW() - 1, 2) = 0");

        PatternFormatting fill1 = rule1.createPatternFormatting();
        fill1.setFillBackgroundColor(IndexedColors.GREY_25_PERCENT.index);
        fill1.setFillPattern(PatternFormatting.SOLID_FOREGROUND);
        
        CellRangeAddress[] regions1 = {  CellRangeAddress.valueOf("A1:C7") };
        
        sheetCF.addConditionalFormatting(regions1,rule1);

        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("D:\\Kannan\\test1\\Apple\\Employee\\colors.xlsx");
        wb.write(fileOut);
        fileOut.close();
        System.out.println("Successfully Created workbook");
    }
}	