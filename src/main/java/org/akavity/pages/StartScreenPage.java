package org.akavity.pages;


import com.codeborne.selenide.appium.SelenideAppiumElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.appium.SelenideAppium.$;

public class StartScreenPage {
    private final SelenideAppiumElement locationButton = $(AppiumBy.xpath("//android.widget.TextView[@text='Населенный пункт']"));
    private final SelenideAppiumElement submitButton = $(AppiumBy.xpath("//android.widget.TextView[@text='Продолжить']"));
    private final SelenideAppiumElement allowButton = $(AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button"));

    /**
     * @param type Доставка, Самовывоз
     */
    public SelenideAppiumElement getDeliveryTypeButton(String type) {
        return $(AppiumBy.xpath("//android.widget.TextView[@text='" + type + "']"));
    }

    /**
     * @param el Адрес доставки, Квартира, Этаж, Подъезд
     */
    public SelenideAppiumElement getAddressElementField(String el) {
        return $(AppiumBy.xpath("//android.widget.TextView[@text='" + el + "']/.."));
    }

    public SelenideAppiumElement getCafeAddressButton(String address) {
        return $(AppiumBy.xpath("//android.widget.TextView[@text='Минск, " + address + "']"));
    }

    public SelenideAppiumElement getLocationButton() {
        return locationButton;
    }

    public SelenideAppiumElement getSubmitButton() {
        return submitButton;
    }

    public SelenideAppiumElement getAllowButton() {
        return allowButton;
    }
}
