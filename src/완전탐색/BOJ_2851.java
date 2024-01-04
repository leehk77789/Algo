package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_2851 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static ArrayList<Integer> mushrooms;

    static int score;

    static void input() throws NumberFormatException, IOException {
        mushrooms = new ArrayList<Integer>();
        
        for (int i = 1; i <= 10; i++) {
            mushrooms.add(Integer.parseInt(br.readLine()));
        }

        score = 0;
    }

    static void find() {
        for (int i = 0; i < mushrooms.size(); i++) {
            if (Math.abs(100 - score) < Math.abs(100 - score - mushrooms.get(i))) {
                break;
            } else {
                score += mushrooms.get(i);
            }
        }
        sb.append(score);
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
