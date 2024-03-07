import java.util.Scanner;
public class InfoMahasiswaMain13 {
    public static void main(String[] args) {
        Scanner sc13 = new Scanner(System.in);
        double ipk;
        System.out.println("Masukkan jumlah Mahasiswa: ");
        int input = sc13.nextInt();
        double totalIpk = 0; 

        InfoMahasiswa13[] arrayInfoMahasiswa13 = new InfoMahasiswa13[input];

        for (int i = 0; i < arrayInfoMahasiswa13.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama: ");
            String nama = sc13.next();
            System.out.print("Masukkan NIM: ");
            int nim = sc13.nextInt();
            System.out.print("Masukkan jenis kelamin (l/p): ");
            String jk = sc13.next();
            System.out.print("Masukkan IPK: ");
            ipk = sc13.nextDouble();

            arrayInfoMahasiswa13[i] = new InfoMahasiswa13(nama, nim, jk, ipk);
            totalIpk += ipk;
        }
        int index = 0;
        for (InfoMahasiswa13 mahasiswa : arrayInfoMahasiswa13) {
            mahasiswa.cetak(index);
            index++;
        }
        if (input != 0) {
            double avgipk = totalIpk/input;
            System.out.println("Rata rata IPK : " + avgipk);
        } else {
            System.out.println("Tidak ada mahasiswa!");
        }
    }
}
