package com.team.green.page;

import com.team.green.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.team.green.constants.Constants.*;

public class PuanPage extends BasePage {

    public PuanPage(WebDriver driver) {
        super(driver);
    }

    public void hoverElect(){
        hoverElement(ELECTRONIC);
    }

    public void clickElectronic(){
        click(ELECTRONICCATEGORY);
    }

    public  void clickTop(){
        click(TOPPUAN);
    }

    public String getCheck(){
        return getText(PUAN);
    }

    public void clickProductt(){
        click(PRODUCT_PAT);
    }

    public void increaseProduct(){
        sendKeys(INCREASE,"2");
    }
    public void clickBuyNow(){
        click(BUYNOW_BUTTON);
    }

    public int getProductvalue(){
        String productValue = getText(PRODUCT_VALUE);
        productValue=productValue.replaceAll("[^\\d]", "");
        int value = Integer.parseInt(productValue);
        System.out.println(value);
        return value;
    }

    public int getNowTotal(){
        String productValue2= getText(NEWPRICE_TOTAL);
        productValue2=productValue2.replaceAll("[^\\d]", "");
        int value2 = Integer.parseInt(productValue2);
        System.out.println("**************** "+value2);
        return value2;
    }
}
