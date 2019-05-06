package com.kgisl.qs1.map;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;

/**
 * Writ1
 */
class READcsv {public static void main(String[] args) throws Exception {
    CSVReader rer = new CSVReader(new FileReader("D:\\Kannan\\test1\\ok1.csv"), ',');

    List<Employee> emp1 = new ArrayList<Employee>();

    List<String[]> rs1 = rer.readAll();

    Iterator<String[]> iterator = rs1.iterator();

    while (iterator.hasNext()) {
        String[] record = iterator.next();
        Employee emp = new Employee();
        emp.setId(record[0]);
        emp.setName(record[1]);
        emp.setAge(record[2]);
        emp.setCountry(record[3]);
        emp1.add(emp);
    }

    System.out.println(emp1);

    rer.close();

}
    
}












































/* 
package com.journaldev.csv.opencsv.parser;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.journaldev.csv.model.Employee;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;

public class OpenCSVParseToBeanExample {

	public static void main(String[] args) throws IOException {
		
		CSVReader reader = new CSVReader(new FileReader("emps.csv"), ',');
		
		ColumnPositionMappingStrategy<Employee> beanStrategy = new ColumnPositionMappingStrategy<Employee>();
		beanStrategy.setType(Employee.class);
		beanStrategy.setColumnMapping(new String[] {"id","name","age","country"});
		
		CsvToBean<Employee> csvToBean = new CsvToBean<Employee>();
		
		List<Employee> emps = csvToBean.parse(beanStrategy, reader);
		
		System.out.println(emps);
		
	}
}
*/