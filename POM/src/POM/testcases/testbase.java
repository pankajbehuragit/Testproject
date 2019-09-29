package POM.testcases;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.pom.utility.ConstantUtil;

public class testbase {
	public static WebDriver d=null;
	public ExtentReports report;
	public ExtentTest test;
	@BeforeSuite
	public void initialise() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\POM\\drivers\\chromedriver.exe");
				d=new ChromeDriver();
		        d.manage().window().maximize();
		        d.get(ConstantUtil.Url);
			//ExtentHtmlReporter rep= new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"//Report//extentreport.html"));
			//report=new ExtentReports();
			//report.attachReporter(rep);
	}
	 @AfterSuite
	  public void teardown() {
		 d.close();
		// report.flush();
	 }
	 
}
