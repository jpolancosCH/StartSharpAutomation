package userinterfaces.menu;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.targets.TargetBuilder;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BusinessUnitsPage extends PageObject {
    public static final Target NEW_BUSINESS_UNIT_BUTTON = Target.the("Button to add a new business unit").located(By.className("add-button"));
    public static final Target NAME_INPUT = Target.the("Input to type the name of the new business unit").located(By.name("Name"));
    public static final Target PARENT_UNIT_DIV = Target.the("Div to deploy the parent unit of the new business unit").located(By.className("select2-chosen"));
    public static final Target SAVE_BUTTON = Target.the("Button to save the business unit").located(By.className("save-and-close-button"));
    public static final Target PARENT_UNIT_INPUT = Target.the("Button to save the business unit").located(By.id("s2id_autogen1_search"));

    public static final Target REFRESH_BUTTON = Target.the("Button to refresh the business unit list").located(By.className("refresh-button"));

    @FindBy(className = "s-Pro-Organization-BusinessUnitLink")
    private List<WebElement> businessUnitLinkList;

    public  WebElement getBusinessUnitLink(String businessUnitName) {
        for (WebElement businessUnitLink : businessUnitLinkList) {
            if (businessUnitLink.getText().equals(businessUnitName)) {
                return businessUnitLink;
            }
        }
        return null;
    }

}
