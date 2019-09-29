package POM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpage {
	public static WebDriver d;
	public loginpage(WebDriver d) {
		this.d=d;
	
	}
	@FindBy(how=How.NAME,using="uid")
	WebElement userid;
	@FindBy(how=How.NAME,using="password")
	WebElement passwordid;
	@FindBy(how=How.NAME,using="btnLogin")
	WebElement loginid;
	public void enteruserid(String username) {
		userid.sendKeys(username);
	}
	  public void enterpasswordid(String password) {
		  passwordid.sendKeys(password);
	  }
	  public void enterlogin() {
		  loginid.click();
	  }
	}
	


