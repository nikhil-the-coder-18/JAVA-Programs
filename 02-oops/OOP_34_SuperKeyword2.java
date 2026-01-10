// WAP to show use Super Keyword - Call Parent's Method.
// Author : Nikhil

class Male {
    void eat() {
        System.out.println("Male Eating");
    }
}

class Female extends Male {
    void eat() {
        super.eat(); // Run's Parent's Method
        System.out.println("Female Eating");
    }
}

public class OOP_34_SuperKeyword2 {
    public static void main(String[] args) {
        Female f1 = new Female();

        f1.eat(); // Run's child class Method
    }
}
