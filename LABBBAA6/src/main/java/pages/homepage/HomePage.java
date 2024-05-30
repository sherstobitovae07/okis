package pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

import java.util.List;

import static constants.Constants.Urls.*;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public WebElement clickElement(By locator){
        WebElement btnFind = driver.findElement(locator);
        waitElementIsVisible(btnFind).click();

        return btnFind;
    }
    public String login(String username, String password){
        driver.findElement(USERNAME).sendKeys(username); // вводим логин
        driver.findElement(PASSWORD).sendKeys(password); // вводим пароль

        clickElement(SIGNIN_BY); // нажимаем на вход

        return username;
    }

    public HomePage findArticle(String nameOfArticle){
        driver.findElement(FIND_ARTICLE).sendKeys(nameOfArticle);
        clickElement(BUTTON_FIND_ARTICLE);
        clickElement(THE_FIRST_ARTICLE);

        return this;
    }

    public HomePage btnHomePage(){
        findArticle("УМНЫЙ ДОМ: ИСТОРИЯ, ПРИНЦИП РАБОТЫ, УСТРОЙСТВА УМНОГО ДОМА, ПРОТОКОЛЫ");
        clickElement(BUTTON_HOME_PAGE);

        return this;
    }

    public List<WebElement> parseNavigator(){
        List<WebElement> listOfElementsNavigator = driver.findElements(PARSE_NAVIGATOR);

        return listOfElementsNavigator;
    }

    public HomePage findAuthor(String surname){
        clickElement(NAVIGATOR_AUTHOR);
        driver.findElement(INPUT_SURNAME_AUTHOR).sendKeys(surname);
        clickElement(BUTTON_FIND_AUTHOR);
        clickElement(CLICK_AUTHORS_ARTICLES);

        return this;
    }
    public HomePage findMagazineVAK(){
        clickElement(CLICK_NAVIGATOR_MAGAZINE);
        clickElement(CLICK_MAGAZINE_VAK);
        clickElement(BUTTON_FIND_MAGAZINE_VAK);
        clickElement(CLICK_THE_FIRST_MAGAZINE);

        return this;
    }
    public boolean errorOfLogin(By errorLocator) throws Exception{
        try {
            driver.findElement(errorLocator).click();
            return false;
        } catch (org.openqa.selenium.NoSuchElementException e){
            throw new ErrorLogin("Вы попали на страницу единой системы авторизации");
        }
    }

    public static class ErrorLogin extends Exception {
        public ErrorLogin(String message){
            super(message);
        }
    }
}
