// WAP to show use of Interfaces - 1.
// Author : Nikhil

interface payment {
    public void upi();
    public void paytm();
    public void gpay();
}

class upipay implements payment {

    @Override
    public void upi() {
        System.out.println("Paid via UPI!...");
    }

    public void paytm() {
        System.out.println("Paid by paytm");
    }

    public void gpay() {
        System.out.println("Paid by gpay");
    }
}

public class OOP_44_Interfaces1 {
    public static void main(String[] args) {
        upipay obj = new upipay();
        obj.upi();
        obj.paytm();
        obj.gpay();
    }
}