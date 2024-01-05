package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15593 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static int[][] time;

    static int[] test;

    static int sum;

    static int max;

    static void input() throws NumberFormatException, IOException {
        int tc = Integer.parseInt(br.readLine());
        time = new int[tc][2];
        sum = 0;
        max = 0;

        for (int i = 0; i < tc; i++) {
            input = br.readLine().split(" ");
            time[i][0] = Integer.parseInt(input[0]);
            time[i][1] = Integer.parseInt(input[1]);
        }
    }

    static void find() {
        for (int i = 0; i < time.length; i++) {
            test = new int[1001];
            sum = 0;
            for (int j = 0; j < time.length; j++) {
                if (i != j) {
                    for (int z = time[j][0]; z < time[j][1]; z++) {
                        if (test[z] != 1) {
                            test[z]++;
                        }
                    }
                }
            }

            for (int j = 0; j < test.length; j++) {
                sum += test[j];
            }

            if (max < sum) {
                max = sum;
            }
        }
        sb.append(max);
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
