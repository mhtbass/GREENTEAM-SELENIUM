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

    public static final By PRODUCT_PATH = By.xpath("//p[@class='image-container'][4]");
    public static final By ADDFAV = By.className("gg-icon.gg-icon-favorite-pdp");

}
