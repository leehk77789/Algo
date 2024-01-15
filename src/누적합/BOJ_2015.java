package 누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ_2015 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static Map<Integer, Long> map;

    static int N;

    static int K;

    static int[] prefix;

    static long count;

    static void input() throws NumberFormatException, IOException {
        input = br.readLine().split(" ");
        count = 0;
        map = new HashMap<>();
        N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        prefix = new int[N + 1];
        for (int i = 0; i < N; i++) {
            prefix[i + 1] = prefix[i] + Integer.parseInt(input[i]);
        }
    }

    static void find() {
        for (int i = 1; i <= N; i++) {
            if (prefix[i] == K) {
                count++;
            }
            if (map.containsKey(prefix[i] - K)) {
                count += map.get(prefix[i] - K);
            }
            if (!map.containsKey(prefix[i])) {
                map.put(prefix[i], 1L);
            } else {
                map.put(prefix[i], map.get(prefix[i]) + 1);
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
