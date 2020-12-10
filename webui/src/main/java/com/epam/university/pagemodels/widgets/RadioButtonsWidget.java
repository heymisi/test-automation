package com.epam.university.pagemodels.widgets;

import com.epam.university.pagemodels.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonsWidget extends BasePage {
    private By selectedRadioButton = By.xpath("//span[@data-text='10']");

    public RadioButtonsWidget(WebDriver driver) {
        super(driver);
    }

    public RadioButtonsWidget clickOnSelected(){
        driver.findElement(selectedRadioButton).click();
        return this;
    }
}
