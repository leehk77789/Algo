package 정수론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1407 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static long min;

    static long max;


    static void input() throws NumberFormatException, IOException {
        input = br.readLine().split(" ");

        min = Long.parseLong(input[0]);
        max = Long.parseLong(input[1]);
    }

    static void find() {
        sb.append(cal(max) - cal(min - 1));
    }

    static long cal(long num) {
        long result = num;

        for (long i = 2; i <= num; i <<= 1) {
            result += (num / i) * (i >> 1);
        }

        return result;
    }

    static void solve() throws NumberFormatException, IOException {
        input();
        find();
        System.out.println(sb);
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        solve();
    }
}
