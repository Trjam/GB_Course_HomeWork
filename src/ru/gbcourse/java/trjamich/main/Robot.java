package ru.gbcourse.java.trjamich.main;

public class Robot implements JumpoRunable{

    String name;
    int maxRunDistance;
    double maxJumpHeight;
    boolean disqualified = false;

    public Robot(int maxRunDistance, double maxJumpHeight, String robotName) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.name = robotName;
    }

    @Override
    public boolean run(int length) {
        return length <= maxRunDistance;
    }

    @Override
    public boolean jump(double height) {
        return height <= maxJumpHeight;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setDisqualified (boolean disqualified){
        this.disqualified = disqualified;
    }

    @Override
    public boolean getDisqualified () {
        return this.disqualified;
    }
}
