package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_6131 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int input;

    static int count;

    static void input() throws NumberFormatException, IOException {
        input = Integer.parseInt(br.readLine());
        count = 0;
    }

    static void find() {
        for (int b = 1; b <= 500; b++) {
            for (int a = 1; a <= 500; a++) {
                if (a * a == b * b + input) {
                    count++;
                    break;
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
