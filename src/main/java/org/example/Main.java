package org.example;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int skor = 0;
        String[] Animals = {"Ayam","Babi","Cicak","Domba","Elang","Flamingo","Gajah","Hiu","Iguana","Jerapah"};

        String isStop = "n";
        while (isStop == "n") {
            Random random = new Random();
            int index = random.nextInt(Animals.length);
            String tebakHewan = Animals[index];

            System.out.printf("\n---Game Tebak Kata---\n");

            Scanner guess = new Scanner(System.in);
            System.out.println("Tebak Hewan: ");

            String tebakan = guess.nextLine();
            System.out.println("Anda menebak: " + tebakan);
            System.out.printf("Hewan yang harus ditebak: " + tebakHewan);

            boolean isCorrect = tebakan.equalsIgnoreCase(tebakHewan);

            if (isCorrect) {
                System.out.printf("\nTebakannya benar");
                skor = skor + 1;
                System.out.printf("\nSkor anda: " + skor);
            } else {
                System.out.printf("\nTebakannya salah");
                System.out.printf("\nSkor anda: " + skor);
            }

            Scanner conti = new Scanner(System.in);
            System.out.printf("\nAnda masih mau main (y/n): ");

            String lanjut = conti.nextLine();
            if (lanjut.equalsIgnoreCase(isStop)) {
                isStop = "y";
            }
        }

        System.out.println("\nGame Telah Berakhir");
        System.out.println("Total skor kamu adalah: " + skor);
    }
}