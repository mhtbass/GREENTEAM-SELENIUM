package com.team.green.page;

import com.team.green.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.team.green.constants.Constants.*;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public SearchPage search(String product){
        sendKeys(INPUT,product);
        return this;
    }

    public SearchPage searchClick() {
        click(SEARCH);
        return this;
    }
    public String getText(){
        return  getText(PRODUCT_NAMEPAGE);

    }

}
