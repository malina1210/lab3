package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите предложение:");
        String s = in.nextLine();

        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            double[] string = new double[0];
            if (string[i]>='A' && string[i]<='Z') count++;
        }
        System.out.println("В этом предложении общее КОЛИЧЕСТВО строчних латинских  букв =  " + count );
    }

    public static void task3 (String[] args) {
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        String[] a = path.split("\\\\");
        System.out.print(a.length==2 ? "\\": a[a.length-2]);
    }

    public static void task2 (String[] args) {
        Scanner sc = new Scanner (System.in);

        String s = sc.nextLine();
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        s = s.replaceAll(s1, s2);
        System.out.println(s);
    }
}


