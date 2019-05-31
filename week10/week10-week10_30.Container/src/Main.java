
import containers.ProductContainer;
import containers.ProductContainerRecorder;


public class Main {

    public static void main(String[] args) {
        // testing ProductContainer class
//        ProductContainer juice = new ProductContainer("Juice", 1000.0);
//        juice.addToTheContainer(1000.0);
//        juice.takeFromTheContainer(11.3);
//        System.out.println(juice.getName());
//        juice.addToTheContainer(1.0);
//        System.out.println(juice);
        
        // testing ProductContainerRecorder class
        ProductContainerRecorder juice = new ProductContainerRecorder("Juice", 1000.0, 1000.0);
        juice.takeFromTheContainer(11.3);
        juice.addToTheContainer(1.0);
        
        //System.out.println(juice.history());
        juice.printAnalysis();
    }

}
