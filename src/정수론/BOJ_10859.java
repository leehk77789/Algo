package 정수론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10859 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String input;

    static void input() throws NumberFormatException, IOException {
        input = br.readLine();
    }

    static void find() {
        long num = Long.parseLong(input);

        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                sb.append("no");
                return;
            }
        }

        if (input.contains("3") || input.contains("4") || input.contains("7")) {
            sb.append("no");
            return;
        }

        String numArr = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == '6') {
                numArr += "9";
            } else if (input.charAt(i) == '9') {
                numArr += "6";
            } else {
                numArr += input.charAt(i);
            }
        }

        num = Long.parseLong(numArr);

        if (num == 1) {
            sb.append("no");
            return;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sb.append("no");
                return;
            }
        }

        sb.append("yes");
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
