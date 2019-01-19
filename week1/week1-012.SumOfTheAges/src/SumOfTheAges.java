
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String sFirst, sSecond;
        int iFirst, iSecond, iSum;
        
        System.out.print("Type your name: ");
        sFirst = reader.nextLine();
        
        System.out.print("Type your age: ");
        iFirst = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type your name: ");
        sSecond = reader.nextLine();
        
        System.out.print("Type your age: ");
        iSecond = Integer.parseInt(reader.nextLine());
        
        iSum = iFirst + iSecond;
        System.out.println(sFirst + " and " + sSecond + " are " + iSum + " years old in total.");
    }
}
