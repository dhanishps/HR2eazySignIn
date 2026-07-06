package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import utilities.Utilities;

public class LoginTest extends BaseClass{
	@Test(dataProvider = "SignInDatas",dataProviderClass = Utilities.class,enabled=true)
	public void SignInPage(String username, String password) throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);

	    System.out.println("Logging in with : " + username);

	    loginPage.LoginUserName(username);
	    System.out.println(username);
	    loginPage.LoginUserPass(password);
	    System.out.println(password);
	    loginPage.ClickAction();

	    try {
	        loginPage.InformationPanel();
	    } catch (Exception e) {
	    }
	    pages.SignInPage sinInPage=new pages.SignInPage(driver);
	    sinInPage.SigninPageCLick();
	    
	}
}
