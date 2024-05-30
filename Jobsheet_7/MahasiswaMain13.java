package Jobsheet_7;

import java.util.Scanner;

public class MahasiswaMain13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        PencarianMhs13 data = new PencarianMhs13();
        int jumMhs = 5;

        System.out.println("==========================================");
        System.out.println("Masukkan data mahasiswa secara urut dari NIM terkecil");
        for(int i = 0; i < jumMhs; i++){
            System.out.println("==========================================");
            System.out.print("Nim\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = sl.nextLine();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();

            Mahasiswa13 m = new Mahasiswa13(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("==========================================");
        System.out.println("Data keseluruhan mahasiswa : ");
        data.tampil();

        System.out.println("------------------------------------------");
        System.out.println("__________________________________________");
        System.out.print("Pencarian Data : ");
        System.out.println("Masukkan Nim Mahasiswa yang dicari");
        System.out.print("NIM : ");
        int cari = s.nextInt();
        System.out.print("Menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("==========================================");
        System.out.println("Menggunakan binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumMhs-1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}
