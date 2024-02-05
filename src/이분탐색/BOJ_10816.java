package 이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_10816 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static int size;

    static int[] arr;

    static int[] check;

    static void input() throws NumberFormatException, IOException {
        size = Integer.parseInt(br.readLine());

        arr = new int[size];

        input = br.readLine().split(" ");

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int checkSize = Integer.parseInt(br.readLine());

        check = new int[checkSize];

        input = br.readLine().split(" ");

        for (int i = 0; i < checkSize; i++) {
            check[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arr);
    }

    static void find() {
        for (int i = 0; i < check.length; i++) {
            sb.append(findRight(check[i], 0, arr.length) - findLeft(check[i], 0, arr.length)).append(" ");
        }
    }

    static int findLeft(int key, int left, int right) {
        while (left < right) {
            int mid = (left + right) / 2;

            if (key <= arr[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    static int findRight(int key, int left, int right) {
        while (left < right) {
            int mid = (left + right) / 2;

            if (key < arr[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
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
