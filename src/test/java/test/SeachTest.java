package test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.HomePageSteps;

@RunWith(SerenityRunner.class)
public class SeachTest {

    @Steps
    private HomePageSteps homePageSteps;

    @Test
    public void searchItemOnAmazonTest() {
        homePageSteps.searchItemOnAmazon();
    }
}
