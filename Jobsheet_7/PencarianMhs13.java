package Jobsheet_7;

public class PencarianMhs13 {
    Mahasiswa13 listMhs[] = new Mahasiswa13[5];
    int idx;
    
    void tambah(Mahasiswa13 m) {
        if(idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data anda sudah penuh !!");
        }
    }

    void tampil() {
        for(Mahasiswa13 m : listMhs){
            m.tampil();
            System.out.println("======================================");
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int  j = 0; j < listMhs.length; j++){
            if (listMhs[j].nim==cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left){
            mid = (left + right) / 2; //ini proses devide
            if (cari == listMhs[mid].nim) {
                return (mid); // ini proses conquer
            } else if (listMhs[mid].nim < cari){
                return FindBinarySearch(cari, left, mid -1);
            } else {
                return FindBinarySearch(cari, mid +1, right);
            }
        }
        return -1;
    }

    public void Tampilposisi(int x, int pos){
        if (pos!= -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + "tidak ditemukan.");
        }
    }

    public void TampilData(int x, int pos){
        if (pos!= -1){
            System.out.println("Nim\t : " + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : "  + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data " + x + "tidak ditemukan");
        }
    }
}
