package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_7696 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String input;

    static ArrayList<String> nums;

    static void input() throws NumberFormatException, IOException {
        nums = new ArrayList<>();
        while ((input = br.readLine()) != null) {
            nums.add(input);
        }
    }

    static void find() {
        for (int i = 0; i < nums.size(); i++) {
            int pass = 0;
            int base = 1;
            while (pass != Integer.parseInt(nums.get(i))) {
                
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
