package 투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2003 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static int left;

    static int right;

    static int[] arr;

    static int sum;

    static int target;

    static int count;

    static int size;

    static void input() throws NumberFormatException, IOException {
        sum = 0;
        count = 0;
        input = br.readLine().split(" ");
        size = Integer.parseInt(input[0]);
        arr = new int[size];
        target = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
    }

    static void find() {
        while (true) {
            if (sum >= target) {
                sum -= arr[left++];
            } else if (right == size) {
                break;
            } else {
                sum += arr[right++];
            }
            if (sum == target) {
                count++;
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
