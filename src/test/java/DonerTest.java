import org.example.steps.MenuSteps;
import org.example.steps.StartScreenSteps;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DonerTest extends BaseTest {
    MenuSteps menu = new MenuSteps();
    StartScreenSteps start = new StartScreenSteps();

    @Test
    public void selectPickUpDeliveryTest() {
        start.selectDeliveryType("Самовывоз");
        start.selectCafe("ст. м. Каменная Горка");
        start.clickSubmitButton();

        Assert.assertTrue(menu.isMenuDisplayed("Донер"));
    }
}
