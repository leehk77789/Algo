package 누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1912 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static int num;

    static int max;

    static int[] prefix;

    static void input() throws NumberFormatException, IOException {
        num = Integer.parseInt(br.readLine());
        max = Integer.MIN_VALUE;
        input = br.readLine().split(" ");
        prefix = new int[input.length + 1];
        for (int i = 0; i < input.length; i++) {
            int nowNum = Integer.parseInt(input[i]);
            prefix[i + 1] = Math.max(prefix[i] + nowNum, nowNum);
        }
    }

    static void find() {
        for (int i = 1; i < prefix.length; i++) {
            if (prefix[i] > max) {
                max = prefix[i];
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
