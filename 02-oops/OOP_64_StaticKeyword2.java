// WAP to show the concept of static keyword - 2.
// Author : Nikhil

class Mobile {
    String model;
    int price;
    static String type;
}

public class OOP_64_StaticKeyword2 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();

        m1.model = "Oppo";
        m1.price = 17500;
        Mobile.type = "smartphone";

        Mobile m2 = new Mobile();
        m2.model = "appe";
        m2.price = 149000;
        Mobile.type = "smartphone";

        System.out.println("Mobile Model: " + m1.model);
        System.out.println("Mobile Price: " + m1.price + "Rs.");
        System.out.println("Mobile Type: " + Mobile.type);

        System.out.println("\nMobile Model: " + m2.model);
        System.out.println("Mobile Price: " + m2.price + "Rs.");
        System.out.println("Mobile Type: " + Mobile.type);

    }
}
