package tka.readexel.Que1;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Read_Exel {

    public static void main(String[] args) {
        
    	
    	
    	
    	try (FileInputStream fis = new FileInputStream("F:\\FSI-2023-DOWNLOAD.xlsx");
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0); 
            for (Row row : sheet) {
                for (Cell cell : row) {
                	   
                    System.out.print(cell.toString() + "\t"); 
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

