package questions;

import models.MeetingData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.menu.MeetingsPage;

public class CreationMeeting  implements Question<Boolean>{
    private MeetingData meetingData;
    private MeetingsPage meetingsPage;

    public CreationMeeting(MeetingData meetingData) {
        this.meetingData = meetingData;
    }
    public static CreationMeeting successfully(MeetingData meetingData) {
        return new CreationMeeting(meetingData);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        String newUnit = meetingsPage.getMeetingLink(meetingData.getName()).getText();
        System.out.println(meetingData.getName().equals(newUnit));
        return meetingData.getName().equals(newUnit);
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }

}
