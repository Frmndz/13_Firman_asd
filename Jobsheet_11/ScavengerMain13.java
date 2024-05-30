import java.util.Scanner;

public class ScavengerMain13 {
    public static void main(String[] args) {
        ScavengerHunt13 game = new ScavengerHunt13();
        game.addPoint("Apa ibukota Indonesia?", "Jakarta");
        game.addPoint("2 + 2 berapa?", "4");
        game.addPoint("Berapa Umur Firman?", "19");
        game.addPoint("Kepanjangan dari ML adalah?", "Mobile Legends");

        game.displayPoints();

        Scanner sc13 = new Scanner(System.in);
        while (game.head != null) {
            System.out.print("Jawab: ");
            String answer = sc13.nextLine();
            if (game.checkAnswer(answer)) {
                System.out.println("Jawaban benar! Lanjut ke point berikutnya.");
            } else {
                System.out.println("Jawaban salah. Coba lagi.");
            }
        }
        System.out.println("Selamat! Anda telah menyelesaikan game.");
        sc13.close();
        System.exit(0);
    }
}
