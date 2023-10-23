import java.util.Scanner;

public class PemilihanPercobaan104Modifikasi {
    public static void main(String[] args) {
        
        //Scanner
        Scanner input04 = new Scanner(System.in);

        System.out.println("Masukkan Bilangan:  ");
        int bilangan = input04.nextInt();

        String result;
        result = (bilangan % 2 == 0) ? ("Bilangan " + bilangan + " Merupakan Bilangan Genap.") : ("Bilangan " + bilangan + " Merupakan Bilangan Ganjil.");

        System.out.println(result);
    }
}
