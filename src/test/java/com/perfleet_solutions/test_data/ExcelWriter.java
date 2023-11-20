package com.perfleet_solutions.test_data;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriter {
    private static FileInputStream fis;
    private static XSSFWorkbook workbook;
    private static FileOutputStream file;
    static{
        try {
             fis = new FileInputStream("Employee.xlsx");
             file = new FileOutputStream("Employee.xlsx");
             workbook = new XSSFWorkbook(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static XSSFSheet sheet = workbook.getSheetAt(0);
    public static void writeIntoCell(int row, int cellIndex, String value){
        XSSFCell cell = sheet.getRow(row).createCell(cellIndex);
        cell.setCellValue(value);

        try {
            workbook.write(file);
            workbook.close();
            file.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        writeIntoCell(0,1,"Privet");
    }

}
