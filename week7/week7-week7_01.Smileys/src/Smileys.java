
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("\\:D/");
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        // check if characterString length is odd
        if (stringLengthIsOdd(characterString)) {
            characterString += " ";
        }
        // print row of smileys
        printSmileyRow(characterString);

        // surround characterString with smileys
        surroundCharacterWithSmileys(characterString);

        // print another row of smileys
        printSmileyRow(characterString);
    }

    private static boolean stringLengthIsOdd(String characterString) {
        return (characterString.length() % 2) != 0;
    }

    private static void printSmileyRow(String characterString) {
        for (int i = 0; i < (characterString.length() + 6) /2 ; i++) {
            System.out.print(":)");
        }
        System.out.println();
    }

    private static void surroundCharacterWithSmileys(String characterString) {
        System.out.print(":) " + characterString + " :)");
        System.out.println();
    }

}
