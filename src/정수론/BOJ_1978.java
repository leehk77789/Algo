package 정수론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1978 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static int tc;

    static int count;

    static void input() throws NumberFormatException, IOException {
        count = 0;
        tc = Integer.parseInt(br.readLine());
    }

    static void find() throws IOException {
        input = br.readLine().split(" ");

        for (int j = 0; j < input.length; j++) {
            if (Integer.parseInt(input[j]) == 1) {
                continue;
            }
            check(Integer.parseInt(input[j]));
        }
        sb.append(count);
    }

    static void check(int num) {
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return;
            }
        }
        count++;
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
