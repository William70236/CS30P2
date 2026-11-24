package Mastery;

public class businessaccount extends account {
    private static final double MIN_BALANCE = 500.00;
    private static final double LOW_BALANCE_FEE = 10.00;

    public businessaccount(double bal, String fName, String lName, String street, String city, String province, String postalCode) {
        super(bal, fName, lName, street, city, province, postalCode);
    }

    public businessaccount(String ID) {
        super(ID);
    }

    @Override
    public void withdrawal(double amt) {
        super.withdrawal(amt);
        if (getBalance() < MIN_BALANCE) {
            super.withdrawal(LOW_BALANCE_FEE);
        }
    }
}
