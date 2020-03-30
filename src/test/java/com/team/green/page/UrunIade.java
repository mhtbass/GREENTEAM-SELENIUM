package com.team.green.page;



import com.team.green.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.team.green.constants.Constants.URUN_IADE;

public class UrunIade extends BasePage {

    public UrunIade(WebDriver driver) {
        super(driver);
    }

    public void clickUrunIade() {
        click(URUN_IADE);
    }

}
