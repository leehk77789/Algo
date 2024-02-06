package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1182 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static int count;

    static int target;

    static boolean[] visit;

    static int size;

    static int[] arr;

    static void input() throws NumberFormatException, IOException {
        count = 0;

        input = br.readLine().split(" ");

        size = Integer.parseInt(input[0]);

        arr = new int[size];

        visit = new boolean[size];

        target = Integer.parseInt(input[1]);

        input = br.readLine().split(" ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

    }

    static void find(int sum, int depth) {
        if (depth == size) {
            if (sum == target) {
                count++;
            }
            return;
        }

        find(sum + arr[depth], depth + 1);
        find(sum, depth + 1);
    }

    static void solve() throws NumberFormatException, IOException {
        input();
        find(0, 0);
        if (target == 0) {
            sb.append(count - 1);
        } else {
            sb.append(count);
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        solve();
    }
}
