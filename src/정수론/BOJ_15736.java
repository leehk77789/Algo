package 정수론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15736 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static int count;

    static int tc;

    static void input() throws NumberFormatException, IOException {
        tc = Integer.parseInt(br.readLine());
        count = 1;
    }

    static void find() {
        for (int i = 2; i <= tc; i++) {
            if (i * i > tc) {
                break;
            }
            count++;
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
