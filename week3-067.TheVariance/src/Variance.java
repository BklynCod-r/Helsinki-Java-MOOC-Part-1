import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        
        int result = 0;
        
        for (Integer number : list) {
            result += number;
        }
        return result;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        
        return sum(list) / (double) list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        int i = 0;
        double sum = 0, avg = average(list);
        while (i < list.size()) {            
            sum += Math.pow(list.get(i) - avg, 2);
            i++;
        }
        
        return sum / (list.size() - 1);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
