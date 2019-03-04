
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
        
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // Write the number drawing here using the method containsNumber()
        Random random = new Random();
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        
        //this.numbers.clear();
        while (this.numbers.size() < 7) {
            int number = random.nextInt(39) + 1;
            boolean recurring = this.containsNumber(number);

            if (!recurring) {
                this.numbers.add(number);
            }
        }

    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (this.numbers.contains(number)) {
            return true;
        } else {
            return false;
        }
    }
}
