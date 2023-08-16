package com.bcafinance.praktikum;
/*
IntelliJ IDEA 2023.2 (Community Edition)
Build #IC-232.8660.185, built on July 26, 2023
@Author EmiratZ a.k.a. M Emirat Millenium Try
Java Developer
Created on 16/08/2023 11.09
@Last Modified 16/08/2023 11.09
Version 1.0
*/

import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        String strX;
        System.out.print("Masukkan Kata : ");
        Scanner scanner = new Scanner(System.in);
        strX = scanner.nextLine();
        int hasil = 0;

        for (int i=0; i<strX.length(); i++)
        {
            int ascii = strX.charAt(i);
            if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)){
                hasil = hasil + ascii;
            }
        }

        System.out.println("Hasil : "+hasil);
    }
}