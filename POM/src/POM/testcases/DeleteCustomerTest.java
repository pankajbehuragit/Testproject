package POM.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POM.pages.DeleteCustomer;
import POM.pages.EditCustomer;

public class DeleteCustomerTest extends testbase {
	@Test
	public void dltcust() {
		DeleteCustomer dlt=PageFactory.initElements(d,DeleteCustomer.class);
		dlt.enterdlcust();
		dlt.entercusid();
		dlt.entersubm();
		d.switchTo().alert().accept();
	}

}
