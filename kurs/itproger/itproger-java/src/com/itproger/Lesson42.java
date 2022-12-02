package com.itproger;

import java.util.Scanner;

public class Lesson42 {

    public static void main(String[] args) {
        //условные конструкции switch-case
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 3:
                System.out.println("Number is 3");
                break;
            default:
                System.out.println("Default");
        }
    }

}




