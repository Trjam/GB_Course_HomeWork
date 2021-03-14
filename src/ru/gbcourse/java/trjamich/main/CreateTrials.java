package ru.gbcourse.java.trjamich.main;

import java.util.Random;

public class CreateTrials {

    static Trialable[] createTrials(int runningTrackCount, int wallCount) {

        final int minRunDistanceCore = 100;
        final double minJumpHeightCore = 0.5;

        Random random = new Random();

        Trialable[] trials = new Trialable[runningTrackCount+wallCount];

        for (int i=0; i < trials.length ; i++) {
            if (i < wallCount)
                trials[i] = new Wall( random.nextInt(2) + minJumpHeightCore + random.nextDouble());
            if (wallCount <= i)
                trials[i] = new RunningTrack( random.nextInt(200)+minRunDistanceCore);
        }

        return trials;
    }
}
