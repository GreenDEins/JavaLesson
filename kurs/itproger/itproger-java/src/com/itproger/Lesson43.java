package com.itproger;

import java.util.Scanner;

public class Lesson43 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 число: ");
        int num1 = scanner.nextInt();

        System.out.println("Введите 2 число: ");
        int num2= scanner.nextInt();

        int res;

        System.out.println("Действие: ");
        String action = scanner.nextLine();
        action = scanner.nextLine(); // из за скрытого числа делаем action

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("Рузультат: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Рузультат: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Рузультат: " + res);
                break;
            case "/":
                if ( num2 == 0)
                    System.out.println("error");
                else {
                    res = num1 / num2;
                    System.out.println("Рузультат: " + res);
                }
                break;
            default:
                System.out.println("Вводить надо цифры)");

        }
    }


}
