package Quis_113;

public class Barang13 {

    public String kode, nama;
    public double harga;
    public int stok;

    public Barang13(String kode, String nama, int stok, int harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}