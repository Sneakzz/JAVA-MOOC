
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        String name;
        String studentNumber;
        String search;

        System.out.print("name: ");
        name = scanner.nextLine();

        while (!name.isEmpty()) {
            System.out.print("studentnumber: ");
            studentNumber = scanner.nextLine();

            list.add(new Student(name, studentNumber));

            System.out.print("name: ");
            name = scanner.nextLine();
        }

        for (Student student : list) {
            System.out.println(student);
        }
        
        System.out.print("Give search term: ");
        search = scanner.nextLine();
        
        System.out.println("Result: ");
        for (Student student : list) {
            if (student.getName().contains(search)) {
                System.out.println(student);
            }
        }
        
    }
}
