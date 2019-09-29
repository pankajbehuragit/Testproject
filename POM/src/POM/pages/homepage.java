package POM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class homepage {
	public static WebDriver d;
	public homepage(WebDriver d) {
		this.d=d;
	}
	@FindBy(how=How.XPATH,using="//td[contains(text(),'mngr221298')]")
			WebElement verifyuserid;
		public boolean verifyuserid() {
			String text=verifyuserid.getText();
			if(text.equalsIgnoreCase("mngr221298")) {
				return true;
			}
			else {
				return false;
			}
	}
		public boolean verifytitle() {
			String title=d.getTitle();
			if(title.equalsIgnoreCase("Guru99 Bank Manager Homepage")) {
				System.out.println("homepage title is correct");
				return true;
			}
			else {
				return false;
			}
		    
		}

}
