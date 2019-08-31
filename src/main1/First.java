package main1;
import java.util.Scanner;

    public class First {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            double sum = 0;
            for (double i = 1; i <= num; i++) {
                sum = sum + 1 / i;
            }
            System.out.println(sum);
        }
    }
