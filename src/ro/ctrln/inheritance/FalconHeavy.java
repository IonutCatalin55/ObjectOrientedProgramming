package ro.ctrln.inheritance;

public class FalconHeavy extends Battleship implements Starship, Rocket {

    private String destination;


    @Override
    public void warp() {
        System.out.println("FalconHeavy doesn't warp!She goes to the moon!");
    }

    @Override
    public void setStarshipDestination(String destination) {

        this.destination = getBattleshipName() + " goes to " + destination;

    }

    @Override
    public double computeWarpSpeed(int warpFactor, int lightYearsToDestination) {
        return 0;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return this.destination;
    }

    @Override
    public String toString() {
        return "FalconHeavy{" +
                "destination='" + destination + '\'' +
                ", battleshipName=" + getBattleshipName() +
                ", battleshipCapacity=" + getBattleshipCapacity() +
                '}';
    }

    @Override //ADNOTARE -> SE MARCHEAZA FAPTUL CA SE SUPRASCRIE O METODA
    public void launchCountDown() {
        for(int i = 10;i >= 0; i-- ){
            System.out.println("Launch CountDown is: " + i);
        }
    }


    // Aceasta metoda este mostenita din lasa parinte si este suprascrisa
    public void escapeProcedure(int escapePods){
        super.escapeProcedure(escapePods);
        System.out.println("We are in FalconHeavy now!");
        System.out.println("Escape procedure intiated in FalconHeavy class with " + escapePods +" escape pods!");

    }

}
