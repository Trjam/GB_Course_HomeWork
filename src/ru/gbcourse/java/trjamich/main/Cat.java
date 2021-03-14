package ru.gbcourse.java.trjamich.main;

public class Cat implements JumpoRunable{

    String name;
    int maxRunDistance;
    double maxJumpHeight;
    boolean disqualified = false;

    public Cat(int maxRunDistance, double maxJumpHeight, String catName) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.name = catName;
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
        return this.name;
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
