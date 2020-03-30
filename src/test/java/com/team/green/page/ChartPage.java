package com.team.green.page;

import com.team.green.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.team.green.constants.Constants.*;

public class ChartPage extends BasePage {

    public ChartPage(WebDriver driver) {
        super(driver);
    }


    public void elementClick() {
        click(CLICK_ELEMENT);
    }

    public String takeTextPage() {return getText(SELECT_PRICE);}

    public void addChartClick() {
        click(ADD_TO_CHART);
    }

    public void hoverChart(){
        hoverElement(CHART_HOVER);}

    public void chartClick() {
        click(CLICK_CHART);
    }

    public String takeTextChart() {return getText(SELECT_CHART_PRICE);}
}
