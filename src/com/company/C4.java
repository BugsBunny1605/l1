package com.company;
//Написать программу, которая вам уменьшает зп с $10000 до $0 каждый месяц используя циклы while/ do ... while, for. (Все три реализации).
public class C4 {
    public static void main(String args[]){
        int salary1 = 10000;
        int salary2 = 10000;
        int salary3 = 10000;
        int month = 0;

        while (month < 10) {
            month++;
            salary1=salary1-1000;
        }

        do{
            month--;
            salary2=salary2-1000;
        }
        while (month > 0);

        for (int i = 1; i <= 10; i++){
            salary3=salary3-1000;
        }

        System.out.println("salary1: "+ salary1);
        System.out.println("salary2: "+ salary2);
        System.out.println("salary3: "+ salary3);
    }
}
