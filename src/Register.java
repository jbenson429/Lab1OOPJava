public class Register {

    private static final Denomination[] DENOMINATIONS = {
            new Denomination("Fifty-Dollar Note", 50.0, "bill", "fifty_dollar.png"),
            new Denomination("Ten-Dollar Note", 10.0, "bill", "ten_dollar.png"),
            new Denomination("Five-Dollar Note", 5.0, "bill", "five_dollar.png"),
            new Denomination("One-Dollar Note", 1.0, "bill", "one_dollar.png"),
            new Denomination("Quarter", 0.25, "coin", "quarter.png"),
            new Denomination("Dime", 0.10, "coin", "dime.png"),
            new Denomination("Penny", 0.01, "coin", "penny.png")
    };

    public Purse makeChange(double amt) {
        if (amt <= 0) {
            return new Purse();
        }

        Purse purse = new Purse();
        for (Denomination denomination : DENOMINATIONS) {
            int count = (int) (amt / denomination.amt());
            if (count > 0) {
                purse.add(denomination, count);
                amt -= count * denomination.amt();
                amt = Math.round(amt * 100.0) / 100.0; // Avoid floating-point errors
            }
        }
        return purse;
    }

    public static void main(String[] args) {
        Register register = new Register();

        // Test cases
        System.out.println(register.makeChange(0));
        System.out.println(register.makeChange(1.25));
        System.out.println(register.makeChange(0.00001));
        System.out.println(register.makeChange(0.005));
        System.out.println(register.makeChange(-5.45));
        System.out.println(register.makeChange(69.89));
    }




}




