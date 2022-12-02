package com.itproger;

import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*System.out.print("Введите ваше имя: ");
        String username= scan.nextLine();
        System.out.println("Привет, " + username);
        //scan.nextLine();


        int num1 = scan.nextInt();
        byte num2 = scan.nextByte();
        boolean b = scan.nextBoolean();
        float num3 = scan.nextFloat();*/


        System.out.println("Введите 1е число: ");
        float num1 = scan.nextFloat();
        //float num1 = 50, num2 = 33;
        System.out.println("Введите 2е число: ");
        float num2 = scan.nextFloat();
        //float res = num1 % num2;

        //res += 10;
        //res++;
        float res1 = num1 + num2;
        float res2 = num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;

        System.out.println("Результат: ");
        System.out.println(res1 + "\n" +res2 + "\n" +res3 + "\n" + res4);
    }
}
