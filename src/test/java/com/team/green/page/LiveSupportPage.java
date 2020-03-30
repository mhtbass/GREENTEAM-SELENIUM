package com.team.green.page;


import com.team.green.base.BasePage;
import org.openqa.selenium.WebDriver;

import static com.team.green.constants.Constants.*;

public class LiveSupportPage extends BasePage {

    public LiveSupportPage(WebDriver driver) {
        super(driver);
    }

    public void bizUlsClick() {
        click(BIZE_ULAS);
    }



    public void bizeyazinClick() {
        click(BIZE_YAZIN);
    }
    public void canliyardimClick() {
        click(CANLI_YARDIM);
    }
    public void biziarayinClick() {
        click(BIZI_ARAYIN);
    }
    public void aliciyimClick() {
        click(ALICI);
    }

    public void puanveyorumlarClick() {
        click(PUAN_YORUM);
    }
    public void kayitveuyelikClick() {
        click(KAYIT_UYELIK);
    }
    public void telefonaraClick() {
        click(TELEFON_ARA);
    }




}



