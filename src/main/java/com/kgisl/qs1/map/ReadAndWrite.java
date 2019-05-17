package com.kgisl.qs1.map;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.hssf.record.CFRuleBase.ComparisonOperator;
import org.apache.poi.hssf.record.cf.PatternFormatting;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.ConditionalFormattingRule;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.SheetConditionalFormatting;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * ReadAndWrite
 */
public class ReadAndWrite {

    static FileInputStream file;
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    static List<Marks> markList = new ArrayList<Marks>();
    static Map<String,Marks[]>data=new TreeMap<String,Marks[]>();


    public static void ReadEXcelFile(){
        try{
            file =new FileInputStream(new File("ReadAndWrite"));
            workbook= new XSSFWorkbook(file);//creat work book
         sheet=  workbook.getSheetAt(1);// Get first/desired sheet from the workbook
            int noOfRow= sheet.getLastRowNum();
            int noOfColumns = sheet.getRow(0).getLastCellNum();
            markList = new ArrayList<>();
            data = new TreeMap<String,Marks[]>();
            for(int i= sheet.getFirstRowNum()+1;i<=noOfRow;i++){
                Row onRow= sheet.getRow(i);
                Marks marks =  new Marks();
                
                  for(int j= onRow.getFirstCellNum();i<=noOfColumns;j++){
                      Cell cell = onRow.getCell(j);
                      if(j==0){
                          marks.setId((int) cell.getNumericCellValue());
                      }
                      if(j==1){
                        marks.setName((String) cell.getStringCellValue());
                      }
                      if(j==2){
                          marks.setCllage((String) cell.getStringCellValue());
                      }
                      if(j==4){
                          marks.setYear((int)cell.getNumericCellValue());
                      }
                      if(j==3){
                          marks.setDep((String)cell.getStringCellValue());
                      }
                      if(j==5){
                          marks.setJava((int)cell.getNumericCellValue());
                      }
                      if(j==6){
                          marks.setAndro((int)cell.getNumericCellValue());
                      }
                      if(j==7){
                          marks.setPhp((int)cell.getNumericCellValue());
                      }
                  }
                  markList.add(marks);
            }

         
        } catch(FileNotFoundException e){
            System.out.println(e);

        }catch (IOException e) {
            e.printStackTrace();
        }


    
}
 public static void WriteExcelFile(){
     workbook = new XSSFWorkbook();
     sheet = workbook.createSheet("Results");
     String colums[]={"id", "name", "college", "department", "year", "mark1", "mark2", "mark3", "total"  };
     Row headrow = sheet.createRow(0);
        // Create headerRow cells
     for(int i =0; i<=colums.length;i++){
         Cell cell = headrow.createCell(i);
         cell.setCellValue(colums[i]);


     }
     int rowno =1;
        for(Marks emp: markList){
            Row row = sheet.createRow(rowno++);
            row.createCell(0).setCellValue(emp.getID());
            row.createCell(01).setCellValue(emp.getName());
            row.createCell(2).setCellValue(emp.getCllage());
            row.createCell(3).setCellValue(emp.getDep());
            row.createCell(4).setCellValue(emp.getYear());
            row.createCell(5).setCellValue(emp.getJava());
            row.createCell(6).setCellValue(emp.getAndro());
            row.createCell(7).setCellValue(emp.getPhp());
            Cell totalcel =row.createCell(row.getLastCellNum(),CellType.NUMERIC);
            if(row.getRowNum()!=0){
                double j1=row.getCell(5).getNumericCellValue();
                double a1= row.getCell(6).getNumericCellValue();
                double p1= row.getCell(7).getNumericCellValue();
                totalcel.setCellValue(j1+a1+p1);
            }


        }
        try {
            // Formatting
            cellFormatting();
            // Write the workbook in file system
            FileOutputStream out = new FileOutputStream(new File("ReadAndWrite.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("File written successfully on disk.");
        } catch (Exception e) {
            e.printStackTrace();
        }












 }

    private static void cellFormatting() {


        SheetConditionalFormatting sheetCF = sheet.getSheetConditionalFormatting();

        ConditionalFormattingRule rule2 = sheetCF.createConditionalFormattingRule(ComparisonOperator.LT, "40");
        org.apache.poi.ss.usermodel.PatternFormatting fill2 = rule2.createPatternFormatting();
        fill2.setFillBackgroundColor(IndexedColors.RED.index);
        fill2.setFillPattern(PatternFormatting.SOLID_FOREGROUND);

        CellRangeAddress[] regions = { CellRangeAddress.valueOf("F1:F11"), CellRangeAddress.valueOf("G1:G11"),
                CellRangeAddress.valueOf("H1:H11") };

        sheetCF.addConditionalFormatting(regions, rule2);

    }




public static void main(String[] args) {
   
    WriteExcelFile();
    ReadEXcelFile();
    
}




    }


