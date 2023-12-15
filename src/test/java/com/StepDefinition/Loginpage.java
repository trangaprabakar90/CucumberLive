package com.StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Hooks.Hooks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Loginpage {

	@Given("Verify the Sytem Navigated to the login Page")
	public void verify_the_sytem_navigated_to_the_login_page() {

		String Text = Hooks.driver.findElement(By.xpath("//h5[text()='Login']")).getText();
		if (Text.equals("Login")) {
			System.out.println("Login Text Same");
		} else {
			System.out.println("Login Text not Same");
		}

	}

	@Given("Enter the credentials Username {string} & Password {string}")
	public void enter_the_credentials_username_password(String Username, String Password) {

		WebElement UName = Hooks.driver.findElement(By.name("username"));
		UName.sendKeys(Username);

		WebElement Pword = Hooks.driver.findElement(By.name("password"));
		Pword.sendKeys(Password);
	}

	@When("Click on the Login Button")
	public void click_on_the_login_button() {

		WebElement LoginButton = Hooks.driver.findElement(By.xpath("//button[text()=' Login ']"));
		LoginButton.click();
	}

	@When("Verify the system Navigated to the Orange HRM Home Page")
	public void verify_the_system_navigated_to_the_orange_hrm_home_page() {

		String text = Hooks.driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		 if(text=="Dashboard") 
		 { System.out.println("Dashboard Same"); 
		 }else {
			 System.out.println("Dashboard not Same");
			 }
			 

	}

	@Given("Verify the Username & Password field label Names")
	public void verify_the_username_password_field_label_names() {

		WebElement Unamelabel = Hooks.driver.findElement(By.xpath("//label[text()='Username']"));
		String Unamelabelchk = Unamelabel.getText();
		if (Unamelabelchk.equals("Username")) {
			System.out.println("Username Label Text is Same");
		} else {
			System.out.println("Username Label Text not is Same");
		}

		WebElement Pwordlabel = Hooks.driver.findElement(By.xpath("//label[text()='Username']"));
		String Pwordlabelchk = Unamelabel.getText();
		if (Pwordlabelchk.equals("Password")) {
			System.out.println("Password Label Text is Same");
		} else {
			System.out.println("Password Label Text not is Same");
		}

	}

	@When("Verify the Forgotpassword Text is present")
	public void verify_the_forgotpassword_text_is_present() {

		WebElement forgotPword = Hooks.driver.findElement(By.xpath("//p[text()=\"Forgot your password? \"]"));
		boolean forgotPworddisplayed = forgotPword.isDisplayed();
		System.out.println(forgotPworddisplayed);
		String forgotPwordlinkchk = forgotPword.getText();
		if (forgotPwordlinkchk.equals("Password")) {
			System.out.println("forgot Password Link Text is Same");
		} else {
			System.out.println("Password Label Text not is Same");
		}

	}

	@When("Verify the site footer is displayed")
	public void verify_the_site_footer_is_displayed() {

		WebElement footer1 = Hooks.driver.findElement(By.xpath("//p[text()='OrangeHRM OS 5.5']"));
		String footer1text = footer1.getText();
		if (footer1text.equals("OrangeHRM OS 5.5")) {
			System.out.println("Footer1 text is Same");
		} else {
			System.out.println("Footer1 text is not Same");
		}

		WebElement footer2 = Hooks.driver.findElement(By.xpath("//p[text()='© 2005 - 2023 ']']"));
		String footer2text = footer2.getText();
		if (footer2text.equals("© 2005 - 2023 ")) {
			System.out.println("Footer2 text is Same");
		} else {
			System.out.println("Footer2 text is not Same");
		}


	}

	
	

}
