package POM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.pom.utility.ConstantUtil;
import com.sun.corba.se.impl.orbutil.closure.Constant;

public class NewCustomerPage {
	public static WebDriver d;
	public NewCustomerPage(WebDriver d) {
		this.d=d;
	
	}
	@FindBy(how=How.XPATH,using="//a[text()='New Customer']")
	WebElement newcust;
	@FindBy(how=How.NAME,using="name")
	WebElement custname;
	@FindBy(how=How.NAME,using="rad1")
	WebElement gender;
	@FindBy(how=How.NAME,using="dob")
	WebElement dob;
	@FindBy(how=How.NAME,using="addr")
	WebElement add;
	@FindBy(how=How.NAME,using="city")
	WebElement city;
	@FindBy(how=How.NAME,using="state")
	WebElement state;
	@FindBy(how=How.NAME,using="pinno")
	WebElement pin;
	@FindBy(how=How.NAME,using="telephoneno")
	WebElement phone;
	@FindBy(how=How.NAME,using="emailid")
	WebElement mail;
	@FindBy(how=How.NAME,using="password")
	WebElement pwd;
	@FindBy(how=How.NAME,using="sub")
	WebElement submit;
	@FindBy(how=How.XPATH,using="//td[text()='Customer ID']/following-sibling::td")
	WebElement custID;
	public void enternewcutomer() {
	 newcust.click();
	}
	
	public void entercustname(String customername) {
		custname.sendKeys(customername);
		
	}
	public void entergendre() {
		gender.click();
	}
	public void Enterdob(String dateofbirth) {
		dob.sendKeys(dateofbirth);
	}
	public void enteradd(String address) {
		add.sendKeys(address);
	}
	public void entercity(String cit) {
		city.sendKeys(cit);
	}
	public void enterstate(String stat) {
		state.sendKeys(stat);
	}
	public void enterpin(String pinn) {
		pin.sendKeys(pinn);
	}
	public void enterphone(String ph) {
		phone.sendKeys(ph);
	}
	public void entermail(String email) {
		mail.sendKeys(email);
	}
	public void enterpwd(String password) {
		pwd.sendKeys(password);
	}
	public void entersubmit() {
		submit.click();
	}
	public String getCustId() {
		ConstantUtil.custId= custID.getText();
		System.out.println("Customer id is :" + ConstantUtil.custId);
		return ConstantUtil.custId;
	}
			
		
		
		
		
	
		
		
	

}
