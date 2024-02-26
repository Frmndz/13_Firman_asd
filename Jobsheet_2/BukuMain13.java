package Jobsheet_2;

public class BukuMain13 {
    public static void main (String[] args) {
        Buku13 bk1 = new Buku13();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denada Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku13 bk2 = new Buku13("Self Reward", "Maheera Ayesha", 130, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku13 bukufirman = new Buku13("Hujan", "Tere Liye", 332, 50, 89000);
        bukufirman.tampilInformasi();

        int jumlahTerjual = 5;
        int hargaTotal = bukufirman.hitungHargaTotal(jumlahTerjual);
        int diskon = bukufirman.hitungDiskon(hargaTotal);
        int hargaBayar = bukufirman.hitungHargaBayar(hargaTotal, diskon);

        System.out.println("Jumlah terjual : " + jumlahTerjual);
        System.out.println("Harga total: Rp " + hargaTotal);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Harga bayar: Rp " + hargaBayar);
    }
}
