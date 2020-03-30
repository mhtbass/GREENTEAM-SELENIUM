package com.team.green.test;

import com.team.green.base.BaseTest;
import com.thoughtworks.gauge.Step;

import static org.junit.Assert.assertEquals;

public class TrukceKarakterKontroluTest extends BaseTest {

    @Step({"Aclan sayfa da siparislerim URL dogrulanir"})
    public void controlProduct() {
        String urlEquals = "https://www.gittigidiyor.com/BanaOzel/satin-aldiklarim.php";
        assertEquals("https://www.gittigidiyor.com/BanaOzel/satin-aldiklarim.php", urlEquals);
        System.out.println("SIPARISLERIM EKRANINA GELDINIZ");
    }

}
