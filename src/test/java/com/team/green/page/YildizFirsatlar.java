package com.team.green.page;

import com.team.green.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.team.green.constants.Constants.*;

public class YildizFirsatlar extends BasePage {
    public YildizFirsatlar(WebDriver driver) {
        super(driver);
    }

    public void ucretsizKargo() {
        click(UCRETSIZ_KARGO);
    }

    public void yildizProduct() {
        click(YILDIZ_PRODUCT);
    }

    public void addToBasket() {
        click(ADD_TO_BASKET);
    }

}
