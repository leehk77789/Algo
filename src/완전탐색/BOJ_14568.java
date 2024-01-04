package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14568 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int total;

    static int count;

    static void input() throws NumberFormatException, IOException {
        total = Integer.parseInt(br.readLine());
        count = 0;
    }

    static void find() {
        for (int a = 1; a <= total - 2; a++) {
            for (int b = 1; b <= total - 2; b++) {
                for (int c = 1; c <= total - 2; c++) {
                    if (a + b + c == total && c >= b + 2 && a % 2 == 0) {
                        count++;
                    }
                }
            }
        }
        sb.append(count);
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
