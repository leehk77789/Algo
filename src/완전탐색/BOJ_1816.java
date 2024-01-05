package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_1816 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static ArrayList<Long> nums;

    static void input() throws NumberFormatException, IOException {
        nums = new ArrayList<>();
        int tc = Integer.parseInt(br.readLine());
        for (int i = 1; i <= tc; i++) {
            nums.add(Long.parseLong(br.readLine()));
        }
    }

    static void find() {
        for (int i = 0; i < nums.size(); i++) {
            Long check = nums.get(i);
            boolean sosu = true;
            for (int j = 2; j <= 1000000; j++) {
                if (check % j == 0) {
                    sosu = false;
                    break;
                }
            }
            if (sosu) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
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
