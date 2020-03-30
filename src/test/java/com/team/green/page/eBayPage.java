package com.team.green.page;

import com.team.green.base.BasePage;
import org.openqa.selenium.WebDriver;
import static com.team.green.constants.Constants.*;

public class eBayPage extends BasePage {

    public eBayPage(WebDriver driver) {
        super(driver);
    }
    public void eBayPlaceHolder(){
      mouseOver(PLC_EBY);
    }
    public void eBayAmerica(){
        click(CLİCK_AMERIKA);
    }
    public void eBayFransa(){
        click(CLİCK_FRANSA);
    }
    public void eBayBelcika(){
        click(CLİCK_BELCIKA);
    }


}
