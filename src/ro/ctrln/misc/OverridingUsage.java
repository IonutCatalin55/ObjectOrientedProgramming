package ro.ctrln.misc;

import ro.ctrln.inheritance.Battleship;
import ro.ctrln.inheritance.FalconHeavy;

public class OverridingUsage {

    public static void main(String[] args) {

        Battleship battleship = new Battleship();
        battleship.escapeProcedure(5);
        System.out.println("====================================");
        FalconHeavy falconHeavy  = new FalconHeavy();
        falconHeavy.escapeProcedure(10);

    }
}
