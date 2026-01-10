// WAP to show use Super Keyword - Access Parent's variable.
// Author : Nikhil

class Gaadi {
    String color = "Black"; // Parent Variable
}
class GaadiAttribute extends Gaadi {
    String color = "White" ;// Child Variable

    void Showcolor() {
        System.out.println(color); // Prints White (Child class)
        System.out.println(super.color); // Prints Black (Parent class)
    }
}

public class OOP_33_SuperKeyword1 {
    public static void main(String[] args) {
        GaadiAttribute lambo = new GaadiAttribute();

        lambo.Showcolor();
    }
}
