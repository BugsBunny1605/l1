package com.company;

import java.util.Scanner;

//Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 5, 4 или 1,
// а программа должна сказать, какое число ввёл пользователь: 5, 4, или 1.
public class IE1 {
    public static void main(String args[]){
        System.out.println ("Введите цифру 1, 4 или 5:");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i==5)
        {
            System.out.println("Вы ввели "+i);
        }
        else if(i==4)
        {
            System.out.println("Вы ввели "+i);
        }
        else if(i==1)
        {
            System.out.println("Вы ввели "+i);
        }
        else
        {
            System.out.println("Вы не ввели 1, 4 или 5. Это плохо");
        }
    }
}
