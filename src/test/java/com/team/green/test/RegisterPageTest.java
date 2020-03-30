package com.team.green.test;

import com.team.green.base.BaseTest;
import com.team.green.page.LoginPage;
import com.team.green.page.RegisterPage;
import com.thoughtworks.gauge.Step;

public class RegisterPageTest extends BaseTest {

    RegisterPage registerPage;

    @Step({"Siteye Gir"})
    public void before() {
        registerPage = new RegisterPage(getWebDriver());
    }

    @Step({"Hesaba gel"})
    public void hoverElement (){
        registerPage.hoverElement();
    }

    @Step({"Üye ol"})
    public void clickLogin (){
        registerPage.registerClick();
    }

    @Step({"Name <name> bilgilerini giriyoruz"})
    public void enterName (String name){
        registerPage.enterName(name);
    }

    @Step({"Surname <surname> bilgilerini giriyoruz"})
    public void enterSurname (String surname) { registerPage.enterSurname(surname); }

    @Step({"Mail <mail> bilgilerini giriyoruz"})
    public void enterMail (String mail) { registerPage.enterMail(mail); }

    @Step({"Password <regpassword> bilgilerini giriyoruz"})
    public void enterPassword (String regpassword) { registerPage.enterPassword(regpassword); }

    @Step({"GSM <gsm> bilgilerini giriyoruz"})
    public void enterGSM (String gsm) { registerPage.enterGSM(gsm); }

    @Step({"Checkbox seçilir"})
    public void checkClick (){
        registerPage.checkClick();
    }

    @Step({"Üye ol'a basılır"})
    public void clickRegisterEnter (){ registerPage.clickRegisterEnter(); }
}
