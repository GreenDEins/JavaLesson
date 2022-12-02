package com.itproger;

import java.util.Scanner;
public class Lesson41 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите роль: ");
        String role = scanner.nextLine();
        System.out.println("Введиье пароль: ");
        String pass = scanner.nextLine();
        if(role.equals("Admin") && pass.equals("123456")) {
            System.out.println("Все пользователи");
        } else {
            System.out.println("Привет как вас зовут?");
            String name = scanner.nextLine();
        }
    }
}
