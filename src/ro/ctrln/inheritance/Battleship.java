package ro.ctrln.inheritance;

import java.util.Objects;

public class Battleship {

    private String battleshipName;
    private int battleshipCapacity;

    public String getBattleshipName() {

        return this.battleshipName;
    }

    public int getBattleshipCapacity() {

        return this.battleshipCapacity;
    }

    public void setBattleshipName(String battleshipName) {
        this.battleshipName = battleshipName;
    }

    public void setBattleshipCapacity(int battleshipCapacity) {
        this.battleshipCapacity = battleshipCapacity;
    }

    @Override
    public String toString() {
        return "Battleship{" +
                "battleshipName='" + battleshipName + '\'' +
                ", battleshipCapacity=" + battleshipCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Battleship that = (Battleship) o;
        return battleshipCapacity == that.battleshipCapacity && battleshipName.equals(that.battleshipName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(battleshipName, battleshipCapacity);
    }
}
