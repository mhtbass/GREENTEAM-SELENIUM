package com.team.green.page;



import com.team.green.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.team.green.constants.Constants.*;

public class ProductFollow extends BasePage {

    public ProductFollow(WebDriver driver) {
        super(driver);
    }

    public void clickProductFollow() {
        click(PRODUCT_FOLLOW);
    }

}
