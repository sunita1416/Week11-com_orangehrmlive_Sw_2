package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUP() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        // Click on the 'Forgot your password' link
        WebElement forgotPasswordText = driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']"));
        forgotPasswordText.click();


        // Verify the text 'Reset Password' ////div[@class='orangehrm-login-forgot']
        //  WebElement resetPasswordText = driver.findElement(By.xpath("//h1[contains(text(), 'Reset Password')]"));
        // Assert.assertEquals(resetPasswordText.getText(), "Reset Password");



        }
    @After
    public void tearDown () {
        closeBrowser();
    }
}





