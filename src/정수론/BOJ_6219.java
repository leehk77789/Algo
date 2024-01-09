package 정수론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_6219 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static int min;

    static int max;

    static int count;

    static void input() throws NumberFormatException, IOException {
        count = 0;
        input = br.readLine().split(" ");
        min = Integer.parseInt(input[0]);
        max = Integer.parseInt(input[1]);
    }

    static void find() {
        for (int i = min; i <= max; i++) {
            if (sosu(i) && Integer.toString(i).contains(input[2])) {
                count++;
            }
        }
        sb.append(count);
    }

    static boolean sosu(int num) {
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
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
