
import java.util.Scanner;

public class Main {

    private static Scanner reader;

    public static void main(String[] args) {
        // testing isAWeekDay method
//        String testInput = "tue\n" + "abc\n";
//        reader = new Scanner(testInput);
//        for (int i = 0; i < 2; i++) {
//            System.out.print("Give a string: ");
//            String input = reader.nextLine();
//            if (isAWeekDay(input)) {
//                System.out.println("The form is fine.");
//            } else {
//                System.out.println("The form is wrong.");
//            }
//        }

        // testing allVowels method
//        String testInput = "aie\n" + "ane\n";
//        reader = new Scanner(testInput);
//        for (int i = 0; i < 2; i++) {
//            System.out.print("Give a string: ");
//            String input = reader.nextLine();
//            if (allVowels(input)) {
//                System.out.println("The form is fine.");
//            } else {
//                System.out.println("The form is wrong.");
//            }
//        }

        // testing clockTime method
        String testInput = "17:23:05\n" + "abc\n" + "33:33:33\n";
        reader = new Scanner(testInput);
        for (int i = 0; i < 3; i++) {
            System.out.print("Give a string: ");
            String input = reader.nextLine();
            if (clockTime(input)) {
                System.out.println("The form is fine.");
            } else {
                System.out.println("The form is wrong.");
            }
        }
    }

    // week days
    public static boolean isAWeekDay(String string) {
        return string.matches("mon|tue|wed|thu|fri|sat|sun");
    }

    // vowel inspection
    public static boolean allVowels(String string) {
        return string.matches("[aeiouäö]*");
    }

    // clock time
    public static boolean clockTime(String string) {
        return string.matches("([01][0-9]|2[0-3])(:[0-5][0-9]){2}");
    }
}
