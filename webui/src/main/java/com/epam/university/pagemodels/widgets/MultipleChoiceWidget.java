package com.epam.university.pagemodels.widgets;

import com.epam.university.pagemodels.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleChoiceWidget extends BasePage {
    private String selectedOption;
    private By multipleChoiceOption;

    public MultipleChoiceWidget(WebDriver driver, String selectedOption) {
        super(driver);
        this.selectedOption = selectedOption;
        multipleChoiceOption = By.xpath("//input[@aria-label='" + selectedOption +"']");
    }

    public MultipleChoiceWidget clickOnSelected(){
        driver.findElement(multipleChoiceOption).click();
        return this;
    }
}
