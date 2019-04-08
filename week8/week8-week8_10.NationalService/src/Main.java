
public class Main {

    public static void main(String[] args) {
        // testing CivilService class
        CivilService cs = new CivilService();
        System.out.println("Civil service days left: " + cs.getDaysLeft());
        cs.work();
        System.out.println("Civil service days left: " + cs.getDaysLeft());
        System.out.println();
        
        // testing MilitaryService class
        MilitaryService ms1 = new MilitaryService(1);
        System.out.println("Military Service days left: " + ms1.getDaysLeft());
        ms1.work();
        System.out.println("Military Service days left: " + ms1.getDaysLeft());
        System.out.println();
        
        MilitaryService ms2 = new MilitaryService(10);
        System.out.println("Military Service days left: " + ms2.getDaysLeft());
        for (int i = 0; i < 5; i++) {
            ms2.work();
        }
        System.out.println("Military Service days left: " + ms2.getDaysLeft());
        System.out.println();
        
        MilitaryService ms3 = new MilitaryService(362);
        System.out.println("Military Service days left: " + ms3.getDaysLeft());
        for (int i = 0; i < 360; i++) {
            ms3.work();
        }
        System.out.println("Military Service days left: " + ms3.getDaysLeft());
    }
}
