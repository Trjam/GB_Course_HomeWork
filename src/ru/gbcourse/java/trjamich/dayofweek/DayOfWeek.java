package ru.gbcourse.java.trjamich.dayofweek;

public enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    static String getWorkingHours(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY:
                return "До конца недели осталось 40 рабочих часов";
            case TUESDAY:
                return "До конца недели осталось 32 рабочих часов";
            case WEDNESDAY:
                return "До конца недели осталось 24 рабочих часов";
            case THURSDAY:
                return "До конца недели осталось 16 рабочих часов";
            case FRIDAY:
                return "До конца недели осталось 8 рабочих часов";
            default:
                return "Сегодня выходной";
        }
    }
}
