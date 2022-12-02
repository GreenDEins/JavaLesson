package com.itproger;

public class Lesson53 {

    public static void main(String[] args) {

        for (int i = 5; i < 25; i += 2) {
            if(i % 3 == 0) // % кратное числу 3 значит можно поделить на 3
                continue;

            if(i >= 17)
                break;

            System.out.println("Element: " + i);
        }
    }
}
