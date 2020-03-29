package com.team.green.page;

import com.team.green.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

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
    public void clickFirst(){
        click(FIRST_PRODUCT);
    }
    public void buyNowCatpage(){
        hoverElement(BUYNOWCATE);
        click(BUYNOWCATE);
    }
    public void giveup(){
        click(GIVEUP);
    }
}
