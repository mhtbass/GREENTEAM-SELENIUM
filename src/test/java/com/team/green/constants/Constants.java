package com.team.green.constants;

import org.openqa.selenium.By;

public class Constants {

    public static String WEBLINK = "https://www.gittigidiyor.com/";

    public static final By ACCOUNT_OVER = By.className("profile-container");
    public static final By LOGIN_BUTTON = By.className("sign-in-button");
    public static final By LOGIN_EMAIL = By.id("L-UserNameField");
    public static final By LOGIN_PASSWORD = By.id("L-PasswordField");
    public static final By LOGIN_ENTER = By.id("gg-login-enter");
    public static final By POLICIES = By.className("policy-alert-close");
    public static final By CLOSEPOP = By.className("wis-mfp-close-27556");

    public static final By INPUT = By.id("search_word");
    public static final By SEARCH = By.id("header-search-find-link");

    public static final By PRODUCT_PATH = By.xpath("/html/body/div[5]/div[2]/div/div[2]/div[4]/div[2]/ul/li[4]/a/div/p");
    public static final By ADDFAV = By.id("spp-watch-product");
    public static final By MYFAV = By.xpath("//a[text()='Favorilerim']");
    public static final By PROFILE = By.className("afterLoginURL");
    public static final By BUYNOW = By.className("buy-now-button");

    public static final By ELECTRONIC = By.xpath("//p[text()='Elektronik']");
    public static final By ELECTRONICCATEGORY = By.xpath("//a[text()='Dizüstü(Laptop) Notebook Bilgisayar']");
    public static final By TOPPUAN = By.id("filter_crd");
    public static final By PUAN = By.xpath("//div/div[2]/strong");
    public static final By PRODUCT_PAT = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[4]/ul/li[1]/div/a");
    public static final By INCREASE = By.id("buyitnow_adet");
    public static final By PRODUCT_VALUE = By.id("sp-price-highPrice");
    public static final By BUYNOW_BUTTON = By.id("buy-now");
    public static final By NEWPRICE_TOTAL = By.className("new-price");

    public static final By SUPERMARKET = By.xpath("//p[text()='Süpermarket']");
    public static final By CATCATEGORY = By.xpath("//a[text()='Kedi']");
    public static final By GIVEUP = By.id("giveup");
    public static final By BUYNOWCATE = By.id("buy-now");
    public static final By FIRST_PRODUCT = By.xpath("/html/body/div[4]/div[2]/div/div[2]/div[3]/div/ul/li[1]/a/div/p");

}
