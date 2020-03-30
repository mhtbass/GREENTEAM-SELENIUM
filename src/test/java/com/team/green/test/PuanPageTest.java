package com.team.green.test;

import com.team.green.page.PuanPage;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

import static com.team.green.base.BaseTest.getWebDriver;

public class PuanPageTest {
    PuanPage puanPage;


    @BeforeStep
    public void before() {
        puanPage =new PuanPage(getWebDriver());
    }

    @Step({"Elektronik tıklanır"})
    public void enterEmail (){
        puanPage.hoverElect();
    }

    @Step({"Dizuztu bilgisayar kategorsine tıklar"})
    public void clickLaptop (){
        puanPage.clickElectronic();
    }

    @Step({"Selectbox’tan puana gore(once enyuksek) seçilir"})
    public void selectTop (){
        puanPage.clickTop();
    }

    @Step({"İlk ürünün puanin 5.0 oldugu kontrol edilir"})
    public void checkFirstproduct (){

        Assert.assertEquals(puanPage.getCheck(),"5.0");

    }

    @Step({"İlk ürüne tıkla"})
    public void clickPro (){
       puanPage.clickProductt();
    }

    @Step({"Adeti arttır"})
    public void increatePro (){

        puanPage.increaseProduct();
    }
    @Step({"Hemen satın al tıklanıyor"})
    public void clickBuy (){
        puanPage.clickBuyNow();
    }

    @Step({"Ürünün fiyatı yazdırılır"})
    public void lastPrice (){
        int lastprice=puanPage.getNowTotal();
         System.out.println("Product value = "+lastprice);
    }




}
