// WAP to show use of Abstract classes - 1 (Online Order).
// Author : Nikhil

abstract class OnlineOrder {
    abstract public double calculateFinalAmount(double price);
}

class FoodOrder extends OnlineOrder {
    @Override
    public double calculateFinalAmount(double price) {
        double delivery = 50;
        double GST = price * 0.5;
        return price + delivery + GST;
    }
}

class ClothingOrder extends OnlineOrder {
    @Override
    public double calculateFinalAmount(double price) {
        double delivery = 99;
        double GST = price * 0.18;
        return price + delivery + GST;
    }
}


public class OOP_41_AbstractClass1 {
    public static void main(String[] args) {

        FoodOrder order1 = new FoodOrder();
        System.out.println("Final Bill: " + order1.calculateFinalAmount(225) + "Rs.");

        ClothingOrder order2 = new ClothingOrder();
        System.out.println("Final Bill: " + order2.calculateFinalAmount(999) + "Rs.");

    }
}
