package com.team.green.test;

import com.team.green.base.BaseTest;
import com.team.green.page.KategoriKediPage;
import com.team.green.page.LoginPage;
import com.team.green.page.PuanPage;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.Step;

public class KategoriKediPageTest extends BaseTest {

    KategoriKediPage kategoriKediPage;

    @BeforeStep
    public void before() {
        kategoriKediPage = new KategoriKediPage(getWebDriver());
    }


    @Step("Süpermarket kategorisine tıklanır")
    public void clickSupermarket() {
        kategoriKediPage.hoversuper();
    }

    @Step("Kedi secenegi seçilir")
    public void clickCat() {
        kategoriKediPage.clickCat();
    }

    @Step("Kedi Güvenlik Ürünleri seçilir")
    public void clickCatSecur() {

        kategoriKediPage.clickCatSecur();
    }


    @Step("25-50 TL arası seçilir")
    public void choosePrice() {
        kategoriKediPage.click2550();
    }

    @Step("İlk ürüne tıklanır")
    public void clickFirst() {
        kategoriKediPage.clickFirst();
    }
}
