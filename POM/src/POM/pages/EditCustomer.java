package POM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.pom.utility.ConstantUtil;
import com.sun.corba.se.impl.orbutil.closure.Constant;

import POM.testcases.NewcustomerTest;

public class EditCustomer {
	public static String Custid;
	public static WebDriver d;
	public EditCustomer(WebDriver d) {
		this.d=d;
	
	}
	@FindBy(how=How.NAME,using="cusid")
	WebElement custIDTextBox;
	@FindBy(how=How.XPATH,using="//a[text()='Edit Customer']")
	WebElement editcust;
	@FindBy(how=How.NAME,using="AccSubmit")
	WebElement submit;
	@FindBy(how=How.NAME,using="addr")
	WebElement address;
	
	public void entereditcust() {
		editcust.click();
		
	}
	public void entercustid() {
		//NewcustomerTest cct=new NewcustomerTest();
		custIDTextBox.sendKeys(ConstantUtil.custId);
	}
	public void entersubmit() {
	
		submit.click();
	}
	public void enteraddr(String Addrs) {
		address.clear();
		address.sendKeys(Addrs);
	}

}
