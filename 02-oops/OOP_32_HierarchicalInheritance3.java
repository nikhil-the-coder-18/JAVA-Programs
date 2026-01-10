// WAP to show use of Hierarchical inheritance - 3
// Author : Nikhil

class Course {
    int duration;
    void showDuration () {
        System.out.println("Course Duration: " + duration + " hours");
    }
}

class ProgrammingCourse extends Course {
    void setProgrammingCourse() {
        duration = 120;
        System.out.println("Programming Course Selected");
        showDuration();
    }
}

class DesigningCourse extends Course {
    void setDesigningCourse() {
        duration = 60;
        System.out.println("Designing Course Selected");
        showDuration();
    }
}

public class OOP_32_HierarchicalInheritance3 {
    public static void main(String[] args) {
        
        ProgrammingCourse c1 = new ProgrammingCourse();
        c1.setProgrammingCourse();

        DesigningCourse d1 = new DesigningCourse();
        d1.setDesigningCourse();
    }
    
}
