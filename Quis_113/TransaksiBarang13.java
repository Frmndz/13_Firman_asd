package Quis_113;

import java.util.Scanner;

public class TransaksiBarang13 {
    
    public Barang13 [] barangs = new Barang13[100]; 
    public Barang13 [] pembelians = new Barang13[100];
    public int jumlahBarang;
    public int jumlahPembelian;

    public TransaksiBarang13(){
        barangs[jumlahBarang++] = new Barang13("K01", "Sabun", 1000, 5);
        barangs[jumlahBarang++] = new Barang13("K02", "Pasta Gigi", 2000, 10);
        barangs[jumlahBarang++] = new Barang13("K03", "Biore", 3000, 23);
        barangs[jumlahBarang++] = new Barang13("K04", "Shampoo", 4000, 55);
        barangs[jumlahBarang++] = new Barang13("K05", "Sikat Gigi", 5000, 65);
    }
    public void tampilkanBarang() {
        System.out.println("=========================");
        System.out.println("     Daftar Barang       ");
        System.out.println("=========================");
        System.out.printf("%-10s%-20s%-15s%-10s%n", "Kode", "Nama", "Harga", "Stok");
        for (int i = 0; i < jumlahBarang; i++) {
            Barang13 barang = barangs[i];
            System.out.printf("%-10s%-20s%-15.2f%-10d%n", barang.getKode(), barang.getNama(), barang.getHarga(), barang.getStok());
        }
    }
    public void tampilkanBarangPembelian() {
        System.out.println("=========================");
        System.out.println("     Daftar Pembelian    ");
        System.out.println("=========================");
        System.out.printf("%-10s%-20s%-15s%n", "Kode", "Nama", "Harga");
        for (int i = 0; i < jumlahPembelian; i++) {
            Barang13 barang = pembelians[i];
            System.out.printf("%-10s%-20s%-15.2f%n", barang.getKode(), barang.getNama(), barang.getHarga());
        }
    }
    public void melakukanPembelian() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kode barang: ");
        String kodeBarang = sc.nextLine();

        Barang13 barangDibeli = null;
        for (int i = 0; i < jumlahBarang; i++) {
            Barang13 barang = barangs[i];
            if (barang.getKode().equals(kodeBarang)) {
                barangDibeli = barang;
                break;
            }
        }

        if (barangDibeli != null && barangDibeli.getStok() > 0) {
            pembelians[jumlahPembelian++] = barangDibeli;
            barangDibeli.setStok(barangDibeli.getStok() - 1);
            System.out.println("Pembelian berhasil!");
            System.out.print("Apakah akan belanja kembali(Y/N)? ");
            String pilih = sc.nextLine();
            if (pilih.equals("y")) {
                melakukanPembelian();
            } else {
                System.out.println("Terima Kasih!");
            }
        } else {
            System.out.println("Barang tidak ditemukan atau stok habis.");
            melakukanPembelian();
        }
    }
}
