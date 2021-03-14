package ru.gbcourse.java.trjamich.main;

public class StartTrials {
    public static void startTrials(JumpoRunable[] members, Trialable[] trials) {

        for (JumpoRunable m: members) {
            for (Trialable t: trials) {
                if (m.getDisqualified())
                    continue;
                if (t instanceof Wall) {
                    if (!m.jump(((Wall) t).height)) {
                        System.out.println("Участник " + m.getName() + " не смог перепрыгнуть стену высотой " + String.format("%.2f",((Wall) t).height) + " метров и дисквалифицируется");
                        m.setDisqualified(true);
                        continue;
                    } else
                        System.out.println("Участник " + m.getName() + " смог перепрыгнуть стену высотой " + String.format("%.2f",((Wall) t).height) + " метров");
                }
                if (t instanceof RunningTrack) {
                    if (!m.run(((RunningTrack) t).length)) {
                        System.out.println("Участник " + m.getName() + " не смог пробежать заданую дистанцию " + ((RunningTrack) t).length + " метров и дисквалифицируется");
                        m.setDisqualified(true);
                    } else
                        System.out.println("Участник " + m.getName() + " смог пробежать заданую дистанцию " + ((RunningTrack) t).length + " метров");
                }
            }
            System.out.println();
        }
    }
}
