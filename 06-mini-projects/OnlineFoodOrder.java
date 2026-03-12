// January Mini Console Project #5
// Online Food Order – Cooking Logic
// Author: Nikhil Parmar

import java.util.Scanner;

class Food {
    String foodName;
    double price;
    int quantity;

    Food(String fname, double p, int q) {
        this.foodName = fname;
        this.price = p;
        this.quantity = q;
    }

    void Prepare() {
        System.out.println("\nPreparing food...");
        System.out.println("Your Total Bill is : " + (price * quantity) + "Rs.");
    }
}

class Pizza extends Food {
    Pizza(String fname, double p, int q) {
        super(fname, p, q);
    }

    @Override
    void Prepare() {
        System.out.println("\nPreparing " + foodName + "...");
        System.out.println("Preparing double cheez Onion Pizza");
        System.out.println("Your Total Bill is : " + (price * quantity) + "Rs.");
    }
}

class Burger extends Food {
    Burger(String fname, double p, int q) {
        super(fname, p, q);
    }

    @Override
    void Prepare() {
        System.out.println("\nPreparing " + foodName + "...");
        System.out.println("Preparing double cheez Burger");
        System.out.println("Your Total Bill is : " + (price * quantity) + "Rs.");
    }
}

class GujaratiThali extends Food {
    GujaratiThali(String fname, double p, int q) {
        super(fname, p, q);
    }

    @Override
    void Prepare() {
        System.out.println("\nPreparing " + foodName + "...");
        System.out.println("Preparing 4 Roti + 2 Shak + Dal + Bhat + Papad + Meethai + Chhass..");
        System.out.println("Your Total Bill is : " + (price * quantity) + "Rs.");
    }
}

public class OnlineFoodOrder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantity;
        int food;

        System.out.println("-----------------------------");
        System.out.println("Online Food Order : ");
        System.out.println("-----------------------------");

        System.out.println("\nSelect Food Type :");
        System.out.println("1. Pizza (107Rs. per one).");
        System.out.println("2. Burger (60Rs. per one).");
        System.out.println("3. Gujarati Thali (120Rs. per Dish)");
        System.out.print("Select: ");
        food = sc.nextInt();

        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();

        switch (food) {
            case 1:
                Food order1 = new Pizza("Pizza", 107, quantity);
                order1.Prepare();
                break;
        
            case 2:
                Food order2 = new Pizza("Burger", 60, quantity);
                order2.Prepare();
                break;

            case 3:
                Food order3 = new Pizza("Gujarati Thali", 120, quantity);
                order3.Prepare();
                break;

            default:
                System.out.println("wrong choice! try again...");
                break;
        }
        
    }
}
