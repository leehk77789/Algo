package 정수론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2004 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static int two;

    static int five;

    static long a;

    static long b;

    static void input() throws NumberFormatException, IOException {
        input = br.readLine().split(" ");
        a = Long.parseLong(input[0]);
        b = Long.parseLong(input[1]);

        two = 0;
        five = 0;
    }

    static void find() {
        long count5 = findFive(a) - findFive(a - b) - findFive(b);
        long count2 = findTwo(a) - findTwo(a - b) - findTwo(b);
        sb.append(Math.min(count5, count2));
    }

    static long findFive(long num) {
        int count = 0;

        while (num >= 5) {
            count += (num / 5);
            num /= 5;
        }
        return count;
    }

    static long findTwo(long num) {
        int count = 0;
        while (num >= 2) {
            count += (num / 2);
            num /= 2;
        }
        return count;
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
