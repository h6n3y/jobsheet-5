import java.util.Scanner;

public class PemilihanPercobaan204 {
    public static void main(String[] args) {
        
        // Scanner
        Scanner input04 = new Scanner(System.in);

        // Tipe Data
        float tugas, kuis, uts, uas, total;
        String message;

        System.out.print("Nilai Tugas   : ");
        tugas = input04.nextFloat();

        System.out.print("NIlai Kuis    : ");
        kuis = input04.nextFloat();

        System.out.print("Nilai UTS     : ");
        uts = input04.nextFloat();

        System.out.print("Nilai UAS     : ");
        uas = input04.nextFloat();

        // Hitung Total Hasil
        total = (tugas * 0.2F) + (kuis * 0.1F) + (uts * 0.3F) + (uas * 0.4F);

        // Pesan Akhir
        message = total < 65 ? "Remidi" : "Tidak Remidi";
        System.out.println("Nilai Akhir = " + total + " sehingga " + message);
    }
}
