package userinterfaces.menu;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MeetingsPage extends PageObject {
    public static final Target NEW_MEETING_BUTTON = Target.the("Button to add a new meeting").located(By.className("add-button"));
    public static final Target MEETING_NAME_INPUT = Target.the("Input where we type the name of the meeting").located(By.name("MeetingName"));
    public static final Target MEETING_TYPE_BUTTON = Target.the("Button to deploy the input's type meeting ").located(By.id("select2-chosen-6"));
    public static final Target MEETING_TYPE_INPUT = Target.the("Input to type the type of the meeting").located(By.id("s2id_autogen6_search"));
    public static final Target MEETING_NUMBER_INPUT = Target.the("Input to type the number of the meeting").located(By.name("MeetingNumber"));
    public static final Target MEETING_START_DATE_INPUT = Target.the("Input to type the meeting's start date").located(By.name("StartDate"));
    public static final Target MEETING_START_TIME_SELECT = Target.the("Select to choose the meeting's start time").located(By.xpath("(//select[@class='editor s-DateTimeEditor time'])[1]"));
    public static final Target MEETING_END_DATE_INPUT = Target.the("Input to type the meeting's end date").located(By.name("EndDate"));
    public static final Target MEETING_END_TIME_SELECT = Target.the("Select to choose the meeting's end time").located(By.xpath("(//select[@class='editor s-DateTimeEditor time'])[1]"));
    public static final Target MEETING_LOCATION_BUTTON = Target.the("Button to deploy the input's location meeting ").located(By.id("select2-chosen-7"));
    public static final Target MEETING_LOCATION_INPUT = Target.the("Input to type the location of the meeting").located(By.id("s2id_autogen7_search"));
    public static final Target MEETING_UNIT_BUTTON = Target.the("Button to deploy the input's unit meeting ").located(By.id("select2-chosen-8"));
    public static final Target MEETING_UNIT_INPUT = Target.the("Input to type the unit of the meeting").located(By.id("s2id_autogen8_search"));
    public static final Target MEETING_ORGANIZER_BUTTON = Target.the("Button to deploy the input's organizer meeting ").located(By.id("select2-chosen-9"));
    public static final Target MEETING_ORGANIZER_INPUT = Target.the("Input to type the organizer of the meeting").located(By.id("s2id_autogen9_search"));
    public static final Target MEETING_REPORTER_BUTTON = Target.the("Button to deploy the input's reporter meeting ").located(By.id("select2-chosen-10"));
    public static final Target MEETING_REPORTER_INPUT = Target.the("Input to type the reporter of the meeting").located(By.id("s2id_autogen10_search"));
    public static final Target MEETING_ATTENDEE_BUTTON = Target.the("Button to deploy the input's attendee meeting ").located(By.id("select2-chosen-12"));
    public static final Target MEETING_ATTENDEE_INPUT = Target.the("Input to type the attendee of the meeting").located(By.id("s2id_autogen12_search"));
    public static final Target SAVE_BUTTON = Target.the("Button to save the business unit").located(By.className("save-and-close-button"));


    @FindBy(className = "s-Pro-Meeting-MeetingLink")
    private List<WebElement> meetingList;

    public  WebElement getMeetingLink(String businessUnitName) {
        for (WebElement meetingLink : meetingList) {
            if (meetingLink.getText().equals(businessUnitName)) {
                return meetingLink;
            }
        }
        return null;
    }


}
