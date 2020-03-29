package com.team.green.page;

import com.team.green.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.team.green.constants.Constants.*;

public class KategoriKediPage extends BasePage {
    public KategoriKediPage(WebDriver driver) {
        super(driver);
    }

    public void hoversuper(){
        hoverElement(SUPERMARKET);
    }

    public void clickCat(){
        click(CATCATEGORY);
    }
    public void clickCatSecur(){
        click(CATCATEGORY2);
    }

    public void click2550(){
        click(PRICE_2550);
    }
    public void clickFirst(){
        click(FIRST_PRODUCT);
    }
}
