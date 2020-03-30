package com.team.green.test;


import com.team.green.base.BaseTest;
import com.team.green.page.LiveSupportPage;
import com.thoughtworks.gauge.BeforeStep;
import com.thoughtworks.gauge.Step;

public class LiveSupportPageTest extends BaseTest {
    LiveSupportPage liveSupport;

    @BeforeStep()
    public void before() {
        liveSupport = new LiveSupportPage(getWebDriver());
    }

    @Step("siteye gidilir")
    public void siteyeGdilir() {
        liveSupport = new LiveSupportPage(getWebDriver());
    }

    @Step("bize ulaşın sekmesine tıklanır")
    public void bizUlsClick() {
        liveSupport.bizUlsClick();
    }


    @Step("bize yazın sekmesine tıklanır")
    public void bizeyazinClick() {
        liveSupport.bizeyazinClick();
    }

    @Step("canlı destek kontrol edilir")
    public void canliyardimClick() {
        liveSupport.canliyardimClick();
    }

    @Step("bizi arayın kontrol edilir")
    public void biziarayinClick() {
        liveSupport.biziarayinClick();
    }

    @Step("alıcıyım seçilir")
    public void aliciyimClick() {
        liveSupport.aliciyimClick();
    }

    @Step("puan ve yorumlar seçilir")
    public void puanveyorumlarClick() {
        liveSupport.puanveyorumlarClick();
    }

    @Step("kayıt olmak ve üyelik işlemleri seçilir")
    public void kayitveuyelikClick() {
        liveSupport.kayitveuyelikClick();
    }

    @Step("telefon numarası görüntülenir")
    public void telefonaraClick() {
        liveSupport.telefonaraClick();
    }


}


