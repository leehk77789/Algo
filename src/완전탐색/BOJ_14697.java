package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14697 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static String[] input;

    static int room1;

    static int room2;

    static int room3;

    static int total;

    static void input() throws NumberFormatException, IOException {
        input = br.readLine().split(" ");

        room1 = Integer.parseInt(input[0]);

        room2 = Integer.parseInt(input[1]);

        room3 = Integer.parseInt(input[2]);

        total = Integer.parseInt(input[3]);
    }

    static void find() {
        for (int i = 0; i <= total / room1; i++) {
            for (int j = 0; j <= total / room2; j++) {
                for (int z = 0; z <= total / room3; z++) {
                    if (i * room1 + j * room2 + z * room3 == total) {
                        sb.append(1);
                        return;
                    }
                }
            }
        }
        sb.append(0);
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
