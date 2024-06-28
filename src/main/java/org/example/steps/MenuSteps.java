package org.example.steps;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.example.pages.MenuPage;
import org.example.utils.Utils;

public class MenuSteps {
    MenuPage menu = new MenuPage();

    @Step
    public boolean isMenuDisplayed(String type) {
        SelenideElement el = menu.foodType(type);
        Utils.sleep(2000);
        return el.isDisplayed();
    }
}
