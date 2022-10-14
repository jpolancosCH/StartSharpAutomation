package tasks;

import models.BusinessUnitData;
import models.MeetingData;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.ui.Select;
import org.openqa.selenium.Keys;
import userinterfaces.menu.MeetingsPage;

public class FillMeeting implements Task {

    private MeetingData meetingData;

    public FillMeeting(MeetingData meetingData) {
        this.meetingData = meetingData;
    }

    public static FillMeeting form(MeetingData meetingData) {
        return Tasks.instrumented(FillMeeting.class, meetingData);
    }


    @Override
    public <T extends net.serenitybdd.screenplay.Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(meetingData.getName()).into(MeetingsPage.MEETING_NAME_INPUT),
                Click.on(MeetingsPage.MEETING_TYPE_BUTTON),
                Enter.theValue(meetingData.getType()).into(MeetingsPage.MEETING_TYPE_INPUT),
                Hit.the(Keys.ENTER).into(MeetingsPage.MEETING_TYPE_INPUT),
                Enter.theValue(meetingData.getNumber()).into(MeetingsPage.MEETING_NUMBER_INPUT),
                Enter.theValue(meetingData.getStartDate()).into(MeetingsPage.MEETING_START_DATE_INPUT),
                Select.value(meetingData.getStartTime()).from(MeetingsPage.MEETING_START_TIME_SELECT),
                Enter.theValue(meetingData.getEndDate()).into(MeetingsPage.MEETING_END_DATE_INPUT),
                Select.value(meetingData.getEndTime()).from(MeetingsPage.MEETING_END_TIME_SELECT),
                Click.on(MeetingsPage.MEETING_LOCATION_BUTTON),
                Enter.theValue(meetingData.getLocation()).into(MeetingsPage.MEETING_LOCATION_INPUT),
                Hit.the(Keys.ENTER).into(MeetingsPage.MEETING_LOCATION_INPUT),
                Click.on(MeetingsPage.MEETING_UNIT_BUTTON),
                Enter.theValue(meetingData.getBusinessUnit()).into(MeetingsPage.MEETING_UNIT_INPUT),
                Hit.the(Keys.ENTER).into(MeetingsPage.MEETING_UNIT_INPUT),
                Click.on(MeetingsPage.MEETING_ORGANIZER_BUTTON),
                Enter.theValue(meetingData.getOrganizer()).into(MeetingsPage.MEETING_ORGANIZER_INPUT),
                Hit.the(Keys.ENTER).into(MeetingsPage.MEETING_ORGANIZER_INPUT),
                Click.on(MeetingsPage.MEETING_REPORTER_BUTTON),
                Enter.theValue(meetingData.getReporter()).into(MeetingsPage.MEETING_REPORTER_INPUT),
                Hit.the(Keys.ENTER).into(MeetingsPage.MEETING_REPORTER_INPUT),
                Click.on(MeetingsPage.MEETING_ATTENDEE_BUTTON),
                Enter.theValue(meetingData.getAttendees()).into(MeetingsPage.MEETING_ATTENDEE_INPUT),
                Hit.the(Keys.ENTER).into(MeetingsPage.MEETING_ATTENDEE_INPUT),
                Click.on(MeetingsPage.SAVE_BUTTON)
        );
    }
}
