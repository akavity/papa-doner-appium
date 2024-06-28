package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MenuPage {

    public SelenideElement foodType(String type) {
        return $(By.xpath("//android.widget.TextView[@text='" + type + "']"));
    }
}
