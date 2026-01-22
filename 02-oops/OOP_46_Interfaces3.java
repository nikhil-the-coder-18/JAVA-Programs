// WAP to show use of Interfaces - 3.
// Author : Nikhil

interface father {
    public void tall();
}

interface mother {
    public void intelligent();
}

class child implements father, mother {
    @Override
    public void tall() {
        System.out.println("My father is very tall!");
    }

    @Override
    public void intelligent() {
        System.out.println("My mother is very intelligent!");
    }
}

public class OOP_46_Interfaces3 {
    public static void main(String[] args) {
        child c1 = new child();

        c1.tall();
        c1.intelligent();
    }
}
