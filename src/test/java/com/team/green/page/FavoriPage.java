package com.team.green.page;

import com.team.green.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.team.green.constants.Constants.*;

public class FavoriPage extends BasePage {
    public FavoriPage(WebDriver driver) {
        super(driver);
    }

    public void clickProduct() {
        click(PRODUCT_PATH);
    }

    public void addfavClick() {
        click(ADDFAV);
    }

    public void clickmyFav(){
        click(MYFAV);
    }

    public void clickBuy(){
        click(BUYNOW);
    }

    public void hoverElement(){
        hoverElement(ACCOUNT_OVER);
    }

}
