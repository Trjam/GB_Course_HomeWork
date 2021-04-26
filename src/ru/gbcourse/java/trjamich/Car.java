package ru.gbcourse.java.trjamich;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BrokenBarrierException;

public class Car implements Runnable {
    private static int CARS_COUNT;
    //static CyclicBarrier cb = new CyclicBarrier(Main.CARS_COUNT+1);
    static ArrayBlockingQueue abq = new ArrayBlockingQueue(1);

    static {
        CARS_COUNT = 0;
    }

    private Race race;
    private int speed;
    private String name;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " готов");
            Main.cb.await();
            Main.cb.await();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
            if (i == race.getStages().size()-1 && abq.remainingCapacity() != 0) {

                    abq.put(this.name);
                    System.out.println(abq.toString()
                            .replace("[", "")
                            .replace("]","")
                            + " Win");
            }
        }
        Main.cb.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
