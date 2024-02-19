package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10819 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static int size;

    static int[] arr;

    static boolean[] visit;

    static int max;

    static void input() throws NumberFormatException, IOException {
        size = Integer.parseInt(br.readLine());
        arr = new int[size];
        visit = new boolean[size];
        max = Integer.MIN_VALUE;

        input = br.readLine().split(" ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
    }

    static void find(int depth, int sum) {
        if (depth == size) {
            if (sum > max) {
                max = sum;
            }
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visit[i]) {
                if (i != 0) {
                    visit[i] = true;
                    find(depth + 1, sum + Math.abs(arr[i] - arr[i - 1]));
                    visit[i] = false;
                } else {
                    find(depth + 1, sum);
                }
            }
        }
    }

    static void solve() throws NumberFormatException, IOException {
        input();
        find(0, 0);
        sb.append(max);
        System.out.println(sb);
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        solve();
    }
}
