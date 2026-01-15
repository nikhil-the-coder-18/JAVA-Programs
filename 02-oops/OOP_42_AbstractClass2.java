// WAP to show use of Abstract classes - 2 (Exam System).
// Author : Nikhil

abstract class ExamSystem {
    public abstract int evaluteMarks(int a, int b);
}

class TheoryExam extends ExamSystem {
    int written;
    int negative;

    @Override
    public int evaluteMarks(int a, int b) {
        this.written = a;
        this.negative = b;
        return written - negative;
    }
}

class PracticalExam extends ExamSystem {
    @Override
    public int evaluteMarks(int performance, int viva) {
        return (performance + viva);
    }
}

public class OOP_42_AbstractClass2 {
    public static void main(String[] args) {
        TheoryExam roll21 = new TheoryExam();
        System.out.println("Final Marks of Theory exam: " + roll21.evaluteMarks(79, 19));

        PracticalExam roll22 = new PracticalExam();
        System.out.println("Final Marks of Practical exam: " + roll22.evaluteMarks(7, 8));
    }
}
