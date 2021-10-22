package ro.ctrln.inheritance;

public class Inheritance {

    public static void main(String[] args) {


        Battleship battleship = new Battleship();
        battleship.setBattleshipName("Terran Battleship");
        battleship.setBattleshipCapacity(20000);
        System.out.println("Battleship is: " + battleship);

        ImperialStarDestroyer imperialStarDestroyer = new ImperialStarDestroyer();
        imperialStarDestroyer.setBattleshipCapacity(30000);
        imperialStarDestroyer.setBattleshipName("Imperial Star Destroyer");
        imperialStarDestroyer.setNumberOfDeks(30);

        System.out.println("ImperialStarDestroier is: " + imperialStarDestroyer);

        //Starship starship = new Starship(); nu poate fi instantiat
        XWingStarfighter xWingStarfighter = new XWingStarfighter();
        xWingStarfighter.setStarshipDestination("base");
        System.out.println("Velocity for XWingStarfighter is :" + xWingStarfighter.computeWarpSpeed(3, 1000));
        System.out.println("XWingStarFighter is: " + xWingStarfighter);
        xWingStarfighter.warp();

        TieFighter tieFighter = new TieFighter();
        tieFighter.setStarshipDestination("base");
        System.out.println("Velocity for TieFighter is: " + tieFighter.computeWarpSpeed(3, 1000));
        System.out.println("Tiefighter is: " + tieFighter);
        tieFighter.warp();

        FalconHeavy falconHeavy = new FalconHeavy();
        falconHeavy.setBattleshipName("FalconHeavy");
        falconHeavy.setBattleshipCapacity(10);
        falconHeavy.setDestination("Moon");
        System.out.println("FalconHeavy is :" + falconHeavy);

        falconHeavy.setStarshipDestination("Mars");
        System.out.println("Falconheavy is :" + falconHeavy);
        falconHeavy.launchCountDown();
    }

}
