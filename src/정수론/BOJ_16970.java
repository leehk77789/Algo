package 정수론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_16970 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static int N, M, K, count;

    static void input() throws NumberFormatException, IOException {
        count = 0;
        input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        K = Integer.parseInt(input[2]);
    }

    static void find() {
        for (int x1 = 0; x1 <= N; x1++) {
            for (int y1 = 0; y1 <= M; y1++) {
                for (int x2 = 0; x2 <= N; x2++) {
                    for (int y2 = 0; y2 <= M; y2++) {
                        if (gcd(Math.abs(x1 - x2), Math.abs(y1 - y2)) + 1 == K) {
                            count++;
                        }
                    }
                }
            }
        }
        sb.append(count / 2);
    }

    static void solve() throws NumberFormatException, IOException {
        input();
        find();
        System.out.println(sb);
    }

    private static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        solve();
    }
}
