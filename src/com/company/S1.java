package com.company;

import java.util.Scanner;

//Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:
// 7, 3 или 2, а программа должна сказать, какое число ввёл пользователь: 7, 3, или 2.
public class S1 {
    public static void main(String args[]){
        System.out.println ("Введите число 7, 3 или 2:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 7: System.out.println ("Вы ввели 7");
                break;
            case 3: System.out.println ("Вы ввели 3");
                break;
            case 2: System.out.println ("Вы ввели 2");
                break;
            default:
                System.out.println ("Вы ввели не 7, не 3 и не 2");
                break;
        }
    }
}
