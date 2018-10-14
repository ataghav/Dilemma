import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class EqualizeArray {

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
        HashMap<Integer, Integer> elements = new HashMap<>();
        for (int e : arr) {
            if (!elements.containsKey(e)) {
                elements.put(e, 1);
            } else {
                elements.put(e, elements.get(e) + 1);
            }
        }
        Map.Entry<Integer, Integer> maxEntry = null;

        for (Map.Entry<Integer, Integer> entry : elements.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }

        return arr.length - maxEntry.getValue();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = 5;

        int[] arr = {};

        int result = equalizeArray(arr);

        System.out.print(result);
    }
}
