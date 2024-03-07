package Quis_113;

import  java.util.Scanner;

public class MainBarang13 {
    public static void main(String []args){
        TransaksiBarang13 transaksiBarang = new TransaksiBarang13();
        Scanner sc = new Scanner(System.in);
        int pilih;

        do{
            System.out.println("============================");
            System.out.println("   TOKO MAJU MUNDUR CANTIK  ");
            System.out.println("============================");
            System.out.println("1. Tampilkan Barang ");
            System.out.println("2. Beli ");
            System.out.println("3. Tampilkan Pembelian ");
            System.out.println("4. Keluar ");
            System.out.print("Pilih 1-4 : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch(pilih){
                case 1 :
                transaksiBarang.tampilkanBarang();
                break;
                case 2 :
                transaksiBarang.melakukanPembelian();
                break;
                case 3 :
                transaksiBarang.tampilkanBarangPembelian();
                break;
                case 4 :
                System.out.println("Terima kasih telah berbelanja!");
                System.exit(0);
                default :
                System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);
    }
}
