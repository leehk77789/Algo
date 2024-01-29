package 이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_2121 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static ArrayList<Integer>[] arr;

    static int[][] num;

    static int count;

    static int xTarget;

    static int yTarget;

    static int xMax;

    static int yMax;

    static void input() throws NumberFormatException, IOException {
        int spots = Integer.parseInt(br.readLine());

        count = 0;

        xMax = 0;

        yMax = 0;

        arr = new ArrayList[spots];

        num = new int[spots][2];

        input = br.readLine().split(" ");

        xTarget = Integer.parseInt(input[0]);

        yTarget = Integer.parseInt(input[1]);

        for (int i = 0; i < spots; i++) {
            input = br.readLine().split(" ");
            num[i][0] = Integer.parseInt(input[0]);
            if (xMax < num[i][0]) {
                xMax = num[i][0];
            }
            num[i][1] = Integer.parseInt(input[1]);
            if (yMax < num[i][1]) {
                yMax = num[i][1];
            }
        }
        for (int i = 0; i < num.length; i++) {
            arr[num[i][0]] = new ArrayList<>();
        }
        for (int i = 0; i < num.length; i++) {
            arr[num[i][0]].add(num[i][1]);
        }
    }

    static void find() {
        for (int i = 0; i < num.length; i++) {
            int x1 = num[i][0];
            int y1 = num[i][1];
            int check = 0;
            if (arr[x1].contains(y1 + yTarget)) {
                check++;
            }
            if (x1 + xTarget <= xMax && arr[x1 + xTarget].contains(y1)) {
                check++;
            }
            if (x1 + xTarget <= xMax && arr[x1 + xTarget].contains(y1 + yTarget)) {
                check++;
            }
            if (check == 3) {
                count++;
            }
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
