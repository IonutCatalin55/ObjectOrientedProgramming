package ro.ctrln.polymorphism;

import ro.ctrln.inheritance.FalconHeavy;
import ro.ctrln.inheritance.ImperialStarDestroyer;
import ro.ctrln.inheritance.TieFighter;
import ro.ctrln.inheritance.XWingStarfighter;

public class StarPortUsage {
    public static void main(String[] args) {

        FalconHeavy falconHeavy = new FalconHeavy();
        XWingStarfighter xWingStarfighter = new XWingStarfighter();
        TieFighter tieFighter = new TieFighter();

        StarPort starPort = new StarPort();
        starPort.setStarship(xWingStarfighter);
        starPort.flyToSpace();
    }

}
