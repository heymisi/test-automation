package com.epam.university.pagemodels.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CourseRatePage extends BasePage {

    private By submitButton = By.xpath("/html/body/div/div/div/div/div/div/div[1]/div[2]/div[3]/div[1]/button[2]/div");

    public CourseRatePage(WebDriver driver) {
        super(driver);
    }

    public SuccessfullyFilledPage submitForm(){
        driver.findElement(submitButton).click();
        return new SuccessfullyFilledPage(driver);
    }
}
