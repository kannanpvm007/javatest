package com.kgisl.qs1.map;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;

public class ReadAll {
    public static void main(String[] args) throws Exception {
        CSVReader r = new CSVReader(new FileReader("D:\\Kannan\\test1\\ok1.csv"), ',');
        List<Employee> ab = new ArrayList<>();
        
        List<String[]> rd = r.readAll();
        Iterator<String[]> ir = rd.iterator();
        while (ir.hasNext()) {
            String[] rdd = ir.next();
            Employee empl = new Employee();
            empl.setId(rdd[0]);
            empl.setName(rdd[1]);
            empl.setAge(rdd[2]);
            empl.setCountry(rdd[2]);
            ab.add(empl);
            
        }
        System.out.println(ab);
        r.close();
    }

}