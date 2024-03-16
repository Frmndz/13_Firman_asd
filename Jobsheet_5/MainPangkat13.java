package Jobsheet_5;

import java.util.Scanner;

public class MainPangkat13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Pangkat13 [] png = new Pangkat13[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang akan dipangkatkan ke- " + (i+1) + " : ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan nila pemangkat ke- " + (i+1) + " : ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat13(nilai,pangkat);
        }

        System.out.println("==========================================");
        System.out.println("Pilih metode yang ingin dijalankan : ");
        System.out.println("""
                1. Brute Force
                2. devide and Conquer
                """);
        System.out.print("Masukkan pilihan : ");
        int pilih = sc.nextInt();

        switch (pilih) {
            case 1:
            System.out.println("==========================================");
            System.out.println("Hasil pangkat dengan Brute Force");
            for (int i = 0; i < elemen; i++) {
                System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai,png[i].pangkat));
                }
                System.out.println("==========================================");
                break;  

            case 2:
            System.out.println("Hasil pangkat dengan Brute Force");
            for (int i = 0; i < elemen; i++) {
                System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatDC(png[i].nilai,png[i].pangkat));
                }
                System.out.println  ("==========================================");
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }
}
