package com.team.green.test;

import com.team.green.base.BaseTest;
import com.team.green.page.SearchPage;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.Step;

public class SearchPageTest extends BaseTest{

    SearchPage searchPage;

    @BeforeStep
    public void before() {
        searchPage =new SearchPage(getWebDriver());
    }

    @Step({"Arayama <text> yazıldı"})
    public void searchEnterText(String text) {
        searchPage.searchEnterText(text);
    }

    @Step({"Arama icona tıklandı"})
    public void clickSearch (){
        searchPage.searchClick();
    }
}
