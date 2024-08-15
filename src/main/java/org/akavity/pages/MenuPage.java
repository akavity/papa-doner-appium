package org.akavity.pages;


import com.codeborne.selenide.appium.SelenideAppiumElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.appium.SelenideAppium.$;

public class MenuPage {
    private final SelenideAppiumElement donerTitleField = $(AppiumBy.xpath("//android.widget.TextView[@text='Papa Döner']"));

    public SelenideAppiumElement foodType(String type) {
        return $(AppiumBy.xpath("//android.widget.TextView[@text='" + type + "']"));
    }

    public SelenideAppiumElement getDonerTitleField() {
        return donerTitleField;
    }
}
