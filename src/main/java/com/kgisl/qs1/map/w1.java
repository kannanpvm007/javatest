package com.kgisl.qs1.map;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;


// useing  map via column read file...


 class w1 {
public static void main(String[] args) throws IOException{
    // headr is we defind method
    w1 cs = new w1();
cs.parseCSVWithHeader();
}
public  List<Employee> parseCSVWithHeader() throws IOException {
    CSVReader reader = new CSVReader(new FileReader("D:\\Kannan\\test1\\ok1.csv"));
    
    HeaderColumnNameMappingStrategy<Employee> beanStrategy = new HeaderColumnNameMappingStrategy<Employee>();
    beanStrategy.setType(Employee.class);
    
    CsvToBean<Employee> csvToBean = new CsvToBean<Employee>();
    List<Employee> emps = csvToBean.parse(beanStrategy, reader);

    System.out.println(emps);
    reader.close();

    return emps;
}
}