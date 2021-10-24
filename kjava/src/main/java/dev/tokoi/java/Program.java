package dev.tokoi.java;

import dev.tokoi.kotlin.Meeting;

public class Program {
    public static void main(String[] args) {
        Meeting board = new Meeting("Board meeting");

        board.setLocation("Nairobi");

        System.out.println("The meeting is in " + board.getLocation());
    }
}
