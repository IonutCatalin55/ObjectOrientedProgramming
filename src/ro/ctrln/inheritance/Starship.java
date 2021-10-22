package ro.ctrln.inheritance;

import java.util.Random;

public interface Starship {

    int FIRST_INT = 1;
    static int SECOND_INT = 2;
   static final int THIRD_INT = 1;

    void warp();

    void setStarshipDestination(String destination);

    double computeWarpSpeed(int warpFactor, int lightYearsToDestination);

    default int productionID() {
        Random r = new Random();
        return FIRST_INT + (SECOND_INT -THIRD_INT) *r.nextInt();
    }
}
