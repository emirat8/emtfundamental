package com.bcafinance.ujian;
/*
IntelliJ IDEA 2023.2 (Community Edition)
Build #IC-232.8660.185, built on July 26, 2023
@Author EmiratZ a.k.a. M Emirat Millenium Try
Java Developer
Created on 21/08/2023 13.11
@Last Modified 21/08/2023 13.11
Version 1.0
*/

import java.util.Random;
import java.util.Scanner;

public class UjianJF12 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jumlah data format email yang ingin di-generate : ");
        int jumlahData = scanner.nextInt();

        String[] provider = { "gmail", "rocketmail", "yahoo" };
        String[] domain = { "com", "co.id" };

        for (int j = 0 ; j < jumlahData ; j++) {
            int panjangAlfanumerik = rand.nextInt(10, 16);
            int panjangAngka = rand.nextInt(2, 5);
            int panjangHuruf = panjangAlfanumerik - panjangAngka;

            StringBuilder email = new StringBuilder();
            StringBuilder numerik = new StringBuilder();
            StringBuilder alfanumerik1 = new StringBuilder();
            StringBuilder alfanumerik2 = new StringBuilder();

            for (int i = 0; i < panjangAngka; i++) {
                int temp = rand.nextInt(0, 10);
                numerik.append(temp);
            }

            for (int i = 0; i < panjangHuruf; i++) {
                int temp = rand.nextInt(97, 123);
                if (i < panjangHuruf / 2) {
                    alfanumerik1.append((char) temp);
                } else {
                    alfanumerik2.append((char) temp);
                }
            }

            int pola = rand.nextInt(0, 3);
            if (pola == 0) { //Angka di depan
                email.append(numerik).append(alfanumerik1).append(alfanumerik2);
            } else if (pola == 1) { // Angka di tengah
                email.append(alfanumerik1).append(numerik).append(alfanumerik2);
            } else if (pola == 2) { // Angka di belakang
                email.append(alfanumerik1).append(alfanumerik2).append(numerik);
            }

            email.append("@");
            email.append(provider[rand.nextInt(0, provider.length)]);
            email.append(".");
            email.append(domain[rand.nextInt(0, domain.length)]);
            System.out.println(email);
        }
    }
}