package Jobsheet_4;

public class PersegiPanjang213 {

    public int panjang;
    public int lebar;

    public PersegiPanjang213(int p, int l) {
    panjang = p;
    lebar = l;
    }

    public int hitungLuas() {
        return panjang*lebar;
    }

    public int hitungKeliling() {
        return 2*(panjang + lebar);
    }
}