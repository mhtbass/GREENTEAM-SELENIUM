package com.team.green.page;

import com.team.green.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileWriter;
import java.io.IOException;

import static com.team.green.constants.Constants.PRODUCT_NAME;
import static com.team.green.constants.Constants.PRODUCT_PRICE;

public class CsvProductSave extends BasePage {


    public CsvProductSave(WebDriver driver) {
        super(driver);
    }

    public void cvsUrunKaydet(String urunFiyati, String urunAdi, String dosyaAdi) throws IOException {
        FileWriter csvWriter = new FileWriter(dosyaAdi);
        csvWriter.append("\"" + urunAdi + "\"");
        csvWriter.append(",");
        csvWriter.append("\"" + urunFiyati + "\"");
        csvWriter.flush();
        csvWriter.close();
    }

    public void csvKaydet(String urunAdi, String Urunfiyat, String csv) throws IOException {

        WebElement urunadi = findElement(PRODUCT_NAME);
        WebElement urunfiyat = findElement(PRODUCT_PRICE);
        cvsUrunKaydet(urunadi.getText(), urunfiyat.getText(), csv);


    }

    public void productClick() {
    }
}
