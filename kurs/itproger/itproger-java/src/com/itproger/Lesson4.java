package com.itproger;

public class Lesson4 {

    public static void main(String[] args) {
        // Условные конструкции if-else
        int a = 15, b = 20;
        char sym1 = 'A', sym2 = 'D';
        boolean isHasCar = true; //if( sym1== sym2)   // != не равно == ровно

        /*if (isHasCar) {
            System.out.println("Yes, correct");
        } else if (a >= b) {
            System.out.println("Second test");

        } else {
            System.out.println("No, not correct");
        }*/

        if(isHasCar || a==b)  { //&& нужно что бы оба условия были верны, две палочки одно из
            System.out.println("Yes, correct");
        } else if (a >= b) {
            System.out.println("Second test");

        } else {
            System.out.println("No, not correct");

        }
    }

}
