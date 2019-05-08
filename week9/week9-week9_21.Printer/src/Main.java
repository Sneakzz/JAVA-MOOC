
public class Main {

    public static void main(String[] args) throws Exception {
        // files used:        
        //    src/textfile.txt
        //    src/kalevala.txt

        // testing Printer class
        Printer printer = new Printer("src/textfile.txt");

        printer.printLinesWhichContain("Väinämöinen");
        System.out.println("-----");
        printer.printLinesWhichContain("Frank Zappa");
        System.out.println("-----");
        printer.printLinesWhichContain("");
        System.out.println("-----");
    }
}
