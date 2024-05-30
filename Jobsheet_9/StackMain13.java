package Jobsheet_9;
import java.util.Scanner;

public class StackMain13 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack13 stk = new Stack13(5);
    char pilih;

    do{
        System.out.print("Jenis : ");
        String jenis = sc.nextLine();
        System.out.print("Warna : ");
        String warna = sc.nextLine();
        System.out.print("Merk : ");
        String merk = sc.nextLine();
        System.out.print("Ukuran : ");
        String ukuran = sc.nextLine();
        System.out.print("Harga: ");
        double harga = sc.nextDouble();

        Pakaian13 p = new Pakaian13(jenis, warna, merk, ukuran, harga);
        System.out.println("Apakah anda akan menambahkan data baru ke stack (y/n) ? ");
        pilih = sc.next().charAt(0);
        sc.nextLine();
        stk.push(p);
        } while (pilih == 'y');
        stk.print();
        stk.pop();
        stk.peek();
        stk.print();
    }
}
