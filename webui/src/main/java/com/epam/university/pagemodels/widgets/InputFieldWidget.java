package com.epam.university.pagemodels.widgets;

import com.epam.university.pagemodels.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputFieldWidget extends BasePage {
    private By inputField = By.xpath("//input[@class='office-form-question-textbox " +
            "office-form-textfield-input form-control office-form-theme-focus-border border-no-radius']");


    public InputFieldWidget(WebDriver driver) {
        super(driver);
    }

    public InputFieldWidget typeToInput(String text) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(this.inputField));


        WebElement input = driver.findElement(inputField);

        input.clear();
        input.sendKeys(text);
        return this;
    }
}
