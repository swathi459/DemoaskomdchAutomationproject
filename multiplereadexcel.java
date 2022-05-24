package automationproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class multiplereadexcel {
	
	public static String username;
	public static String password;
	
	
	public static void  readexcelsheet() throws IOException, InterruptedException {
		
		File f = new File(".\\src\\automationproject\\ReadExcel.xlsx");
				
		FileInputStream fis = new FileInputStream(f);
		
		try (XSSFWorkbook wrkbook = new XSSFWorkbook(fis)) {
			XSSFSheet sh = wrkbook.getSheetAt(0);
			XSSFSheet sh1 =wrkbook.getSheetAt(1);
			System.out.println("The name of the first data sheet is :" +sh.getSheetName());
			System.out.println("The name of the second data sheet is:" +sh1.getSheetName());
			int trownum = sh.getPhysicalNumberOfRows();
			System.out.println("The number of rows in test data sheet is:"     +trownum);
			int rownum2 = sh1.getPhysicalNumberOfRows();
			System.out.println("The number of rows in test scenario sheet is:" +rownum2);
			
				for ( int i=1;i<trownum; i++)
				{
					XSSFRow row = sh.getRow(i);
					username = row.getCell(0).getStringCellValue();
					System.out.println("username is:  " +username);
					password =  row.getCell(1).getStringCellValue();
					System.out.println("password is:  "  +password);
					for ( int k=1; k<rownum2; k++)
			        {
				    XSSFRow row1 = sh1.getRow(k);
				    String userin = row1.getCell(1).getStringCellValue();
					if (userin.equalsIgnoreCase("YES"))
				     {
				      String usercase= row1.getCell(0).getStringCellValue();
				      
				        switch (usercase) {
				        
						   case "Login": 
								Loginpage.userdetails();
								break;
								
						   case "Addtocart":
								Addtocartpage.addtocartdetails();
							    break;
							    
					       case "Checkout":
								Checkoutpage.checkoutdetails();
								break;
								
					       case "Orderhistory":
					    	    Orderhistory.orderhistorydetails();
					    	    break;
					    	    
						   case "Logout":
								Logoutpage.logoutdetails();
								break; 
						   
						   
							}
				      	} 
					
					else {
					
						continue;
				      
					}
					
					
							
				}
				
			}
		}
		
		
		
	}	
		
	}


