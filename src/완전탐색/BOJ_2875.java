package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2875 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static int girl;

    static int boy;

    static int intern;

    static void input() throws NumberFormatException, IOException {
        input = br.readLine().split(" ");
        girl = Integer.parseInt(input[0]);
        boy = Integer.parseInt(input[1]);
        intern = Integer.parseInt(input[2]);
    }

    static void find() {
        for (int i = boy; i >= 1; i--) {
            if ((girl - 2 * i) >= 0 && (girl - 2 * i) + (boy - i) >= intern) {
                sb.append(i);
                return;
            }
        }
        sb.append(0);
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
