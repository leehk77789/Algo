package 정수론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_9417 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static ArrayList<Integer> arr;

    static void input() throws NumberFormatException, IOException {
        int tc = Integer.parseInt(br.readLine());

        for (int i = 1; i <= tc; i++) {
            arr = new ArrayList<Integer>();
            input = br.readLine().split(" ");
            for (int j = 0; j < input.length; j++) {
                arr.add(Integer.parseInt(input[j]));
            }
            sb.append(find(arr)).append("\n");
        }
    }

    static int find(ArrayList<Integer> arr) {
        int max = 1;
        for (int i = 1; i <= arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int temp = GCD(arr.get(i - 1), arr.get(j));
                if (max < temp) {
                    max = temp;
                }
            }
        }
        return max;
    }

    static int GCD(int a, int b) {
        int a1, b1;
        if (a > b) {
            b1 = b;
            a1 = a;
        } else {
            a1 = b;
            b1 = a;
        }

        while (true) {
            int temp = a1 % b1;
            if (temp == 0) {
                break;
            }
            a1 = b1;
            b1 = temp;
        }
        return b1;
    }

    static void solve() throws NumberFormatException, IOException {
        input();
        find(arr);
        System.out.println(sb);
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        solve();
    }
}
