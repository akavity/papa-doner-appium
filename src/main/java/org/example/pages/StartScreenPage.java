package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class StartScreenPage {

    private final SelenideElement submitButton = $(By.xpath("//android.widget.TextView[@text='Продолжить']"));

    /**
     * @param type Доставка, Самовывоз
     */
    public SelenideElement deliveryTypeButton(String type) {
        return $(By.xpath("//android.widget.TextView[@text='" + type + "']"));
    }

    /**
     * @param el Адрес доставки, Квартира, Этаж, Подъезд
     */
    private SelenideElement addressElementField(String el) {
        return $(By.xpath("//android.widget.TextView[@text='" + el + "']/.."));
    }

    public SelenideElement cafeAddressButton(String address) {
        return $(By.xpath("//android.widget.TextView[@text='Минск, " + address + "']"));
    }

    public SelenideElement getSubmitButton() {
        return submitButton;
    }
}
