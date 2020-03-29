package com.team.green.test;

import com.team.green.base.BaseTest;
import com.team.green.page.LoginPage;
import com.thoughtworks.gauge.Step;

import java.util.concurrent.TimeUnit;


public class LoginPageTest extends BaseTest {

    LoginPage loginPage;

    @Step({"Siteye Giriş Yaptık"})
    public void before() {
        loginPage = new LoginPage(getWebDriver());
        loginPage.closePolicie();
    }

    @Step({"Hesabımın üstüne gelir"})
    public void hoverElement (){
        loginPage.hoverElement();
    }

    @Step({"Giriş yap"})
    public void clickLogin (){
        loginPage.loginClick();
    }

    @Step({"Email <email> bilgilerini giriyoruz"})
    public void enterEmail (String email){
        loginPage.enterEmail(email);
    }

    @Step({"Şifre <password> giriyoruz"})
    public void enterPassword (String password){
        loginPage.enterPassword(password);
    }

    @Step({"Giriş yap tuşuna basılır"})
    public void clickLoginEnter (){
        loginPage.clickLoginEnter();
    }

    @Step({"Pop kapatılır"})
    public void closePop () throws InterruptedException {
        loginPage.closePop();
        Thread.sleep(1000);
    }

}
