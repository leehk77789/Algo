package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_16283 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static int sheepEat;

    static int goatEat;

    static int total;

    static int totalEat;

    static int count;

    static void input() throws NumberFormatException, IOException {
        input = br.readLine().split(" ");
        sheepEat = Integer.parseInt(input[0]);
        goatEat = Integer.parseInt(input[1]);
        total = Integer.parseInt(input[2]);
        totalEat = Integer.parseInt(input[3]);
    }

    static void find() {
        for (int i = 1; i <= total; i++) {
            for (int j = 1; j <= total - i; j++) {
                if (i + j == total && sheepEat * i + goatEat * j == totalEat) {
                    sb.append(i + " " + j);
                    count++;
                }
            }
        }
    }

    static void solve() throws NumberFormatException, IOException {
        input();
        find();
        if (count != 1) {
            System.out.println(-1);
        } else {
            System.out.println(sb);
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        solve();
    }
}
