package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_2309 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String input;

    static ArrayList<Integer> tall;

    static int total;

    static void input() throws NumberFormatException, IOException {
        tall = new ArrayList<>();

        total = 0;

        for (int i = 0; i < 9; i++) {
            input = br.readLine();
            int nowTall = Integer.parseInt(input);
            tall.add(nowTall);
            total += nowTall;
        }
    }

    static void find() {
        for (int i = 0; i < tall.size() - 1; i++) {
            for (int j = i + 1; j < tall.size(); j++) {
                if (total - tall.get(i) - tall.get(j) == 100) {
                    tall.set(i, 10000);
                    tall.set(j, 10000);
                    return;
                }
            }
        }
    }

    static void solve() throws NumberFormatException, IOException {
        input();
        find();
        Collections.sort(tall);
        for (int i = 0; i < tall.size(); i++) {
            if (tall.get(i) != 10000) {
                System.out.println(tall.get(i));
            }
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        solve();
    }
}
