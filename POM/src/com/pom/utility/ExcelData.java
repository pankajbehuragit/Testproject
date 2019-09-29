package com.pom.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
      private static XSSFWorkbook workbook;
      private static XSSFSheet sheet;
      private static XSSFCell cell;
      private static XSSFRow row;
      
      public static void setExcelFile(String path,String sheetname) {
    	  try {
    		  FileInputStream fis=new FileInputStream(path);
    		  workbook=new XSSFWorkbook(fis);
    		  sheet=workbook.getSheet(sheetname);
    	  }catch(Exception e) {
    		  e.printStackTrace();
    	  }
      }
      public static String getcellData(int rowNum,int columnNo) {
    	  try {
    		  cell=sheet.getRow(rowNum).getCell(columnNo);
    		  String celldata=cell.getStringCellValue();
    		  return celldata;
    		 
    	  }catch(Exception e) {
    		  e.printStackTrace();
    		  return"";
    	  }
      } 
      public static int getNumericCellData(int rowNum,int columnNo) {
    	  try {
    	  cell=sheet.getRow(rowNum).getCell(columnNo);
    	  int celldata=(int)cell.getNumericCellValue();
    	  return celldata;
    	  }catch(Exception e) {
    		  e.printStackTrace();
    		  return 0;
    	  }
      }
       public static void setCellData(String result,int rowNum,int columnNo)throws IOException{
    	   try {
    		   row=sheet.getRow(rowNum);
    		   cell=row.getCell(columnNo,Row.RETURN_BLANK_AS_NULL);
    		   if(cell==null) {
    			   cell=row.createCell(columnNo);
    			   cell.setCellValue(result);
    		   }else {
    			   cell.setCellValue(result);
    		   }
    		   FileOutputStream fos=new FileOutputStream(ConstantUtil.filepath);
    		   workbook.write(fos);
    		   fos.flush();
    	   }catch(Exception e) {
    		   e.printStackTrace();
    		   }
    	   }
      
            
    	    
    	  
      }

