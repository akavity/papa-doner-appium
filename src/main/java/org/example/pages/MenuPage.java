package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MenuPage {
    private final SelenideElement donerTitleField = $(By.xpath("//android.widget.TextView[@text=\"Papa Döner\"]"));

    public SelenideElement foodType(String type) {
        return $(By.xpath("//android.widget.TextView[@text='" + type + "']"));
    }

    public SelenideElement getDonerTitleField() {
        return donerTitleField;
    }
}
