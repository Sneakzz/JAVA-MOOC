
public class Main {

    public static void main(String[] args) {
        // testing Suitcase class
        Thing book = new Thing("Happiness in Three Steps", 2);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);
        
        Suitcase tomsCase = new Suitcase(10);
        tomsCase.addThing(book);
        tomsCase.addThing(mobile);
        
        Suitcase georgesCase = new Suitcase(10);
        georgesCase.addThing(brick);
        
        Container container = new Container(1000);
        container.addSuitcase(tomsCase);
        container.addSuitcase(georgesCase);
        
        System.out.println("There are the following things in the container suitcases:");
        container.printThings();
        System.out.println();
        
        // testing addSuitcasesFullOfBricks method
        Container container2 = new Container(1000);
        addSuitcasesFullOfBricks(container2);
        System.out.println(container2);
    }
    
    public static void addSuitcasesFullOfBricks(Container container) {
        int suitcasesToAdd = 100;
        
        for (int i = 0; i < suitcasesToAdd; i++) {
            Suitcase suitcase = new Suitcase(100);
            suitcase.addThing(new Thing("brick", i + 1));
            
            container.addSuitcase(suitcase);
        }
    }

}
