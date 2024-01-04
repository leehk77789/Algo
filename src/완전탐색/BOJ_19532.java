package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_19532 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static int a;

    static int b;

    static int c;

    static int d;

    static int e;

    static int f;

    static void input() throws NumberFormatException, IOException {
        input = br.readLine().split(" ");
        a = Integer.parseInt(input[0]);
        b = Integer.parseInt(input[1]);
        c = Integer.parseInt(input[2]);
        d = Integer.parseInt(input[3]);
        e = Integer.parseInt(input[4]);
        f = Integer.parseInt(input[5]);
    }

    static void find() {
        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                if (a * x + b * y == c && d * x + e * y == f) {
                    sb.append(x + " " + y);
                    return;
                }
            }
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
