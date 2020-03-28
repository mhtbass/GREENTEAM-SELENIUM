package com.team.green.test;

import com.team.green.base.BaseTest;
import com.team.green.page.FavoriPage;
import com.team.green.page.SearchPage;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.Step;

public class FavoriPageTest extends BaseTest {

    FavoriPage favoriPage;

    @BeforeStep
    public void before() {
        favoriPage = new FavoriPage(getWebDriver());
    }

    @Step("4.ürüne tıklanır")
    public void clickproduct() {
        favoriPage.clickProduct();
    }

    @Step("Favorilere eklenir")
    public void clickfav() {
        favoriPage.addfavClick();
    }

    @Step("Favorilere tıklanır")
    public void clickmyfav() {
        favoriPage.clickmyFav();
    }

    @Step("Hemen satın al tıklanır")
    public void clickBuy() {
        favoriPage.clickBuy();
    }


}
