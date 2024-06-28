package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class StartScreenPage {

    private final SelenideElement submitButton = $(By.xpath("//android.widget.TextView[@text='Продолжить']"));

    /**
     * @param el Адрес доставки, Квартира, Этаж, Подъезд
     */
    private final SelenideElement addressElementField(String el) {
        return $(By.xpath("//android.widget.TextView[@text='" + el + "']/.."));
    }

    /**
     * @param type Доставка, Самовывоз
     */
    public SelenideElement deliveryTypeButton(String type) {
        return $(By.xpath("//android.widget.TextView[@text='" + type + "']"));
    }

    public SelenideElement getSubmitButton() {
        return submitButton;
    }
}
