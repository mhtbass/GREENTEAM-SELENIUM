package com.team.green.page;

import com.team.green.base.BasePage;
import org.openqa.selenium.WebDriver;


import static com.team.green.constants.Constants.*;

public class SliderPage extends BasePage {
    public SliderPage(WebDriver driver) {
        super(driver);
    }

    public void popukapatClick() {

       click(POPU_KAPAT);


    }
    public void sliderClick() {

        hoverElement(SLIDER_IN);


    }
    public void sagClick() {
        for(int i=0; i<=5; i++) {
            click(GOTO_SAG);
        }

    }

    public void solClick() {
        for(int i=0; i<=5; i++) {
            click(GOTO_SOL);
        }

    }
}
