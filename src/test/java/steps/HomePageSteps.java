package steps;

import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import pages.HomePage;

public class HomePageSteps extends ScenarioSteps {

    HomePage homePage;

    @Step("search item on Amazon")
    public void searchItemOnAmazon() {
        homePage.searchItem();
    }
}
