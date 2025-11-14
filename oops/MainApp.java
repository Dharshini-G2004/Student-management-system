
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display All");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    System.out.print("Roll No: ");
                    int roll = sc.nextInt();
                    System.out.print("Marks: ");
                    double marks = sc.nextDouble();

                    Student s = new Student(name, age, roll, marks);
                    service.addStudent(s);
                    break;

                case 2:
                    System.out.print("Enter Roll No: ");
                    Student found = service.searchStudent(sc.nextInt());
                    if (found != null) found.display();
                    else System.out.println("Not found!");
                    break;

                case 3:
                    System.out.print("Enter Roll No to delete: ");
                    service.deleteStudent(sc.nextInt());
                    break;

                case 4:
                    service.displayAll();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
