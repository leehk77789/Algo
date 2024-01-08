package 정수론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_23888 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int d = Integer.parseInt(input[1]);
        int q = Integer.parseInt(br.readLine());

        for (int i = 0; i < q; i++) {
            input = br.readLine().split(" ");
            int check = Integer.parseInt(input[0]);
            int l = Integer.parseInt(input[1]);
            int r = Integer.parseInt(input[2]);

            if (check == 1) {
                long sum1 = (r * ((2 * a) + (r - 1) * d)) / 2;
                long sum2 = ((l - 1) * ((2 * a) + (l - 2) * d)) / 2;
                sb.append(sum1 - sum2).append("\n");
            } else if (check == 2) {
                if (l == r) {
                    sb.append(a + (l - 1) * d).append("\n");
                } else {
                    sb.append(gcd(a, d)).append("\n");
                }
            }
        }

        System.out.print(sb.toString());
    }

    private static long gcd(long x, long y) {
        while (y != 0) {
            long temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}


