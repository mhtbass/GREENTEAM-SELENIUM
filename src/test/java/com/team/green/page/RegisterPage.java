package com.team.green.page;

import com.team.green.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.team.green.constants.Constants.*;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void hoverElement(){
        hoverElement(ACCOUNT_OVER_REG);
    }

    public void registerClick() {
        click(REGISTER_BUTTON);
    }

    public void enterName(String name) { sendKeys(REGISTER_NAME,name); }

    public void enterSurname(String surname) { sendKeys(REGISTER_SURNAME,surname); }

    public void enterMail(String mail) { sendKeys(REGISTER_MAIL,mail); }

    public void enterPassword(String regpassword) { sendKeys(REGISTER_PASSWORD,regpassword); }

    public void enterGSM(String gsm) { sendKeys(REGISTER_GSM,gsm); }

    public void checkClick(){
        click(REGISTER_CHECK);
    }

    public void clickRegisterEnter(){
        click(REGISTER_ENTER);
    }

}
