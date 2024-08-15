import org.akavity.annotations.TestData;
import org.akavity.models.StartData;
import org.akavity.steps.MenuSteps;
import org.akavity.steps.StartScreenSteps;
import org.akavity.utils.JsonReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DonerTest extends BaseTest {
    MenuSteps menu = new MenuSteps();
    StartScreenSteps start = new StartScreenSteps();

    @TestData(jsonFile = "startData", model = "StartData")
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
