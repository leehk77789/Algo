package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2529 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static long max;

    static long min;

    static int size;

    static String check;

    static String[] sign;

    static boolean[] visit;

    static void input() throws NumberFormatException, IOException {
        max = Long.MIN_VALUE;
        min = Long.MAX_VALUE;

        check = "";

        size = Integer.parseInt(br.readLine());

        sign = new String[size];
        input = br.readLine().split(" ");
        for (int i = 0; i < size; i++) {
            sign[i] = input[i];
        }

        visit = new boolean[10];
    }

    static void find(int depth) {
        if (depth == size + 1) {
            long answer = Long.parseLong(check);
            if (answer > max) {
                max = answer;
            }
            if (answer < min) {
                min = answer;
            }
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (!visit[i]) {
                if (depth != 0 && sign[depth - 1].equals("<")) {
                    if (checkBig((check.charAt(depth - 1) - '0'), i)) {
                        continue;
                    }
                }

                if (depth != 0 && sign[depth - 1].equals(">")) {
                    if (checkSmall((check.charAt(depth - 1) - '0'), i)) {
                        continue;
                    }
                }
                visit[i] = true;
                check += String.valueOf(i);
                find(depth + 1);
                check = check.substring(0, check.length() - 1);
                visit[i] = false;
            }
        }
    }

    static boolean checkBig(int left, int right) {
        if (left < right) {
            return false;
        }
        return true;
    }

    static boolean checkSmall(int left, int right) {
        if (left > right) {
            return false;
        }
        return true;
    }

    static void solve() throws NumberFormatException, IOException {
        input();
        find(0);
        String answerMax = String.valueOf(max);
        String answerMin = String.valueOf(min);
        if (answerMax.length() > answerMin.length()) {
            sb.append(answerMax).append("\n");
            sb.append("0").append(answerMin);
        } else {
            sb.append(answerMax).append("\n");
            sb.append(answerMin);
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        solve();
    }
}
