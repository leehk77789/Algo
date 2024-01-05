package 완전탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2503 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int[][] test;

    static String[] input;

    static int count;

    static void input() throws NumberFormatException, IOException {
        int tc = Integer.parseInt(br.readLine());
        test = new int[tc][3];
        count = 0;

        for (int i = 0; i < tc; i++) {
            input = br.readLine().split(" ");
            test[i][0] = Integer.parseInt(input[0]);
            test[i][1] = Integer.parseInt(input[1]);
            test[i][2] = Integer.parseInt(input[2]);
        }
    }

    static void find() {
        for (int i = 123; i <= 987; i++) {
            //일의자리 십의자리가 같거나, 일의자리 백의자리가 같거나, 십의자리 백의자리가 같으면 조건 위배 스킵
            if (findOne(i) == findTen(i) || findOne(i) == findHundred(i) || findHundred(i) == findTen(i)) {
                continue;
            }
            if (findOne(i) == 0 || findTen(i) == 0) {
                continue;
            }
            int check = 0;
            for (int j = 0; j < test.length; j++) {
                int strike = 0;
                int ball = 0;
                //스트라이크 찾기
                if (findHundred(test[j][0]) == findHundred(i)) {
                    strike++;
                }
                if (findTen(test[j][0]) == findTen(i)) {
                    strike++;
                }
                if (findOne(test[j][0]) == findOne(i)) {
                    strike++;
                }
                if (test[j][1] != strike) {
                    break;
                }
                //볼 찾기
                if (findHundred(test[j][0]) == findTen(i) || findHundred(test[j][0]) == findOne(i)) {
                    ball++;
                }
                if (findTen(test[j][0]) == findHundred(i) || findTen(test[j][0]) == findOne(i)) {
                    ball++;
                }
                if (findOne(test[j][0]) == findHundred(i) || findOne(test[j][0]) == findTen(i)) {
                    ball++;
                }
                if (test[j][2] == ball) {
                    check++;
                }
            }
            if (check == test.length) {
                count++;
            }
        }
        sb.append(count);
    }

    static int findHundred(int num) {
        return num % 1000 / 100;
    }

    static int findTen(int num) {
        return num % 100 / 10;
    }

    static int findOne(int num) {
        return num % 10;
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
