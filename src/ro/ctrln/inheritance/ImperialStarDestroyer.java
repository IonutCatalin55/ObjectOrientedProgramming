package ro.ctrln.inheritance;

import java.util.Objects;

public class ImperialStarDestroyer extends Battleship{

    private int numberOfDeks;

    public int getNumberOfDeks() {

        return this.numberOfDeks;

    }

    public void setNumberOfDeks(int numberOfDeks) {

        this.numberOfDeks = numberOfDeks;

    }

    @Override
    public String toString() {
        return "ImperialStarDestroyer{" +
                "numberOfDeks = " + numberOfDeks +
                ", battleshipName = " + getBattleshipName() +
                ", battleshipCapacity = " + getBattleshipCapacity() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ImperialStarDestroyer that = (ImperialStarDestroyer) o;
        return numberOfDeks == that.numberOfDeks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfDeks);
    }
}
