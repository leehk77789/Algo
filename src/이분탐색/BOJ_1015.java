package 이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1015 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static int[] arr;

    static int size;

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
    }

    static void find() {
        Arrays.sort(arr);
        for (int i = 0; i < check.length; i++) {
            if (search(check[i], 0, arr.length - 1) == -1) {
                sb.append(0).append(" ");
            } else {
                sb.append(1).append(" ");
            }
        }
    }

    static int search(int key, int low, int high) {
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                return search(key, low, mid - 1);
            } else {
                return search(key, mid + 1, high);
            }
        }

        return -1;
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
