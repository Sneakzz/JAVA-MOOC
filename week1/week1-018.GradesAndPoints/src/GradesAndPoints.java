
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int points;
        String grade;

        System.out.print("Type the points [0-60]: ");
        points = Integer.parseInt(reader.nextLine());

        if (points >= 0 && points <= 29) {
            grade = "failed";
            System.out.println("Grade: " + grade);
        } else if (points >= 30 && points <= 34) {
            grade = "1";
            System.out.println("Grade: " + grade);
        } else if (points >= 35 && points <= 39) {
            grade = "2";
            System.out.println("Grade: " + grade);
        } else if (points >= 40 && points <= 44) {
            grade = "3";
            System.out.println("Grade: " + grade);
        } else if (points >= 45 && points <= 49) {
            grade = "4";
            System.out.println("Grade: " + grade);
        } else if (points >= 50 && points <= 60) {
            grade = "5";
            System.out.println("Grade: " + grade);
        }
    }
}
