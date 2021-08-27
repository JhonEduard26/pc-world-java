package test;

import domain.*;

public class PcWorld {
    public static void main(String[] args) {

        Monitor monitor = new Monitor("Asus", 15.5);
        Keyboard keyboard = new Keyboard("usb", "asus-keyboard");
        Mouse mouse = new Mouse("usb", "asus-mouse");
        Computer computer = new Computer("Asus", monitor, keyboard, mouse);

        Monitor monitor2 = new Monitor("Microsoft", 13.3);
        Keyboard keyboard2 = new Keyboard("usb", "microsoft");
        Mouse mouse2 = new Mouse("usb", "microsoft");
        Computer computer2 = new Computer("Microsoft Surface", monitor2, keyboard2, mouse2);

        Order order = new Order();
        order.addComputer(computer);
        order.addComputer(computer2);
        order.showOrder();
    }
}
