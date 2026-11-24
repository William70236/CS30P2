package Mastery;

public class testaccount {
    private String firstName, lastName, street, city, province, postalCode;

    public Customer(String fName, String lName, String str, String c, String prov, String post) {
        firstName = fName;
        lastName = lName;
        street = str;
        city = c;
        province = prov;
        postalCode = post;
    }

    public void changestreet(String str) {
        street = str;
    }

    public void changecity(String c) {
        city = c;
    }

    public void changeprovince(String prov) {
        province = prov;
    }

    public void changepostalcode(String post) {
        postalCode = post;
    }

    public String toString() {
        String custString;
        custString = firstName + " " + lastName + "\n";
        custString += street + "\n";
        custString += city + ", " + province + "  " + postalCode + "\n";
        return custString;
    }
}
