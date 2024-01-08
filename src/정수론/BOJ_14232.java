package 정수론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_14232 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static long max;

    static ArrayList<Long> answer;

    static void input() throws NumberFormatException, IOException {
        answer = new ArrayList<>();
        max = Long.parseLong(br.readLine());
    }

    static void find() {
        for (long i = 2; i * i <= max; i++) {
            while (max % i == 0) {
                answer.add(i);
                max /= i;
            }
        }

        if (max != 1) {
            answer.add(max);
        }
    }

    static void solve() throws NumberFormatException, IOException {
        input();
        find();
        System.out.println(answer.size());
        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        solve();
    }
}
