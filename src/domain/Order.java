package domain;

public class Order {

    private final int idOrder;
    private Computer[] computers;
    private static int counterOrders;
    private int counterComputers;
    private final static int MAX_COMPUTERS = 10;

    public Order() {
        this.idOrder = ++Order.counterOrders;
        this.computers = new Computer[Order.MAX_COMPUTERS];
    }

    public void addComputer(Computer computer) {
        if (this.counterComputers < Order.MAX_COMPUTERS) {
            this.computers[this.counterComputers++] = computer;
        } else {
            System.out.println("The maximum numbers of computers has been exceeded" + Order.MAX_COMPUTERS);
        }
    }

    public void showOrder(){
        System.out.println("Id order: " + this.idOrder);
        System.out.println("Computers added: ");
        for (int i = 0; i < this.counterComputers; i++) {
            System.out.println(this.computers[i]);
        }
    }
}
