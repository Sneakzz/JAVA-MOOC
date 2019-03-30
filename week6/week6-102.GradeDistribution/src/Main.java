import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeDistribution gd = new GradeDistribution(scanner);
        gd.setScores();
        gd.printGradeDistribution();
    }
}
