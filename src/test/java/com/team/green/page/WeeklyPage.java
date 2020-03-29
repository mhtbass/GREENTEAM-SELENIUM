package com.team.green.page;

import com.team.green.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.team.green.constants.Constants.*;

public class WeeklyPage extends BasePage {

    public WeeklyPage(WebDriver driver) {
        super(driver);
    }

    public void clickWeekly(){
        click(WEEKLY_MOST);
    }
    public void clickphone(){
        click(PHONE3);
    }
    public void clickrecophone(){
        click(RECOPHONE);
    }
    public String getTextPage(){
       return getText(PRICE_ONPAGE);
    }
    public void goBasket(){
        hoverElement(BASKETHOVER);
        click(BASKET);
    }

   public void clickDelete(){

        click(DELETE);
    }

    public String getTextBasket(){
        return getText(PRICE_ONBASKET);
    }
}
