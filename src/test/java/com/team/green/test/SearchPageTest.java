package com.team.green.test;

import com.team.green.base.BaseTest;
import com.team.green.page.SearchPage;
import com.thoughtworks.gauge.Step;

public class SearchPageTest extends BaseTest {

    SearchPage sepetPage;

    @Step({"Siteye gidilir"})
    public void before() {
        sepetPage = new SearchPage(getWebDriver());
    }

    @Step({"Search text <text>"})
    public void searchText (String text){
        sepetPage.search(text);
    }

    @Step({"Click Search"})
    public void searchClick (){
        sepetPage.searchClick();
    }



}
