package snackBarAPP;

class Snack {
    private static int maxId = 0;
    private int id;
    private String name;
    private double cost;
    private double quantity;
    private int vendingMachineID;

    public Snack(String name, double cost, double quantity, int vendingMachineID) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.vendingMachineID = vendingMachineID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(int additionalProduct) {
        this.quantity = quantity + additionalProduct;
    }

    public double sellProduct(double quantitySold) {
        if (quantity >= quantitySold) {
            this.quantity = quantity - quantitySold;
            return quantitySold * cost;
        }
        return 0;
    }
}