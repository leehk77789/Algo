package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2563 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static int[][] paper;

    static int[][] colorPaper;

    static int sum;

    static void input() throws NumberFormatException, IOException {
        paper = new int[101][101];
        int tc = Integer.parseInt(br.readLine());
        colorPaper = new int[tc][2];
        sum = 0;

        for (int i = 0; i < tc; i++) {
            input = br.readLine().split(" ");
            colorPaper[i][0] = Integer.parseInt(input[0]);
            colorPaper[i][1] = Integer.parseInt(input[1]);
        }
    }

    static void find() {
        for (int i = 0; i < colorPaper.length; i++) {
            for (int x = colorPaper[i][0]; x < colorPaper[i][0] + 10; x++) {
                for (int y = colorPaper[i][1]; y < colorPaper[i][1] + 10; y++) {
                    if (paper[x][y] != 1) {
                        paper[x][y] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                sum += paper[i][j];
            }
        }

        sb.append(sum);
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
