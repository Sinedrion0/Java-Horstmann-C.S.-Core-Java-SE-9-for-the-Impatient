package lessonsTwo.com;

import java.io.FileReader;

import com.opencsv.CSVReader;

public class Thirteen {
	// to put this class in working condition
	// i have to write requiers com.opencsv to module-info.java
	public static void main(String [] args){
	try { 
		  
        // Create an object of filereader 
        // class with CSV file as a parameter. 
        FileReader filereader = new FileReader("data.csv"); 
  
        // create csvReader object passing 
        // file reader as a parameter 
        CSVReader csvReader = new CSVReader(filereader); 
        String[] nextRecord; 
  
        // we are going to read data line by line 
        while ((nextRecord = csvReader.readNext()) != null) { 
            for (int i = 0; i < nextRecord.length; i ++) { 
                System.out.print(nextRecord[i] + " "); 
            } 
            System.out.println(); 
        } 
    } 
    catch (Exception e) { 
        e.printStackTrace(); 

    	}
	}
	
}
