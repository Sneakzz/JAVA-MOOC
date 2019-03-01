public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 0;
        
        while (i < amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = size - 1;
        int stars = 1;
        
        while (i >= 0) {
            printWhitespaces(i);
            printStars(stars);
            i--;
            stars++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int i = 0;
        int space = height - 1;
        int stars = 1;
        int standHeight = 2;
        int standWidth = 3;
        
        
        // print tree
        while (i < height) {
            printWhitespaces(space);
            space--;
            
            printStars(stars);
            stars += 2;
            
            i++;
        }
        i = 0;
        
        // print stand
        while (i < standHeight) {
            printWhitespaces((height - standWidth) + 1);
            printStars(standWidth);
            i++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(4);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
