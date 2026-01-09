// WAP to show use of multilevel inheritance - 3
// Author : Nikhil

class Company {
    void CompanyName() {
        System.out.println("Jio Reliance");
    }
}

class Department extends Company {
    void DepName() {
        System.out.println("HR Department");
    }
}

class Team extends Department {
    void teamLead() {
        System.out.println("Management Team");
    }
}

public class OOP_29_MultilevelInheritance3 {
    public static void main(String[] args) {
        Team t1 = new Team();

        t1.teamLead();
        t1.DepName();
        t1.CompanyName();
    }
}
