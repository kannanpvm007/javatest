package com.kgisl.qs1.map;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.ComparisonOperator;
import org.apache.poi.ss.usermodel.ConditionalFormattingRule;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.PatternFormatting;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.SheetConditionalFormatting;
import org.apache.poi.ss.util.CellRangeAddress;

//import com.sun.rowset.internal.Row;

//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelColor {
    public static void main(String[] args) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("employeee");
        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        data.put("1", new Object[] { "ID", "NAME", "AGE", "php", "java", "android" });
        data.put("2", new Object[] { 1, "devi", 35, 50, 60, 70 });
        data.put("3", new Object[] { 2, "nisanth", 40, 50, 40, 90 });
        data.put("4", new Object[] { 3, "kannan", 24, 60, 45, 35 });
        data.put("5", new Object[] { 4, "ramya", 40, 50, 40, 90 });
        Set<String> key = data.keySet();
        int rowmum = 0;
        for (String obg : key) {
            Row row = sheet.createRow(rowmum++);
            Object[] obj1 = data.get(obg);
            int cellr = 0;
            for (Object obj2 : obj1) {
                Cell cell = row.createCell(cellr++);
                if (obj2 instanceof String)
                    cell.setCellValue((String) obj2);
                else if (obj2 instanceof Integer)
                    cell.setCellValue((Integer) obj2);
            }
            // angin one cell creation for TOTAL
            Cell tocell = row.createCell(row.getLastCellNum(), CellType.NUMERIC);
            if (row.getRowNum() == 0) {
                tocell.setCellValue("TOTAL");
            } else {
                // double C++= row.getCell(3).getNumericCellValue();
                double php = row.getCell(3).getNumericCellValue();

                double java = row.getCell(4).getNumericCellValue();
                double android = row.getCell(5).getNumericCellValue();
                tocell.setCellValue(php + java + android);

            }

        }
        SheetConditionalFormatting sheetCF = sheet.getSheetConditionalFormatting();


// //Condition 1: Cell Value Is   greater than  70   (Blue Fill)
       ConditionalFormattingRule rule1 = sheetCF.createConditionalFormattingRule(ComparisonOperator.GT, "70");
       PatternFormatting fill1 = rule1.createPatternFormatting();
       fill1.setFillBackgroundColor(IndexedColors.BLUE.index);
       fill1.setFillPattern(PatternFormatting.SOLID_FOREGROUND);

       //Condition 2: Cell Value Is  less than      50   (Green Fill)

       

            ConditionalFormattingRule rule2 = sheetCF.createConditionalFormattingRule
            (ComparisonOperator.GT, "40");
            PatternFormatting fill2 = rule2.createPatternFormatting();
            fill2.setFillBackgroundColor(IndexedColors.PALE_BLUE.index);
            fill2.setFillPattern(PatternFormatting.SOLID_FOREGROUND);
               CellRangeAddress[] reg = {
                   CellRangeAddress.valueOf("D1:D5"),
                   CellRangeAddress.valueOf("E1:E5"),CellRangeAddress.valueOf("F1:F5")
            
               };
                 sheetCF.addConditionalFormatting(reg, rule1);


        try {
            FileOutputStream out = new FileOutputStream(new File("write1.xlsx"));
            workbook.write(out);
            System.out.println("File written successfully on disk.");
            
               }
               catch(Exception e){
                   System.out.println(e);

               }



        }
       
    }
