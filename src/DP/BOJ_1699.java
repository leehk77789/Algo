package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1699 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static int target;
    static int count;

    static int[] dp = new int[100001];

    static void input() throws NumberFormatException, IOException {
        count = 0;

        target = Integer.parseInt(br.readLine());
    }

    static void find() {
        dp[1] = 1;

        for (int i = 2; i <= target; i++) {
            int min = 100001;

            for (int j = 1; j <= i / 2; j++) {

                if (j * j == i) {
                    min = 1;
                    break;
                } else {
                    min = Math.min(min, dp[j] + dp[i - j]);
                }

            }
            dp[i] = min;
        }
        sb.append(dp[target]);
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
