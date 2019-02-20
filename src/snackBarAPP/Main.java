package snackBarAPP;

public class Main {
    private static void workWithData() {
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine foodMachine = new VendingMachine("Food");
        VendingMachine drinkMachine = new VendingMachine("Drinks");
        VendingMachine officeMachine = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 1.75, 36, 1);
        Snack chocolateBar = new Snack("Chocolate Bar", 1, 36, 1);
        Snack pretzel = new Snack("Pretzel", 2, 30, 1);

        Snack soda = new Snack("Soda", 2.5, 24, 2);
        Snack water = new Snack("Water", 2.75, 20, 2);

        System.out.println("***VAMOOOS***");
    }

    public static void main(String[] args) {
        workWithData();
    }
}