package 누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14719 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static int start;

    static int end;

    static int sum;

    static int W;

    static int H;

    static int[] width;

    static int tmp;

    static void input() throws NumberFormatException, IOException {
        sum = 0;
        start = 0;
        end = 0;
        input = br.readLine().split(" ");
        H = Integer.parseInt(input[0]);
        W = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");

        width = new int[W];

        for (int i = 0; i < input.length; i++) {
            width[i] = Integer.parseInt(input[i]);
        }
    }

    static void find() {
        for (start = 0; start < W - 1; ) {
            if (width[start] == 0) {
                start++;
                continue;
            }

            int maxLen = width[start];
            while1:
            while (maxLen >= 1) {
                for (end = start + 1; end < W; end++) {
                    if (width[end] >= maxLen) {
                        int max = 0;
                        if (width[start] < width[end]) {
                            max = width[start];
                        } else {
                            max = width[end];
                        }
                        for (int i = start + 1; i < end; i++) {
                            sum += max - width[i];
                        }
                        break while1;
                    }
                }
                maxLen--;
            }
            start = end;
        }
        sb.append(sum);
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
