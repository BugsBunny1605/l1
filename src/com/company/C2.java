package com.company;
//Объявить строку с вашим полным именем и вывести на экран результат работы всех стандартных методов работы со строками.
public class C2 {
    public static void main(String args[]){

        String fio = new String("Сашкин Сашка Сашкович");
        char[] temp = new char[7];

        System.out.println("length: "+ fio.length());
        System.out.println("isEmpty: "+ fio.isEmpty());
        System.out.println("charAt: "+ fio.charAt(0));
        fio.getChars(0,7,temp,0);
        System.out.println("getChars: "+ temp);
        System.out.println("equals: "+ fio.equals(temp));
        System.out.println("equalsIgnoreCase: "+ fio.equalsIgnoreCase(fio));
        System.out.println("startsWith: "+ fio.startsWith(fio));
        System.out.println("endsWith: "+ fio.endsWith(fio));
        System.out.println("concat: "+ fio.concat(fio));
        System.out.println("replace: "+ fio.replace(temp[0],temp[2]));
        System.out.println("contains: "+ fio.contains("Сашка"));
    }
}
