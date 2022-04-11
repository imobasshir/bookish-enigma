package day4;

import java.util.Scanner;

class CAR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int x1, x2, y1, y2;
            x1 = sc.nextInt();
            x2 = sc.nextInt();
            y1 = sc.nextInt();
            y2 = sc.nextInt();
            int op = y1 * x2 - y2 * x1;

            if (op < 0)
                op = -1;
            if (op > 0)
                op = 1;

            System.out.println(op);
            t--;
        }
    }
}
