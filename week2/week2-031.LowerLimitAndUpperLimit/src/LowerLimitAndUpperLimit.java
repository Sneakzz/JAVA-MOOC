
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int first;
        int last;
        
        System.out.print("First: ");
        first = Integer.parseInt(reader.nextLine());
        
        System.out.print("Last: ");
        last = Integer.parseInt(reader.nextLine());
        
        if(first <= last) {
            while(first <= last) {
                System.out.println(first);
                first++;
            }
        } else {
//            System.out.println("First: " + first);
//            System.out.println("Last: " + last);
        }

    }
}
