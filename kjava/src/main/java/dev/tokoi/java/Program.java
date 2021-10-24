package dev.tokoi.java;

import dev.tokoi.kotlin.Meeting;
import dev.tokoi.kotlin.MeetingException;

public class Program {
    public static void main(String[] args) {
        Meeting board = new Meeting("Board meeting");

        board.setLocation("Nairobi");

        System.out.println("The meeting is in " + board.getLocation());

        board.description = "A board meeting";

        int version = Meeting.APP_VERSION;

        Meeting.getAppVersion();

        try {
            board.addAttendee("");
        } catch (MeetingException e) {
            e.printStackTrace();
        }
    }
}
