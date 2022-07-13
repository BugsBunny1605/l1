package com.company;

import java.util.Scanner;

//Необходимо написать программу, где бы пользователю предлагалось ввести число  303.
// Если пользователь ввёл число 303, программа должна вывести сообщение: "Вы ввели число 303".
// Если пользователь ввёл другое число, программа вообще ничего не должна делать.
public class S3 {
    public static void main(String args[]){
        System.out.println ("Введите число 303:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 303: System.out.println ("Вы ввели число 303");
                break;
        }
    }
}
