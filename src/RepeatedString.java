import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {
    static long repeatedString(String s, long n) {
        long countInWord = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') countInWord++;
        }
        long remainingLetters = n % s.length();
        long completeWords = n / s.length();
        long counter = countInWord * completeWords;

        if (remainingLetters > 0) {
            for (int i = 0; i < remainingLetters; i++) {
                if (s.toCharArray()[i] == 'a') {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {

//        String s = "aab";
        String s = "aba";

//        long n = 882787;
        long n = 10;

        System.out.println(repeatedString(s, n));
        ;

    }
}
