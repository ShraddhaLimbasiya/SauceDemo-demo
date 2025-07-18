package test;

import base.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;


public class LoginTest extends BasePage {

    @Test
    public void validLoginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin", "admin");
        loginPage.clickLogin();
        String text = driver.findElement(By.cssSelector("div[class='fl'] h1")).getText();
        System.out.printf(text);
        Assert.assertEquals(text,"Hello Admin User");
        Assert.assertTrue(driver.getPageSource().contains("Hello Admin User"));
    }
}
