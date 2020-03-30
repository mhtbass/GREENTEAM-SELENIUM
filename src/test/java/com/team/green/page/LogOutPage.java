package com.team.green.page;

import com.team.green.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.team.green.constants.Constants.*;

public class LogOutPage extends BasePage {

    public LogOutPage (WebDriver driver) {
        super(driver);
    }

    public void logOutClick() {
        click(LOGOUT);
    }

    public void accountOVer() {
        hoverElement(ACCOUNT_OVER);
    }

}
