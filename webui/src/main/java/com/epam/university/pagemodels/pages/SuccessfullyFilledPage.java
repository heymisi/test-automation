package com.epam.university.pagemodels.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuccessfullyFilledPage extends BasePage{
    private By icon = By.xpath("//i[@class='ms-Icon ms-Icon--Completed office-form-theme-primary-color thank-you-page-font-icon']");

    public SuccessfullyFilledPage(WebDriver driver) {
        super(driver);
    }

    public Boolean isIconDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(this.icon));

        driver.findElement(icon).isDisplayed();

        return driver.findElement(icon).isDisplayed();
    }
}
