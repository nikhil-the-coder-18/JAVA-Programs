// WAP to show use Super Keyword - Call Parent's Constructor.
// Author : Nikhil

class Jaanvar {
    Jaanvar() {
        System.out.println("I'm only Jaanvar");
    }
}

class Haathi extends Jaanvar {
    Haathi() {
        super(); // Calls Parent Constructor
        System.out.println("I'm Haathi");
    }
}

public class OOP_35_SuperKeyword3 {
    public static void main(String[] args) {

        Haathi a1 = new Haathi();

    }
}
