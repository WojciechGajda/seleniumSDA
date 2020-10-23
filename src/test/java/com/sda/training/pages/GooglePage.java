package com.sda.training.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class GooglePage extends BasePage {
    @FindBy(how = How.NAME, using = "q")
    private WebElement searchField;
    @FindBy(how = How.ID, using = "rcnt")
    private WebElement resultsWebPart;
    @FindBy(how = How.ID, using = "introAgreeButton")
    private WebElement introAgreeButton;
    public void openGooglePage() {
        String GOOGLE_URL = "https://www.google.com/";
        driver.get(GOOGLE_URL);
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(searchField));
    }
    public void searchInGoogle(String searchPhrase){
        searchField.sendKeys(searchPhrase);
        searchField.sendKeys(Keys.ENTER);
    }
    public void closeCookieMessage() {
        driver.switchTo().frame(0);
        introAgreeButton.click();
        driver.switchTo().defaultContent();
    }
    public void verifyIfResultsAreVisible() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(resultsWebPart));
    }
}










