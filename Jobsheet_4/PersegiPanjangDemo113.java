package Jobsheet_4;

import java.util.Scanner;

public class PersegiPanjangDemo113 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PersegiPanjang113[] arrayOfPersegiPanjang = new PersegiPanjang113[3];
        int panjang, lebar;

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang : ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar : ");
            lebar = sc.nextInt();

            arrayOfPersegiPanjang[i] = new PersegiPanjang113(panjang, lebar);
        }
        for (int i = 0; i < 3; i++) {
            arrayOfPersegiPanjang[i].cetakInfo(i);
            }
    }
}