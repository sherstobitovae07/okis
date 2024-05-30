
package constants;

import org.openqa.selenium.By;

public class Constants {
    public static class Urls{
        public static final By USERNAME = By.id("login");
        public static final By PASSWORD = By.id("password");
        public static final By SIGNIN_BY = By.xpath("//a[contains(text(),'Вход')]");
        public static final By FIND_ARTICLE = By.cssSelector("#ftext");
        public static final By BUTTON_FIND_ARTICLE = By.cssSelector("#win_search > table:nth-child(1) > tbody > tr:nth-child(1) > td > div.butblue");
        public static final By THE_FIRST_ARTICLE = By.cssSelector("#a44695461 > td:nth-child(2) > span > a");
        public static final By BUTTON_HOME_PAGE = By.cssSelector("#leftcol > table > tbody > tr:nth-child(1) > td > a > img");
        public static final By PARSE_NAVIGATOR = By.cssSelector("#win_goto > table:nth-child(2) > tbody");
        public static final By PERSONAL_ACCOUNT = By.cssSelector("#win_session > table:nth-child(2) > tbody > tr:nth-child(2) > td > font > a");
        public static final By NAVIGATOR_AUTHOR = By.cssSelector("#win_goto > table:nth-child(2) > tbody > tr:nth-child(5) > td:nth-child(2) > a");
        public static final By INPUT_SURNAME_AUTHOR = By.cssSelector("#surname");
        public static final By BUTTON_FIND_AUTHOR = By.cssSelector("#show_param > table:nth-child(6) > tbody > tr:nth-child(2) > td:nth-child(6) > div");
        public static final By CLICK_AUTHORS_ARTICLES = By.cssSelector("#a641861 > td:nth-child(4) > div > a:nth-child(1)");
        public static final By CLICK_NAVIGATOR_MAGAZINE = By.cssSelector("#win_goto > table:nth-child(2) > tbody > tr:nth-child(1) > td:nth-child(2) > a");
        public static final By CLICK_MAGAZINE_VAK = By.cssSelector("#vak");
        public static final By BUTTON_FIND_MAGAZINE_VAK = By.cssSelector("#show_param > table:nth-child(9) > tbody > tr:nth-child(2) > td:nth-child(6) > div");
        public static final By CLICK_THE_FIRST_MAGAZINE = By.cssSelector("#a28620 > td:nth-child(4) > a");
    }

    public static class TimeOutVariable{
        public static final int IMPLICIT_WAIT = 5;
        public static final int EXPLICIT_WAIT = 20;

    }
}
