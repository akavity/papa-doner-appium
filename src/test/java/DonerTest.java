import org.example.annotations.TestData;
import org.example.models.donerTest.StartData;
import org.example.steps.MenuSteps;
import org.example.steps.StartScreenSteps;
import org.example.utils.JsonReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DonerTest extends BaseTest {
    MenuSteps menu = new MenuSteps();
    StartScreenSteps start = new StartScreenSteps();

    @TestData(jsonFile = "startData", model = "StartData", folder = "donerTest")
    @Test(description = "Select address of cafe",
            dataProviderClass = JsonReader.class, dataProvider = "getData")
    public void selectPickUpDeliveryTest(StartData startData) {
        start.selectDeliveryType(startData.getDeliveryType());
        start.selectCafe(startData.getCafeAddress());
        start.clickSubmitButton();
        start.clickAllowButton();

        Assert.assertTrue(menu.isDonerTitleDisplayed());
    }
}
