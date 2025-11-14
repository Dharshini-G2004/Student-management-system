import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    // Add Student (Overloading)
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // Search student
    public Student searchStudent(int rollNo) {
        for (Student s : students) {
            if (s.getRollNo() == rollNo)
                return s;
        }
        return null;
    }

    // Delete student
    public void deleteStudent(int rollNo) {
        Student s = searchStudent(rollNo);
        if (s != null) {
            students.remove(s);
            System.out.println("Student removed!");
        } else {
            System.out.println("Student not found!");
        }
    }

    // Display all
    public void displayAll() {
        if (students.isEmpty())
            System.out.println("No records found.");
        for (Student s : students)
            s.display();
    }
}
