// WAP to show use of Hierarchical inheritance - 2
// Author : Nikhil

class Exam {
    public int totalmarks = 0;
}

class MidExam extends Exam {
    int MEMarks = 100;
    void calculatemarks() {
        totalmarks += MEMarks;
        System.out.println("Mid Exam Marks: " + totalmarks);
    }
}

class FinalExam extends Exam {
    int FEmarks = 150;
    void calculatemarks() {
        totalmarks += FEmarks;
        System.out.println("Final Exam Marks: " + totalmarks);
    }
}

public class OOP_31_HierarchicalInheritance2 {
    public static void main(String[] args) {
        
        MidExam me = new MidExam();
        me.calculatemarks();

        FinalExam fe = new FinalExam();
        fe.calculatemarks();

        System.out.println("Total Marks= " + (me.MEMarks + fe.FEmarks));
    }
    
}
