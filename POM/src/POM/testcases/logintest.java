package POM.testcases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pom.utility.ConstantUtil;
import com.pom.utility.ExcelData;

import POM.pages.homepage;
import POM.pages.loginpage;

public class logintest extends testbase{
      @Test
       public void init()throws IOException {
    	  //test=report.createTest("Login To app");
    	  loginpage lgpage=PageFactory.initElements(d,loginpage.class);
    	  //test.info("Login application page");
    	  ExcelData.setExcelFile(ConstantUtil.filepath,"Login");
    	  String username=ExcelData.getcellData(1, 0);
    	  String password=ExcelData.getcellData(1,1);
    	  lgpage.enteruserid(username);
    	 // test.pass("user id entered" + username);
    	  lgpage.enterpasswordid(password);
    	 // test.pass("Password entered" + password);
    	  lgpage.enterlogin();
    	 // test.pass("login button clicked");
    	  homepage hmpage=PageFactory.initElements(d,homepage.class);
    	  boolean titlestatus=hmpage.verifytitle();
    	  if(titlestatus) {
    		  ExcelData.setCellData("Pass", 1, 2);
    		  //test.pass("title is correct");
    	  }else {
    		  ExcelData.setCellData("Fail", 1, 2);
    		 // test.fail("title is wrong");
    	  }
    	  
    	  hmpage.verifyuserid();
      }
}
