package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class StartSharpMenu extends PageObject {
    public static final Target ORGANIZATION_MENU_OPTION = Target.the("Organization menu option").located(By.xpath("//span[contains(text(),'Organization')]"));
    public static final Target ORGANIZATION_BUSINESS_UNIT_MENU_OPTION = Target.the("Business menu option that is in Organization").located(By.xpath("//span[contains(text(),'Business Units')]"));
    public static final Target MEETING_MENU_OPTION = Target.the("Meeting menu option").located(By.xpath("//span[contains(text(),'Meeting')]"));
    public static final Target MEETING_MEETINGS_MENU_OPTION = Target.the("Meetings menu option that is in Meeting").located(By.xpath("//span[contains(text(),'Meetings')]"));

}
