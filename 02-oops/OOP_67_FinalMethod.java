// WAP to show the concept of final keyword.
// Author : Nikhil

class Dad {
    final void comeBack() {
        System.out.println("Come back at 10 PM");
    }
}

class child extends Dad {
    /* @Override    // Not allowed
    final void comeBack() {
        System.out.println("I'll come at 12PM");
    } */
}

public class OOP_67_FinalMethod {
    public static void main(String[] args) {
        child c = new child();

        c.comeBack();
    }
}
