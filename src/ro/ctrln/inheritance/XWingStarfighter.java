package ro.ctrln.inheritance;

public class XWingStarfighter implements Starship {


    private String destination;
    private int lightYearsToDestination;

    @Override
    public void warp() {
        System.out.println("XWingStarfighter este acum in viteza Warp!");

    }

    @Override
    public void setStarshipDestination(String destination) {
        switch (destination) {
            case "base" :
                this.destination = "Tatooine";
                break;
            case "empire" :
                this.destination = "Coruscant";
                break;
            default :
                this.destination = "Unknown";
        }
    }

    @Override
    public double computeWarpSpeed(int warpFactor, int lightYearsToDestination) {
        this.lightYearsToDestination = lightYearsToDestination;
        return Math.pow(warpFactor, 3) * Math.pow(10, 8);
    }

    @Override
    public String toString() {
        return "XWingStarfighter{" +
                "destination='" + destination + '\'' +
                ", lightYearsToDestination=" + lightYearsToDestination +
                '}';
    }
}
