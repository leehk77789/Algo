package 이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_16498 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static int[] a, b, c;

    static int result;

    static void input() throws NumberFormatException, IOException {
        result = Integer.MAX_VALUE;

        input = br.readLine().split(" ");
        int aSize = Integer.parseInt(input[0]);
        int bSize = Integer.parseInt(input[1]);
        int cSize = Integer.parseInt(input[2]);

        a = new int[aSize];
        b = new int[bSize];
        c = new int[cSize];

        input = br.readLine().split(" ");
        for (int i = 0; i < aSize; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        input = br.readLine().split(" ");
        for (int i = 0; i < bSize; i++) {
            b[i] = Integer.parseInt(input[i]);
        }
        input = br.readLine().split(" ");
        for (int i = 0; i < cSize; i++) {
            c[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(b);
        Arrays.sort(c);
    }

    static void find() {

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
