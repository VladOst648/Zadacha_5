package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n;
        Scanner str = new Scanner(System.in);
        n = str.nextInt();
        System.out.print(summa(n));
        System.out.println();
    }
    public  static  int summa(int n)
    {
        int S = 0;
        int m = n % 10;
        S += m;
        int o = n/10;
        o = o%10;
        S += o;
        S += n/100;
        return S;
    }
}
