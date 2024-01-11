package 누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11659 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static int[] prefix;

    static int count;

    static void input() throws NumberFormatException, IOException {
        input = br.readLine().split(" ");
        prefix = new int[Integer.parseInt(input[0]) + 1];
        count = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
    }

    static void find() throws IOException {
        for (int i = 0; i < input.length; i++) {
            prefix[i + 1] = prefix[i] + Integer.parseInt(input[i]);
        }

        for (int tc = 1; tc <= count; tc++) {
            input = br.readLine().split(" ");
            int sum = prefix[Integer.parseInt(input[1])] - prefix[Integer.parseInt(input[0]) - 1];
            sb.append(sum).append("\n");
        }
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
