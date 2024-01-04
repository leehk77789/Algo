package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_1145 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();

    static String[] input;
    static ArrayList<Integer> nums;

    static void input() throws NumberFormatException, IOException {
        nums = new ArrayList<Integer>();
        
        input = br.readLine().split(" ");

        for (int i = 0; i < 5; i++) {
            nums.add(Integer.parseInt(input[i]));
        }
    }

    static void find() {
        for (int i = 4; i < Integer.MAX_VALUE; i++) {
            int count = 0;
            for (int j = 0; j < nums.size(); j++) {
                if (i % nums.get(j) == 0) {
                    count++;
                }
            }
            if (count >= 3) {
                sb.append(i);
                return;
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
