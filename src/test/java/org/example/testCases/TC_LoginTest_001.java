package org.example.testCases;
import org.example.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_001 extends BaseClass {

    @Test
    public void loginTest() {
        driver.get(baseURL);
        logger.info("URL is launched");
        LoginPage login = new LoginPage(driver);
        login.setUserName(username);
        logger.info("username is entered");
        login.setPassword(password);
        logger.info("password is entered");
        login.clickSubmit();
        logger.info("submit is clicked");
        if (driver.getTitle().equals("GTPL Bank Manager HomePage"))
        {
            Assert.assertTrue(true);
            logger.info("test case is passed");
        }
        else
        {
            Assert.assertTrue(false);
            logger.info("test case is failed");
        }
    }
}
