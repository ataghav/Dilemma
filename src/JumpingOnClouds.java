import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingOnClouds {


    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        List<Integer> steps = new ArrayList<Integer>();
        int i = 0;
        while (i < c.length - 1) {
            if (i <= c.length - 3 && c[i + 2] == 0) {
                i += 2;
                steps.add(i);
            } else {
                i++;
                steps.add(i);
            }
        }
        return steps.size();
    }

    public static void main(String[] args) {

//        int[] c = {0, 0, 0, 0, 1, 0};
        int[] c = {0, 0, 1, 0, 0, 1, 0};

        System.out.println(jumpingOnClouds(c));
    }
}

