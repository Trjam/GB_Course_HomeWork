package ru.gbcourse.java.trjamich.main;

import static ru.gbcourse.java.trjamich.main.StartTrials.startTrials;

public class Main {
    public static void main(String[] args) {

        final int catCount = 2;
        final int humanCount = 2;
        final int robotCount = 2;

        final int runningTrackCount = 2;
        final int wallCount = 2;

        JumpoRunable[] members = CreateMembers.createMembers (catCount,humanCount,robotCount);
        Trialable[] trials = CreateTrials.createTrials (runningTrackCount,wallCount);

        startTrials(members, trials);
    }
}
