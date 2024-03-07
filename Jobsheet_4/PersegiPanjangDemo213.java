package Jobsheet_4;

import java.util.Scanner;

public class PersegiPanjangDemo213 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PersegiPanjang213[] arrayOfPersegiPanjang = new PersegiPanjang213[3];
        int panjang, lebar;

        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang : ");
            panjang = sc.nextInt();
            System.out.print("Masukkan lebar : ");
            lebar = sc.nextInt();

            arrayOfPersegiPanjang[i] = new PersegiPanjang213(panjang, lebar);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + (i+1) + ", panjang : " + arrayOfPersegiPanjang[i].panjang + ", lebar : " + arrayOfPersegiPanjang[i].lebar);
            System.out.println("luas persegi panjang ke-" + (i+1) + ", adalah " + arrayOfPersegiPanjang[i].hitungLuas());
            System.out.println("Keliling persegi panjang ke-" + (i+1) + ", adalah " + arrayOfPersegiPanjang[i].hitungKeliling());
            }
    }
}