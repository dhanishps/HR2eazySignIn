package pages;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.ElementUtil;

public class SignInPage {
	WebDriver driver;

    public  SignInPage(WebDriver driver) {
    	
        this.driver = driver;

        PageFactory.initElements(driver, this);
}
    
    
    By signInBtn =By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_upDashboard\"]/div[4]/div[2]/div[1]/div[1]/div/div[2]/div[2]"); // Clicking Home Sign in button
    By signInRadioBtn =By.xpath("//*[@id=\"rdoSignIn\"]"); //Sign in Radio Button
    By signInSubmitBtn =By.xpath("//*[@id=\"btnSubmit\"]");  //Sign in Submit button
    By signOutRadioBtn1 =By.xpath("//*[@id=\"rdoSignOut\"]"); //Sign Out Radio Button
    By signOutSubmitBtn1 =By.xpath("//*[@id=\"btnSubmit\"]");//Sign Out Submit button
    

    
    public void SigninPageCLick() throws InterruptedException {

    	ElementUtil elementUtil = new ElementUtil(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        String parentWindow = driver.getWindowHandle();

        elementUtil.clickAction(signInBtn);

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        for (String window : driver.getWindowHandles()) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }

        try {
            WebElement signInRadioButton = wait.until(
                ExpectedConditions.elementToBeClickable(signInRadioBtn)
            );
            signInRadioButton.click();

        } catch (Exception e) {

            System.out.println("Sign In button not shown, so clicking Sign Out first");

            WebElement signOutRadioButton = wait.until(
                ExpectedConditions.elementToBeClickable(signOutRadioBtn1)
            );
            signOutRadioButton.click();

            WebElement signOutSubmitButton = wait.until(
                ExpectedConditions.elementToBeClickable(signOutSubmitBtn1)
            );
            signOutSubmitButton.click();

            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();

            System.out.println("Sign Out alert accepted");

            Thread.sleep(2000);

            // Close old popup after sign out
            driver.close();

            // Go back to parent window
            driver.switchTo().window(parentWindow);

            // Open sign in popup again
            elementUtil.clickAction(signInBtn);

            wait.until(ExpectedConditions.numberOfWindowsToBe(2));

            for (String window : driver.getWindowHandles()) {
                if (!window.equals(parentWindow)) {
                    driver.switchTo().window(window);
                    break;
                }
            }

            WebElement signInRadioButton = wait.until(
                ExpectedConditions.elementToBeClickable(signInRadioBtn)
            );
            signInRadioButton.click();
        }

        // IMPORTANT: Click Sign In submit button
        WebElement signInSubmitButton = wait.until(
            ExpectedConditions.elementToBeClickable(signInSubmitBtn)
        );
        signInSubmitButton.click();

        try {
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
        } catch (Exception e) {
            System.out.println("Sign In alert not shown");
        }

        WebElement messageElement = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='lblMsg']"))
        );

        String actualMessage = messageElement.getText().trim();

        System.out.println("Sign in Message: " + actualMessage);

        if (actualMessage.equals("Signed In Successfully")) {
            System.out.println("Signed In Successful");
        } else {
            Assert.fail("Sign in failed. Message displayed: " + actualMessage);
        }

        driver.close();
        driver.switchTo().window(parentWindow);

        System.out.println("Returned to parent window");
        driver.quit();
    } 
}
