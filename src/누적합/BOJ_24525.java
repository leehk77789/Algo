package 누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_24525 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String input;

    static int[] prefix_s;
    static int[] prefix_k;

    static int max;

    static void input() throws NumberFormatException, IOException {
        input = br.readLine();
        prefix_s = new int[input.length() + 1];
        prefix_k = new int[input.length() + 1];

        max = 0;

        int sCount = 0;
        int kCount = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 's') {
                sCount++;
            }
            if (input.charAt(i) == 'k') {
                kCount++;
            }
            prefix_s[i + 1] = sCount;
            prefix_k[i + 1] = kCount;
        }
    }

    static void find() {
        for (int i = 1; i < prefix_k.length; i++) {
            for (int j = i; j < prefix_k.length; j++) {
                if (prefix_s[j] != 0 && prefix_k[j] != 0 && prefix_s[j] - prefix_k[j - i] == (prefix_k[j] - prefix_k[j - i]) * 2) {
                    max = i;
                }
            }
        }
        if (max == 0) {
            sb.append(-1);
        } else {
            sb.append(max);
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
