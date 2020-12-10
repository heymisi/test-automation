package com.epam.university.tests;

import com.epam.university.pagemodels.pages.CourseRatePage;
import com.epam.university.pagemodels.pages.ExpectationsPage;
import com.epam.university.pagemodels.pages.SuccessfullyFilledPage;
import com.epam.university.pagemodels.widgets.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BeadandoPageObjectTest extends TestBase{

    private final String multipleChoiceValue = "Minden óra ilyen legyen";

    @Test
    public void SimulateFormFillTest(){
        InputFieldWidget inputFiledWidget = new InputFieldWidget(driver);
        inputFiledWidget.navigateToForm(driver);
        //Page1

        //Question1
        inputFiledWidget.typeToInput("Betekintést nyújt a tesztelés világába.");
        //Q2
        LinearScaleWidget linearScaleWidget = new LinearScaleWidget(driver);
        linearScaleWidget.clickOnRating();

        ExpectationsPage expectationsPage = new ExpectationsPage(driver);
        CourseRatePage courseRatePage = expectationsPage.navigateToNextPage();
        // Page2

        //Q3
        MultipleChoiceGridWidget multipleChoiceGridWidget = new MultipleChoiceGridWidget(driver);
        multipleChoiceGridWidget.clickOnAllChoiceAsFive();
        //Q4
        MultipleChoiceWidget multipleChoiceWidget = new MultipleChoiceWidget(driver,multipleChoiceValue);
        multipleChoiceWidget.clickOnSelected();
        //Q5
        inputFiledWidget.typeToInput("Ugyanolyan szinten szemléletes, mint offline formában.");
        //Q6
        RadioButtonsWidget radioButtonsWidget = new RadioButtonsWidget(driver);
        radioButtonsWidget.clickOnSelected();

        SuccessfullyFilledPage lastPage = courseRatePage.submitForm();
        //Page3
        assertTrue(lastPage.isIconDisplayed());
    }
}
