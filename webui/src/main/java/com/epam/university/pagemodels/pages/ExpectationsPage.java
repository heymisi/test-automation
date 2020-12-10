package com.epam.university.pagemodels.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpectationsPage extends BasePage {

    private By nextButton = By.xpath("/html/body/div/div/div/div/div/div/div[1]/div[2]/div[3]/div[1]/button/div");

    public ExpectationsPage(WebDriver driver) {
        super(driver);
    }

    public CourseRatePage navigateToNextPage(){


        driver.findElement(nextButton).click();
        return new CourseRatePage(driver);
    }
}
