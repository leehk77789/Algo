package 누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11660 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static int[][] prefix;

    static int tc;

    static void input() throws NumberFormatException, IOException {
        input = br.readLine().split(" ");
        int size = Integer.parseInt(input[0]);
        tc = Integer.parseInt(input[1]);

        prefix = new int[size + 1][size + 1];
        for (int i = 1; i <= size; i++) {
            input = br.readLine().split(" ");
            for (int j = 0; j < input.length; j++) {
                prefix[i][j + 1] = prefix[i][j] + Integer.parseInt(input[j]);
            }
        }
    }

    static void find() throws IOException {
        for (int i = 1; i <= tc; i++) {
            int sum = 0;
            input = br.readLine().split(" ");
            int x1 = Integer.parseInt(input[0]);
            int y1 = Integer.parseInt(input[1]);
            int x2 = Integer.parseInt(input[2]);
            int y2 = Integer.parseInt(input[3]);
            for (int x = x1; x <= x2; x++) {
                sum += prefix[x][y2] - prefix[x][y1 - 1];
            }
            sb.append(sum).append("\n");
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
