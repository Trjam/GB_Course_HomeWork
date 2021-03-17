package ru.gbcourse.java.trjamich.Exeptions;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException{
    private int i;
    private int j;

    public MyArraySizeException(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public MyArraySizeException(String s, int i, int j) {
        super(s);
        this.i = i;
        this.j = j;
    }

    public MyArraySizeException(String s, int i) {
        super(s);
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
