package 투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_2309 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int left;

    static int right;

    static int answer;

    static int sum;

    static int[] arr;

    static int target;

    static void input() throws NumberFormatException, IOException {
        answer = 0;
        sum = 0;
        arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);
        target = sum - 100;
        left = 0;
        right = 8;
    }

    static void find() {
        while (true) {
            if (arr[left] + arr[right] == target) {
                break;
            }
            if (target > arr[left] + arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (i == left || i == right) {
                continue;
            }
            sb.append(arr[i]).append("\n");
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
