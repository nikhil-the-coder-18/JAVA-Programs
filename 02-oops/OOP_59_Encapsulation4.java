// WAP to show the concept of Encapsulation - 4.
// Author : Nikhil

class MobilePhone {
    private String IMEI = "NIC3228418";
    public int batterylevel = 78;

    public String getIMEI() {
        return IMEI;
    }
}

public class OOP_59_Encapsulation4 {
    public static void main(String[] args) {
        MobilePhone oppo = new MobilePhone();

        System.out.println("IMEI No. " + oppo.getIMEI());
        System.out.println("Battery : " + oppo.batterylevel + "%");
    }
}
