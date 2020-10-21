package kata2;

import java.util.HashMap;
import java.util.Map;


public class Kata2 {

    public static void main(String[] args) {
        int[] data = {4, 6, 5, 8, 3, 9, 13, 6, 2, 5, 9, 1, 1, 7, 4};
        Map<Integer,Integer> histogram = new HashMap<Integer,Integer>();
        
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])) {
                histogram.put(data[i], histogram.get(data[i])+1);
            } else {
                histogram.put(data[i], 1);
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        }
    }
    
}
