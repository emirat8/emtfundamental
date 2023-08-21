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

public class UjianJF11 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] awalan = { "08", "628" };
        String[] provider = { "23", "21", "52", "97", "57", "12" };

        System.out.print("Jumlah data nomor handphone yang ingin di generate : ");
        int jumlahData = scanner.nextInt();

        for (int i = 0; i < jumlahData; i++) {
            int awalanTerpilih = rand.nextInt(0, awalan.length);
            int providerTerpilih = rand.nextInt(0, provider.length);
            int acak = rand.nextInt(100, 1000);
            int akhiran = rand.nextInt(100, 10000000);

            String hasil = awalan[awalanTerpilih] + provider[providerTerpilih] + "-" + acak + "-" + akhiran;
            System.out.println(hasil);
        }
    }
}