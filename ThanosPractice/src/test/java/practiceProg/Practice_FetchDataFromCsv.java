package practiceProg;

//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Iterator;
//
//import com.opencsv.CSVReader;
//import com.opencsv.exceptions.CsvValidationException;
//
//public class Practice_FetchDataFromCsv {
//
//	
//	public static void main(String[] args) throws IOException, CsvValidationException {
//		
//		String csvFilePath = "/ThanosPractice/src/test/resources/bulk_02_idr_3txn.csv";
//		
//		
//		try(CSVReader reader = new CSVReader(new FileReader(csvFilePath))){
//			String [] nextLine;
//			while((nextLine = reader.readNext())!= null)
//			{
//				for (String value : nextLine) {
//					System.out.print(value + ",");
//				}
//				System.out.println();
//			}
//		}
//		catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//	
//}

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class Practice_FetchDataFromCsv {
    public static void main(String[] args) throws CsvValidationException {
        // Path to the CSV file
        String csvFilePath = "./src/test/resources/bulk_02_idr_3txn.csv";

        try (CSVReader reader = new CSVReader(new FileReader(csvFilePath))) {
            String[] nextLine;
            // Read each line from the CSV file until the end
            while ((nextLine = reader.readNext()) != null) {
                // Process each line (e.g., print or store data)
                for (String value : nextLine) {
                    System.out.print(value + ", "); // Print each value
                }
                System.out.println(); // Move to the next line
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle any potential IO exceptions
        }
    }
}

