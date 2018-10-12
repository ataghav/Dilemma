import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        for (int i = 0; i <= n - 1; i++) {
            if (!numbers.containsKey(ar[i])) {
                numbers.put(ar[i], 1);
            } else {
                numbers.put(ar[i], numbers.get(ar[i]) + 1);
            }
        }
        int pairsCount = 0;
//        numbers.forEach((k, v) -> pairsCount =+ v \ 2);
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            pairsCount = pairsCount + (entry.getValue() / 2);

        }
        return pairsCount;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int n = 9;
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        System.out.println(sockMerchant(n, ar));

        scanner.close();
    }
}
