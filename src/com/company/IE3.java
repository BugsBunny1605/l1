package com.company;

import java.util.Scanner;

//Необходимо написать программу, где бы пользователю предлагалось ввести число  202.
// Если пользователь ввёл число 202, программа должна вывести сообщение: "Вы ввели число 202".
// Если пользователь ввёл другое число, программа вообще ничего не должна делать.
public class IE3 {
    public static void main(String args[]){

        System.out.println ("Введите число 202:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i==202)
        {
            System.out.println("Вы ввели число 202");
        }
    }
}
