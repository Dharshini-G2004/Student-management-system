public class Student extends Person {

    private int rollNo;
    private double marks;

    public Student(String name, int age, int rollNo, double marks) {
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public int getRollNo() { return rollNo; }
    public double getMarks() { return marks; }

    @Override
    public void display() {
        super.display();
        System.out.println("Roll No: " + rollNo + ", Marks: " + marks);
    }
}
