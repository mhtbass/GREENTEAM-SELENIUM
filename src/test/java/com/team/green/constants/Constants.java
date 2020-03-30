package com.team.green.constants;

import org.openqa.selenium.By;

public class Constants {

    //Created by Muhammed BAŞ

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

    public static final By WEEKLY_MOST = By.xpath("//a[@title='Haftanın Çok Satanları - Online Alışveriş']");
    public static final By PHONE3 = By.xpath("//div[@class='Col-sc-1nx8ums-0 fAKJVt'][3]");
    public static final By RECOPHONE = By.id("add-to-basket");
    public static final By PRICE_ONPAGE = By.id("sp-price-highPrice");
    public static final By PRICE_ONBASKET = By.className("new-price");
    public static final By BASKET = By.cssSelector(".gg-ui-btn-default.padding-none");
    public static final By BASKETHOVER = By.className("robot-header-iconContainer-cart");
    public static final By DELETE = By.cssSelector(".btn-delete.hidden-m");

    ////////////////////////////////////////////////////////////////////////////////////

    //Created by Hidayet Güral
    public static final By LOGOUT=By.id("H-UserMenuLogout");

    ////////////////////////////////////////////////////////////////////////////////////

    //Created by  Constans Baran Kısa

    public static final By BIZE_ULAS = By.linkText("Bize Ulaşın");
    public static final By BIZE_YAZIN = By.xpath("//*[@id=\"gg-desktop-design\"]/div[1]/div[1]/img");
    public static final By CANLI_YARDIM = By.xpath("//*[@id=\"gg-desktop-design\"]/div[2]/div[1]/img");
    public static final By BIZI_ARAYIN = By.xpath("//*[@id=\"gg-desktop-design\"]/div[3]/div[1]/img");
    public static final By ALICI = By.xpath("//*[@id=\"gg-desktop-design\"]/div[6]/div/div[1]/button[1]");
    public static final By PUAN_YORUM = By.xpath("//*[@id=\"gg-desktop-design\"]/div[6]/div/div[2]/button[8]");
    public static final By KAYIT_UYELIK = By.xpath("//*[@id=\"gg-desktop-design\"]/div[6]/div/div[2]/button[1]");
    public static final By TELEFON_ARA = By.xpath("//*[@id=\"gg-desktop-design\"]/div[6]/div/div[4]/button");

    public static final By POPU_KAPAT = By.xpath("/html/body/div[2]/div/div[1]/div/button");
    public static final By SLIDER_IN = By.id("HeroBannerContainer");
    public static final By GOTO_SAG = By.xpath("//*[@id=\"HeroBanner\"]/div/i[2]");
    public static final By GOTO_SOL = By.xpath("//*[@id=\"HeroBanner\"]/div/i[1]");

    public static final By PLC_EBY=By.className("dunyadaEbay");
    public static final By CLİCK_AMERIKA=By.id("hpf-US");
    public static final By CLİCK_FRANSA=By.id("hpf-US");
    public static final By CLİCK_BELCIKA=By.id("hpf-US");

    ////////////////////////////////////////////////////////////////////////////////////

    //Created by Ertan Kahraman

    public static final By PRODUCT_NAMEPAGE = By.className("pr-in-nm");
    public static final By RANDOM_PRODUCT = By.id("product_id_485783634");
    public static final By PRODUCT_NAME = By.id("sp-title");
    public static final By PRODUCT_PRICE = By.id("sp-price-lowPrice");
    public static final By PRODUCT_FOLLOW = By.className("robot-headerLinkContainer-myorders");
    public static final By URUN_IADE = By.xpath("//a[@class='robot-headerLinkContainer-help'][2]");
    public static final By UCRETSIZ_KARGO = By.className("gg-icon gg-icon-close-thick");
    public static final By YILDIZ_PRODUCT = By.xpath("//[@id='item-info-block-497073346']/div/div[1]/div[1]/p");
    public static final By ADD_TO_BASKET = By.id("add-to-basket");

    ////////////////////////////////////////////////////////////////////////////////////

    //Created by Can Akkaya

    public static final By CLICK_ELEMENT=By.cssSelector("#item-info-block-509831875 p img");
    public static final By SELECT_PRICE=By.id("sp-price-lowPrice");
    public static final By ADD_TO_CHART = By.id("add-to-basket");
    public static final By CHART_HOVER=By.className("robot-header-iconContainer-cart");
    public static final By CLICK_CHART=By.cssSelector(".gg-ui-btn-default.padding-none");
    public static final By SELECT_CHART_PRICE=By.cssSelector(".total-price-box .total-price>strong");

    public static final By ACCOUNT_OVER_REG = By.className("profile-container");
    public static final By REGISTER_BUTTON = By.id("SignUp");
    public static final By REGISTER_NAME = By.xpath("//*[@name='name']");
    public static final By REGISTER_SURNAME = By.xpath("//*[@name='surname']");
    public static final By REGISTER_MAIL = By.id("suggestion_email_input_verifier");
    public static final By REGISTER_PASSWORD = By.id("pwdField");
    public static final By REGISTER_GSM = By.id("gsmData");
    public static final By REGISTER_CHECK = By.className("checkmark");
    public static final By REGISTER_ENTER = By.id("SubmitForm");







}
