package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_17945 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static int A;
    static int B;

    static void input() throws NumberFormatException, IOException {
        input = br.readLine().split(" ");
        A = Integer.parseInt(input[0]);
        B = Integer.parseInt(input[1]);
    }

    static void find() {
        int root = (int) Math.sqrt(A * A - B);
        int answer1 = (-1 * A) - root;
        int answer2 = (-1 * A) + root;

        if (answer1 == answer2) {
            sb.append(answer1);
        } else {
            sb.append(answer1 + " " + answer2);
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
