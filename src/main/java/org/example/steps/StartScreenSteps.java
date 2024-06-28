package org.example.steps;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.example.pages.StartScreenPage;
import org.example.utils.Utils;

@Log4j2
public class StartScreenSteps {

    StartScreenPage start = new StartScreenPage();

    @Step
    public void selectDeliveryType(String type) {
        log.info("Select delivery type {}", type);
        SelenideElement element = start.deliveryTypeButton(type);
        Utils.waitUntilClickable(element);
        element.click();
    }

    @Step
    public void selectCafe(String address) {
        log.info("Select address of cafe {}", address);
        SelenideElement element = start.cafeAddressButton(address);
        Utils.waitUntilClickable(element);
        element.click();
    }

    @Step
    public void clickSubmitButton() {
        log.info("Click submit button");
        start.getSubmitButton().click();
    }

    @Step
    public void clickAllowButton() {
        log.info("Click allow button");
        SelenideElement element = start.getAllowButton();
        Utils.waitUntilClickable(element);
        element.click();
    }
}
