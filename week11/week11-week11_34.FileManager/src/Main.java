
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        FileManager f = new FileManager();
        
        //"src/testinput1.txt"
        //"src/testinput2.txt"
        //"src/FileManager.java"
        
        // testing FileManager class
        // READING
        String contents = "";
        for (String line : f.read("src/testinput1.txt")) {
            contents += line + "\n";
        }
        System.out.println(contents);
        
        // WRITING
        String text = "A random line to write.";
        f.save("src/testinput1.txt", text);
        
        // APPENDED WRITING
        List<String> texts = new ArrayList<String>();
        texts.add("first line");
        texts.add("second line");
        texts.add("third line");
        texts.add("fourth line");
        texts.add("fifth line");
        texts.add("sixth line");
        texts.add("seventh line");
        f.save("src/testinput2.txt", texts);
    }
}
