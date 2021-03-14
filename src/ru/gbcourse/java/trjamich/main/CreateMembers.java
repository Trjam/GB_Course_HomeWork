package ru.gbcourse.java.trjamich.main;

import java.util.Random;

public class CreateMembers {

     static JumpoRunable[] createMembers(int catCount, int humanCount, int robotCount) {

         final int catMaxDistanceCore = 200;
         final int humanMaxDistanceCore = 150;
         final int robotMaxDistanceCore = 250;

         final double catMaxJumpCore = 1.0;
         final double humanMaxJumpCore = 2.0;
         final double robotMaxJumpCore = 0.5;

         JumpoRunable[] member = new JumpoRunable[catCount + humanCount + robotCount];

         Random random = new Random();

         for (int i=0; i < member.length ; i++) {
             if (i < catCount)
                 member[i] = new Cat(random.nextInt(100)+catMaxDistanceCore, random.nextDouble()+catMaxJumpCore, Cats.getCatName());
             if (catCount <= i &&i < catCount+humanCount)
                 member[i] = new Human(random.nextInt(100)+humanMaxDistanceCore, random.nextDouble()+humanMaxJumpCore, Humans.getHumanName());
             if (catCount+humanCount <=i)
                 member[i] = new Robot(random.nextInt(100)+robotMaxDistanceCore, random.nextDouble()+robotMaxJumpCore, Robots.getRobotName());
         }

         return member;
    }
}
