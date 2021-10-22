package ro.ctrln.polymorphism;

import ro.ctrln.inheritance.*;

public class StarPortUsage {
    public static void main(String[] args) {

        FalconHeavy falconHeavy = new FalconHeavy();
       /* falconHeavy.setStarshipDestination("mars");
        falconHeavy.setBattleshipCapacity(10);
        falconHeavy.setBattleshipName("FalconHeavy");
        falconHeavy.setDestination("mars");*/
        XWingStarfighter xWingStarfighter = new XWingStarfighter();
        xWingStarfighter.setStarshipDestination("base");

        TieFighter tieFighter = new TieFighter();
        tieFighter.setStarshipDestination("pluto");

        StarPort starPort = new StarPort();
        starPort.setStarship(falconHeavy);
        starPort.flyToSpace();
        System.out.println(starPort);

        starPort.setStarship(xWingStarfighter);
        starPort.flyToSpace();
        System.out.println(starPort);

        starPort.setStarship(tieFighter);
        starPort.flyToSpace();
        System.out.println(starPort);

        //falconHeavy.setDestination("Mercury");  NU CONTEAZA LOCATIA UNDE ESTE SETATA VAL UNUI OBIECT
        starPort.setStarship(falconHeavy);       //VALOAREA LUI SE TRANSMITE PRIN REFERINTA,ADICA
        //falconHeavy.setDestination("Mercury");   SE TRANSMITE LOCATIA DIN MEMORIE
        starPort.flyToSpace();
        falconHeavy.setDestination("Mercury");
        System.out.println(starPort);

        Starship starshipOne = new FalconHeavy();
        Starship starshipTwo = new XWingStarfighter();
        Starship starshipThree  = new TieFighter();

        //Starship starshipfour = new Battleship();  Clase diferite fara legatura __ eroare de compilare

        Battleship battleshipone = new FalconHeavy();
        Battleship battleshiptwo = new ImperialStarDestroyer();

        //starPort.setStarship(battleshipone); Eroare de ompilare
        //FalconHeavy falconHeavyone = new Battleship(); //Castul se face invers de la obiectul Copil la obiectul Parinte

        starPort.setStarship(starshipOne);
        starPort.flyToSpace();
        System.out.println(starPort);

        starPort.setStarship(starshipTwo);
        starPort.flyToSpace();
        System.out.println(starPort);

        starPort.setStarship(starshipThree);
        starPort.flyToSpace();
        System.out.println(starPort);
    }

}
