package Mastery;

public class truck extends vehicle {
    private int towingCapacity; // in lbs

    public truck(int fECity, int fEHwy, int seating, double cargo, int towing) {
        super(fECity, fEHwy, seating, cargo);
        towingCapacity = towing;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

   
    public String cargoContainer() {
        return "Truck Bed";
    }

    public String description() {
        return "Truck | City: " + getFECity() + " MPG, Hwy: " + getFEHwy() + " MPG, " +
               "Seats: " + getSeating() + ", " + cargoContainer() + " Volume: " + 
               getCargoVolume() + " cu ft, Towing: " + towingCapacity + " lbs";
    }
}
