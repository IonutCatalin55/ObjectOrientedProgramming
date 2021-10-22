package ro.ctrln.polymorphism;

import ro.ctrln.inheritance.*;

public class Polymorphism {
    public static void main(String[] args) {

        Battleship battleship = new Battleship();
        ImperialStarDestroyer imperialStarDestroyer = new ImperialStarDestroyer();
        TieFighter tieFighter = new TieFighter();
        XWingStarfighter xWingStarfighter = new XWingStarfighter();
        FalconHeavy falconHeavy = new FalconHeavy();

        System.out.println("battleship instanceof Object :" + (battleship instanceof Object));
        System.out.println("battleship instanceof Battleship :" + (battleship instanceof Battleship));
        System.out.println("battleship instanceof ImperialStarDestroyer :" + (battleship instanceof ImperialStarDestroyer));
        System.out.println("battleship instanceof FalconHeavy :" + (battleship instanceof FalconHeavy));
        System.out.println("----------------------------------------------------");

        System.out.println("imperialStarDestroyer instanceof Object :" + (imperialStarDestroyer instanceof Object));
        System.out.println("ImperialStarDestroyer instanceof ImperialStar Destroyer :" + (imperialStarDestroyer instanceof ImperialStarDestroyer));
        System.out.println("ImperialStarDestroyer instanceof Battleship :" + (imperialStarDestroyer instanceof Battleship));
        //System.out.println("ImperialStarDestroyer instanceof TieFighter :" + (imperialStarDestroyer instanceof TieFighter));
        // Eroare de compilare,nu vor avea nimic in comun.Una extinde Battleship iar cealalta implementeaza Starship
        System.out.println("----------------------------------------------------");

        System.out.println("tieFighter instanceof object :" + (tieFighter instanceof Object));
        System.out.println("tieFighter instanceof TieFighter :" + (tieFighter instanceof TieFighter));
        System.out.println("tieFighter instanceof StarShip :" + (tieFighter instanceof Starship));
        //System.out.println("tieFighter instanceof ImperialStarDestroier :" + (tieFighter instanceof ImperialStarDestroyer));
        // Eroare de compilare,nu vor avea nimic in comun.
        System.out.println("----------------------------------------------------");

        System.out.println("xWingStarfighter instanceof Object :" + (xWingStarfighter instanceof Object));
        System.out.println("xWingStarfighter instanceof XWingStarfighter :" + (xWingStarfighter instanceof XWingStarfighter));
        System.out.println("xWingStarfighter instanceof Starship : " + (xWingStarfighter instanceof Starship));
        System.out.println("xWingStarfighter instanceof Rocket :" + (xWingStarfighter instanceof Rocket));
        System.out.println("----------------------------------------------------");

        System.out.println("falconHeavy instanceof Object :" + (falconHeavy instanceof Object));
        System.out.println("falconHeavy instanceof FalconHeavy :" + (falconHeavy instanceof FalconHeavy));
        System.out.println("falconHeavy instanceof Battleship :" + (falconHeavy instanceof Battleship));
        System.out.println("falconHeavy instanceof Starship :" + (falconHeavy instanceof Starship));
        System.out.println("falconHeavy instanceof Rocket :" + (falconHeavy instanceof Rocket));

        //System.out.println("falconHeavy instanceof TieFighter :" + (falconHeavy instanceof TieFighter));

    }
}
