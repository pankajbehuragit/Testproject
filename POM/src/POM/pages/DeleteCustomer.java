package POM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.pom.utility.ConstantUtil;

public class DeleteCustomer {
	public static String Custid;
	public static WebDriver d;
	public DeleteCustomer(WebDriver d) {
		this.d=d;
	}
	@FindBy(how=How.XPATH,using="//a[text()='Delete Customer']")
	WebElement deletecust;
	@FindBy(how=How.NAME,using="cusid")
	WebElement customerid;
	@FindBy(how=How.NAME,using="AccSubmit")
	WebElement submit;

	public void enterdlcust() {
		deletecust.click();
		
	}
	public void entercusid() {
		customerid.sendKeys(ConstantUtil.custId);
	}
	public void entersubm() {
		submit.click();
	}
}
