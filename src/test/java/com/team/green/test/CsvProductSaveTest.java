package com.team.green.test;

import com.team.green.base.BaseTest;
import com.team.green.page.CsvProductSave;
import com.thoughtworks.gauge.Step;

public class CsvProductSaveTest extends BaseTest {
    CsvProductSaveTest csvProductSaveTest;


    @Step("<urunAdi> ve <urunFiyati> nı <csv> dosyasına kaydet")
    public void productInfo(String urunAdi, String Urunfiyat, String csv) {
        CsvProductSave sepetPage = null;
        sepetPage.productClick();
    }

}
