package com.team.green.test;

import com.team.green.base.BaseTest;
import com.team.green.page.ChartPage;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class ChartPageTest extends BaseTest {

    ChartPage chartPage;
    String takeChart;
    @BeforeStep
    public void before() {
        chartPage = new ChartPage(getWebDriver());
    }

    @Step({"Ürüne Tıkla"})
    public void elementClick (){
        chartPage.elementClick();
    }

    @Step({"Sepete Ekledik"})
    public void addChartClick (){
        chartPage.addChartClick();
    }

    @Step({"Sepetin Üstüne Gel"})
    public void hoverChart (){
        takeChart = chartPage.takeTextChart();
        chartPage.hoverChart();
    }

    @Step({"Sepete Git"})
    public void chartClick (){
        chartPage.chartClick();
    }

    @Step({"Ücretleri Karşılaştır"})
    public void priceCheck() {


        Assert.assertEquals(takeChart, chartPage.takeTextPage());
    }

}
