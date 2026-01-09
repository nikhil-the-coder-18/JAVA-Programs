// WAP to show use of multilevel inheritance - 2
// Author : Nikhil

class Country {
    void CountryName() {
        System.out.println("India,");
    }
}

class State extends Country {
    void StateName() {
        System.out.println("Gujarat, ");
    }
}

class City extends  State {
    void CityName() {
        System.out.println("Kadi, ");
    }
}

public class OOP_28_MultilevelInheritance2 {
    public static void main(String[] args) {
        City city1 = new City();

        city1.CityName();
        city1.StateName();
        city1.CountryName();
    }
}
