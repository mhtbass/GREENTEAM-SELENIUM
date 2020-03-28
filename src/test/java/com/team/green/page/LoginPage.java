package com.team.green.page;

import com.team.green.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.team.green.constants.Constants.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginClick() {
        click(LOGIN_BUTTON);
    }

    public void hoverElement(){
        hoverElement(ACCOUNT_OVER);
    }

    public void enterEmail(String email){
        sendKeys(LOGIN_EMAIL,email);
    }

    public void enterPassword(String password){
        sendKeys(LOGIN_PASSWORD,password);
    }

    public void clickLoginEnter(){
        click(LOGIN_ENTER);
    }
}
