package 정수론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15996 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static int N;

    static int A;

    static int count;

    static void input() throws NumberFormatException, IOException {
        input = br.readLine().split(" ");

        N = Integer.parseInt(input[0]);
        A = Integer.parseInt(input[1]);

        count = 0;
    }

    static void find() {
        while (N >= A) {
            N /= A;
            count += N;
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
