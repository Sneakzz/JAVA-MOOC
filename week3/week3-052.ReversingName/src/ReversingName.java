import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input;
        int index;
        String reversed = "";
        
        System.out.print("Type your name: ");
        input = reader.nextLine();
        index = input.length() - 1;
        
        while (index >= 0) {
            reversed += input.charAt(index);
            index--;
        }
        
        System.out.println("In reverse order: " + reversed);
    }
}
