package Jobsheet_6;

public class Mahasiswa13 {

    String nama;
    int thnMasuk, umur;
    double ipk;

    Mahasiswa13(String n, int t, int u, double i){
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }
    void tampil(){
        System.out.println("Nama  : " + nama);
        System.out.println("Tahun masuk : " + thnMasuk);
        System.out.println("Umur : " + umur);
        System.out.println("Ipk : " + ipk);
    }
}
