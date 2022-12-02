package com.itproger;

import java.util.Scanner;

public class A {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите количество дней: ");
            int days = scanner.nextInt();

            int hour, minutes, second;
            hour = 24;
            minutes = 60;
            second = 60;
            int res = days * hour * minutes * second;


            System.out.println("Результат: ");
            System.out.println(res);
        }
    }

