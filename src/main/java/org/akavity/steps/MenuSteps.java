package org.akavity.steps;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.akavity.pages.MenuPage;
import org.akavity.utils.Utils;

public class MenuSteps {
    MenuPage menu = new MenuPage();

    @Step
    public boolean isMenuDisplayed(String type) {
        SelenideElement el = menu.foodType(type);
        Utils.sleep(2000);
        return el.isDisplayed();
    }

    @Step
    public boolean isDonerTitleDisplayed() {
        SelenideElement el = menu.getDonerTitleField();
        Utils.sleep(2000);
        return el.isDisplayed();
    }
}
