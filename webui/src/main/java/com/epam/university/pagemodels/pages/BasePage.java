package com.epam.university.pagemodels.pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToForm(WebDriver driver) {
        driver.get("https://forms.office.com/Pages/ResponsePage.aspx?id=0HIbtJ9OJkyKaflJ82fJHemFnY1u" +
                "iJpLseLCaxLxmwlUNUFPRjJFSU1VNDdYWlo0MFQyVTExTjBWVC4u");
    }
}
