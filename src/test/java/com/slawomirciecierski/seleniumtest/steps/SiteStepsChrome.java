
package com.slawomirciecierski.seleniumtest.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import static org.junit.Assert.assertTrue;

public class SiteStepsChrome {


    private ChromeDriver driver;

    //-----------------------------------Before, Given, When, Then, After
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("Użytkownik otworzy stronę Portalu Kujawskiego {string}")
    public void userOpensSitePK(final String websiteUrlPK) {
        driver.get(websiteUrlPK);
    }

    @When("Użytkownik wyszuka słowo w Portalu Kujawskim {string}")
    public void użytkownikWyszukaSlowoPK(String slowoPK) {
        final WebElement searchBoxElement = driver.findElement(By.id("mod-search-searchword"));

        searchBoxElement.click();
        searchBoxElement.clear();
        searchBoxElement.sendKeys(slowoPK);
        searchBoxElement.sendKeys(Keys.ENTER);
    }

    @Then("Użytkownik spodziewa się znaleźć tyle samo lub więcej słów w Portalu Kujawskim niż {string}")
    public void użytkownikZobaczyLiczbaWynikówPK(String liczbaPK) {
        List<WebElement> elements = driver.findElements(By.cssSelector("dd.result-text"));

        assertTrue("Warunek: ilość znalezionych wyrazów: --> " + elements.size() + " <-- jest mniejsza niż spodziewanych: --> " + liczbaPK + " <-- ",
                elements.size() >= Integer.parseInt(liczbaPK));
    }

    @After
    public void finish() {
        driver.close();
    }

}

