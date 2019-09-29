package POM.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pom.utility.ConstantUtil;
import com.pom.utility.ExcelData;

import POM.pages.NewCustomerPage;

public class NewcustomerTest extends testbase {


	@Test
	public void customer() {
		NewCustomerPage ncp=PageFactory.initElements(d, NewCustomerPage.class);
		ExcelData.setExcelFile(ConstantUtil.filepath,"CreateCustomer");
		String Customername=ExcelData.getcellData(1, 0); 
		int Dob=ExcelData.getNumericCellData(1,1);
    	String Address=ExcelData.getcellData(1,2);
		String city=ExcelData.getcellData(1,3);
		String state=ExcelData.getcellData(1,4);
		int pin=ExcelData.getNumericCellData(1,5);
		int Mobno=ExcelData.getNumericCellData(1,6);
		String email=ExcelData.getcellData(1,7);
		String password=ExcelData.getcellData(1,8);
		ncp.enternewcutomer();
		ncp.entercustname(Customername);
		ncp.Enterdob(String.valueOf(Dob));
		ncp.enteradd(Address);
		ncp.entercity(city);
		ncp.enterstate(state);
		ncp.enterpin(String.valueOf(pin));
		ncp.enterphone(String.valueOf(Mobno));
		ncp.entermail(email);
		ncp.enterpwd(password);
		ncp.entersubmit();
		ncp.getCustId();


	}

}
