package com.epam.university.pagemodels.widgets;

import com.epam.university.pagemodels.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleChoiceGridWidget extends BasePage {

    private By ratingGitInput = By.xpath("//input[@aria-label='Git, 5']");
    private By ratingUnitTestingInput = By.xpath("//input[@aria-label='Unit testing, 5']");
    private By ratingCIInput = By.xpath("//input[@aria-label='CI, 5']");
    private By ratingWebUIInput = By.xpath("//input[@aria-label='Web UI, 5']");


    public MultipleChoiceGridWidget(WebDriver driver) {
        super(driver);
    }

    public MultipleChoiceGridWidget clickOnAllChoiceAsFive(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(this.ratingGitInput));

        driver.findElement(ratingGitInput).click();
        driver.findElement(ratingUnitTestingInput).click();
        driver.findElement(ratingCIInput).click();
        driver.findElement(ratingWebUIInput).click();
        return this;
    }
}
