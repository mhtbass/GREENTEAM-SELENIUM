package com.team.green.page;

import com.team.green.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.team.green.constants.Constants.*;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }
    public void searchEnterText(String searchText){
        sendKeys(INPUT,searchText);
    }

    public void searchClick(){
        click(SEARCH);
    }

}
