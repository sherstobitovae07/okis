package tests.homepage;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.homepage.HomePage;
import tests.base.BaseTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static constants.Constants.Urls.PERSONAL_ACCOUNT;


public class HomeTest extends BaseTest {
    @Test (groups = "positive")
    void testLogin(){
        // почему то переходит на единую систему авторизации
        String expectedResult = "https://libidp.pstu.ru/idp/profile/SAML2/Redirect/SSO?execution=e1s1";
        String actualResult;

        homePage.login("sherstobitovae07", "34425012Kate");

        actualResult = driver.getCurrentUrl();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (groups = "search")
    void testFindArticle(){
        String expectedResult = "УМНЫЙ ДОМ: ИСТОРИЯ, ПРИНЦИП РАБОТЫ, УСТРОЙСТВА УМНОГО ДОМА, ПРОТОКОЛЫ";
        String actualResult;

        homePage.findArticle("умный дом");

        actualResult = driver.getTitle();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (groups = "positive")
    void testBtnHomePage(){
        String expectedResult = "НАУЧНАЯ ЭЛЕКТРОННАЯ БИБЛИОТЕКА";
        String actualResult;

        homePage.btnHomePage();

        actualResult = driver.getTitle();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (groups = "positive")
    void testParseNavigator(){
        List<WebElement> actualElements = homePage.parseNavigator();
        List<String> actualResult = new ArrayList<>();
        List<String> expectedResult = Arrays.asList("ЖУРНАЛЫ\nКНИГИ\nПАТЕНТЫ\nПОИСК\nАВТОРЫ\nОРГАНИЗАЦИИ\nКЛЮЧЕВЫЕ СЛОВА\nРУБРИКАТОР");

        // Преобразование веб-элементов в строки
        for (WebElement element : actualElements) {
            actualResult.add(element.getText());
        }

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (groups = "search")
    void testFindAuthor(){
        String expectedResult = "Каменских Анна Александровна - Список публикаций";
        String actualResult;

        homePage.findAuthor("Каменских");

        actualResult = driver.getTitle();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (groups = "search")
    void testFindMagazineVak(){
        String expectedResult = "https://elibrary.ru/contents.asp?titleid=28620";
        String actualResult;

        homePage.findMagazineVAK();

        actualResult = driver.getCurrentUrl();

        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (expectedExceptions= {HomePage.ErrorLogin.class}, groups = "negative")
    void testLoginNegative() throws Exception{
        homePage.login("sherstobitovae07", "34425012Kate");

        homePage.errorOfLogin(PERSONAL_ACCOUNT);
    }
}
