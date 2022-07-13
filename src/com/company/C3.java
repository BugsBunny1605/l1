package com.company;
//Написать программу, которая увеличивает вам зарплату каждый месяц на $1000,
//используя циклы while/ do ... while, for. (Все три реализации)
public class C3 {
    public static void main(String args[]){
        int salary1 = 0;
        int salary2 = 0;
        int salary3 = 0;
        int month = 0;

        while (month < 12) {
            month++;
            salary1=salary1+1000;
        }

        do{
            month--;
            salary2=salary2+1000;
        }
        while (month > 0);

        for (int i = 1; i <= 12; i++){
            salary3=salary3+1000;
        }

        System.out.println("salary1: "+ salary1);
        System.out.println("salary2: "+ salary2);
        System.out.println("salary3: "+ salary3);
    }
}
