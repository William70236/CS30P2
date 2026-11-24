package Mastery;

public abstract class vehicle {
    private int fuelEconomyCity;
    private int fuelEconomyHwy;
    private int seatingCapacity;
    private double cargoVolume;

    public vehicle(int fECity, int fEHwy, int seating, double cargo) {
        fuelEconomyCity = fECity;
        fuelEconomyHwy = fEHwy;
        seatingCapacity = seating;
        cargoVolume = cargo;
    }

    public int getFECity() {
        return fuelEconomyCity;
    }

    public int getFEHwy() {
        return fuelEconomyHwy;
    }

    public int getSeating() {
        return seatingCapacity;
    }

    public double getCargoVolume() {
        return cargoVolume;
    }

    // Abstract methods to be implemented by subclasses
    public abstract String description();
    public abstract String cargoContainer();
}
