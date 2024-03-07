package Jobsheet_4;

public class PersegiPanjang113 {

    public int panjang;
    public int lebar;

    public PersegiPanjang113(int p, int l) {
    panjang = p;
    lebar = l;
    }
    
    public void cetakInfo(int i) {
      System.out.println("|----------------------------------------------------|");
      System.out.println("|Persegi panjang ke- " + (i+1) + ", panjang : " + panjang + ", lebar : " + lebar);
      System.out.println("|----------------------------------------------------|");
    }
}