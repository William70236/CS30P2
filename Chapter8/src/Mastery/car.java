package Mastery;

public class car extends vehicle {
    private boolean hasSunroof;

    public car(int fECity, int fEHwy, int seating, double cargo, boolean sunroof) {
        super(fECity, fEHwy, seating, cargo);
        hasSunroof = sunroof;
    }

    public boolean getSunroof() {
        return hasSunroof;
    }

 
    public String cargoContainer() {
        return "Trunk";
    }

    public String description() {
        return "Car | City: " + getFECity() + " MPG, Hwy: " + getFEHwy() + " MPG, " +
               "Seats: " + getSeating() + ", " + cargoContainer() + " Volume: " + 
               getCargoVolume() + " cu ft, Sunroof: " + hasSunroof;
    }
}
