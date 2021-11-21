package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

public class HomePage extends PageObject {

    @FindBy(id = "twotabsearchtextbox")
    WebElementFacade searchField;

    public void searchItem(){
        getDriver().get("http://www.amazon.com");
        typeInto(searchField, "java book");
    }

}
