
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        Simulator simulator = new Simulator();
        UI ui = new UI(reader, simulator);
        ui.start();
    }
}
