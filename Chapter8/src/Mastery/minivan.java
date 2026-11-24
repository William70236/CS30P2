package Mastery;

import java.text.NumberFormat;

public class minivan extends vehicle {
    private boolean powerSlidingDoors;

    public minivan(int fECity, int fEHwy, int seating, double cargo, boolean slidingDoors) {
        super(fECity, fEHwy, seating, cargo);
        powerSlidingDoors = slidingDoors;
    }

    public boolean hasPowerSlidingDoors() {
        return powerSlidingDoors;
    }

    @Override
    public String cargoContainer() {
        return "Rear Cabin";
    }

    @Override
    public String description() {
        return "Minivan | City: " + getFECity() + " MPG, Hwy: " + getFEHwy() + " MPG, " +
               "Seats: " + getSeating() + ", " + cargoContainer() + " Volume: " + 
               getCargoVolume() + " cu ft, Power Doors: " + powerSlidingDoors;
    }
}
