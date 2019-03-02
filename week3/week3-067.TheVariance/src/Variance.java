import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        
        for (int nr : list) {
            sum += nr;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double average = sum(list) / (double) list.size();
        
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double v = 0.0;
        // Variable average gets initialized outside of forEach so the method
        // only gets called once and not every iteration of the forEach loop
        double average = average(list);
        for (double nr : list) {
            v += Math.pow((nr - average), 2);
        }
        
        v /= list.size() - 1;
        
        return v;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(3);
//        list.add(2);
//        list.add(7);
//        list.add(2);
        
        list.add(1);
        list.add(3);
        
        System.out.println("The variance is: " + variance(list));
    }

}
