package 투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_3273 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int[] input;
    static int N;
    static int X;
    static int count;

    static void input() throws NumberFormatException, IOException {
        // count 초기화
        count = 0;

        // N
        N = Integer.parseInt(br.readLine());

        // 숫자 배열
        input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        // x
        X = Integer.parseInt(br.readLine());
    }

    static void find() {
        Arrays.sort(input);

        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] + input[j] > X) {
                    break;
                } else if (input[i] + input[j] == X) {
                    count++;
                }
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
