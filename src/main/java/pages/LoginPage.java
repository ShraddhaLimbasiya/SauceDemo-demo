package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.id("uid");
    private By passwordField = By.id("passw");
    private By loginBtn = By.name("btnSubmit");
    private By errorMsg = By.cssSelector("div[class='fl'] h1");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }

    public String getMessage(){
        return driver.findElement(errorMsg).getText();
    }

    public void login(String username, String password){
        enterUsername(username);
        enterPassword(password);
    }

}
