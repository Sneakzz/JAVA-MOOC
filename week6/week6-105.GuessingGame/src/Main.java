
public class Main {
    public static void main(String[] args) {
        // test your program here
        GuessingGame game = new GuessingGame();
        // testing the isGreaterThan method
//        System.out.println(game.isGreaterThan(32));
        
        // testing the average method
//        System.out.println(game.average(3,4));
//        System.out.println(game.average(6,12));
        
        // playing the game
        game.play(1,10);
        game.play(1,4);
        game.play(1,50);
        game.play(1,100);
    }    
}
