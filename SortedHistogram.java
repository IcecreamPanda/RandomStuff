import java.util.Arrays;
import java.util.TreeMap;

public class SortedHistogram {


    public TreeMap<String, Integer> getHistogram(String[] input) {

        Arrays.sort(input);

        TreeMap<String, Integer> result = new TreeMap<>();

        for (int i = 0; i < input.length; i++) {
            Integer count = result.get(input[i]);
            if (count == null) {
                result.put(input[i], 1);
            } else {
                result.put(input[i], count + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String[] initialArray = {"d", "a", "k", "k", "a", "d", "a", "k", "k", "a", "a", "n", "o", "n", "i", "s", "b", "a", "k", "a"};
        SortedHistogram histogram = new SortedHistogram();
        System.out.println(histogram.getHistogram(initialArray));

    }

}