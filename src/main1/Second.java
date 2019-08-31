package main1;

import java.util.Scanner;
import java.lang.String;


public class Second {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String a=sc.nextLine();
        int b=a.indexOf('.');
        for(int i=0;i<b;i++){
            System.out.print(a.charAt(i));
        }
        System.out.print(" Rupees and ");
        for(int i =b; i < a.length(); i++){
            System.out.print(a.charAt(i));
        }
        System.out.print(" Paise");
    }
}