package com.team.green.constants;

import org.openqa.selenium.By;

public class Constants {

    public static String WEBLINK = "https://www.gittigidiyor.com/";

    public static final By ACCOUNT_OVER = By.className("profile-container");
    public static final By LOGIN_BUTTON = By.className("sign-in-button");
    public static final By LOGIN_EMAIL = By.id("L-UserNameField");
    public static final By LOGIN_PASSWORD = By.id("L-PasswordField");
    public static final By LOGIN_ENTER = By.id("gg-login-enter");

    public static final By INPUT = By.id("search_word");
    public static final By SEARCH = By.id("header-search-find-link");

    public static final By PRODUCT_PATH = By.xpath("/html/body/div[5]/div[2]/div/div[2]/div[4]/div[2]/ul/li[4]/a/div/p");
    public static final By ADDFAV = By.id("gg-icon-favorite-pdp");
    public static final By MYFAV = By.xpath("//a[text()='Favorilerim']");
    public static final By BUYNOW = By.className("buy-now-button");


}
