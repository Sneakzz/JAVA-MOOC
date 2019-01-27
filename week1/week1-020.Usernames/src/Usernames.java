
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String user;
        String pw;
        
        System.out.print("Type your username: ");
        user = reader.nextLine();
        System.out.print("Type your password: ");
        pw = reader.nextLine();
        
        if((user.equals("alex") && pw.equals("mightyducks")) || (user.equals("emily") && pw.equals("cat"))) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid");
        }
    }
}
