package com.shafiqistaken.xql.excel;

import java.io.File; 
import java.io.FileInputStream; 
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet; 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.shafiqistaken.xql.data.SheetData;

public class ExcelReader {
    public static SheetData load(File file) throws IOException {
        FileInputStream fileStream = new FileInputStream(file);
        Workbook workbook = new XSSFWorkbook(fileStream);

        Sheet sheet = workbook.getSheetAt(0);

        SheetData sheetData = new SheetData();

        Row headerRow = sheet.getRow(0);
        for (Cell cell : headerRow) {
            sheetData.addHeader(cell.getStringCellValue());
        }

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            sheetData.addRow(j -> {
                Cell cell = row.getCell(j);
                return cell == null ? null : cell.toString();
            });
        }

        workbook.close();

        return sheetData;
    }

    // private static String getCellValue(Cell cell) {
    //     if (cell == null) return "";
    //     switch (cell.getCellType()) {
    //         case STRING:
    //             return cell.getStringCellValue();
    //         case NUMERIC:
    //             if (DateUtil.isCellDateFormatted(cell)) {
    //                 return cell.getDateCellValue().toString();
    //             } else {
    //                 return String.valueOf(cell.getNumericCellValue());
    //             }
    //         case BOOLEAN:
    //             return String.valueOf(cell.getBooleanCellValue());
    //         case FORMULA:
    //             return cell.getCellFormula();
    //         default:
    //             return "";
    //     }
    // }
}