package com.epam.university.pagemodels.widgets;

import com.epam.university.pagemodels.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinearScaleWidget extends BasePage {
    private By ratingInput = By.xpath("//input[@aria-label='5']");


    public LinearScaleWidget(WebDriver driver) {
        super(driver);
    }

    public LinearScaleWidget clickOnRating(){
        driver.findElement(ratingInput).click();
        return this;
    }
}
