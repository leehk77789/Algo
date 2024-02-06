package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_15657 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static int N;

    static int M;

    static int[] arr;

    static int[] num;

    static void input() throws NumberFormatException, IOException {
        input = br.readLine().split(" ");

        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        arr = new int[M];
        num = new int[N];

        input = br.readLine().split(" ");

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(num);
    }

    static void find(int now, int depth) {
        if (depth == M) {
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = now; i < N; i++) {
            arr[depth] = num[i];
            find(i, depth + 1);
        }
    }

    static void solve() throws NumberFormatException, IOException {
        input();
        find(0, 0);

        System.out.println(sb);
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        solve();
    }
}
