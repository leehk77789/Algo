package 누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2559 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static int[] prefix;

    static int gap;

    static void input() throws NumberFormatException, IOException {
        input = br.readLine().split(" ");

        prefix = new int[Integer.parseInt(input[0]) + 1];

        gap = Integer.parseInt(input[1]);

        input = br.readLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            prefix[i + 1] = prefix[i] + Integer.parseInt(input[i]);
        }
    }

    static void find() {
        int max = Integer.MIN_VALUE;
        for (int i = gap; i < prefix.length; i++) {
            int compare = prefix[i] - prefix[i - gap];
            if (max < compare) {
                max = compare;
            }
        }
        sb.append(max);
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
