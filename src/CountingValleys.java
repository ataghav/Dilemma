public class CountingValleys {


    static int countingValleys(int n, String s) {
        int vCounter = 0;
        int alt = 0;
        boolean zeroAlt = true;
        char[] steps = s.toCharArray();

        for (char step : steps) {
            if (step == 'U') {
                alt++;
                if (zeroAlt) zeroAlt = false;
            } else {
                if (zeroAlt) {
                    vCounter++;
                    zeroAlt = false;
                }
                alt--;
            }
            if (alt == 0) zeroAlt = true;

        }
        return vCounter;
    }

    public static void main(String[] args) {

        int n = 12;
//        String s = "UUDDDDUUUDDDUUUDDDDDDUUUUU";
        String s = "DDUUDDUDUUUD";

        int result = countingValleys(n, s);

        System.out.println(result);
    }
}


