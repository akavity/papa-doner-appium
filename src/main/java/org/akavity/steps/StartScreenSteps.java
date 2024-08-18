package org.akavity.steps;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.akavity.pages.StartScreenPage;
import org.akavity.utils.Utils;

@Log4j2
public class StartScreenSteps {
    private final int SUBMIT_X = 680;
    private final int SUBMIT_Y = 2770;

    StartScreenPage start = new StartScreenPage();

    @Step
    public void selectDeliveryType(String type) {
        log.info("Select delivery type {}", type);
        SelenideElement element = start.getDeliveryTypeButton(type);
        Utils.waitUntilClickable(element);
        element.click();
    }

    @Step
    public void selectCafe(String address) {
        log.info("Select address of cafe {}", address);
        SelenideElement element = start.getCafeAddressButton(address);
        Utils.waitUntilClickable(element);
        element.click();
    }

    @Step
    public void enterAddressElement(String el, String text) {
        log.info("Enter {}", el);
        start.getAddressElementField(el).click();
        start.getAddressElementField(el).setValue(text);
    }

    @Step
    public void clickSubmitButton() {
        log.info("Click submit button");
       // start.getSubmitButton().click();
        Utils.clickCoordinates(SUBMIT_X,SUBMIT_Y);
    }

    @Step
    public void clickAllowButton() {
        log.info("Click allow button");
        SelenideElement element = start.getAllowButton();
        Utils.waitUntilClickable(element);
        element.click();
    }
}
