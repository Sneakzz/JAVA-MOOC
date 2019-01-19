
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int radius;
        double pi = Math.PI;
        double circumference;
        
        System.out.print("Type the radius: ");
        radius = Integer.parseInt(reader.nextLine());
        
        circumference = 2 * pi * radius;
        System.out.println("Circumference of the circle: " + circumference);
    }
}
