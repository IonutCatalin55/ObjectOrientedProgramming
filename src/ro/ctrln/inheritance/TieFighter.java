package ro.ctrln.inheritance;

import java.util.Objects;

public class TieFighter implements Starship{

    private String destination;

    @Override
    public void warp() {
        System.out.println("TieFighter is now in warp speed!");
    }

    @Override
    public void setStarshipDestination(String destination) {

        this.destination = destination;

    }

    @Override
    public double computeWarpSpeed(int warpFactor, int lightYearsToDestination) {
        return warpFactor * 5 * Math.pow(10, 8);
    }

    @Override
    public String toString() {
        return "TieFighter{" +
                "destination='" + destination + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TieFighter that = (TieFighter) o;
        return destination.equals(that.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination);
    }
}
