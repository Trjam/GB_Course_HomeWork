package ru.gbcourse.java.trjamich.main;

public interface JumpoRunable {
    boolean run (int length);
    boolean jump (double height);
    String getName();
    void setDisqualified (boolean disqualified);
    boolean getDisqualified ();
}
