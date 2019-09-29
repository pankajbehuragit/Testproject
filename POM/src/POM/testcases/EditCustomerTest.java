package POM.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import POM.pages.EditCustomer;

public class EditCustomerTest extends testbase{
	@Test
	public void EditCust() {
	EditCustomer ect=	PageFactory.initElements(d,EditCustomer.class);
		ect.entereditcust();
		ect.entercustid();
		ect.entersubmit();
		ect.enteraddr("ctc");
	}

}
