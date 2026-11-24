package Mastery;

public class vehicletester {
    public static void main(String[] args) {
        Vehicle[] fleet = new Vehicle[3];
        
        fleet[0] = new car(28, 36, 5, 15.1, true);
        fleet[1] = new truck(18, 24, 3, 53.4, 8500);
        fleet[2] = new minivan(19, 28, 8, 140.5, true);

        for (Vehicle v : fleet) {
            System.out.println(v.description());
        }
    }
}
