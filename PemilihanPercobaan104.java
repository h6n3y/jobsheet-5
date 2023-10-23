import java.util.Scanner;

public class PemilihanPercobaan104 {
    public static void main(String[] args) {
        
        //Scanner
        Scanner input04 = new Scanner(System.in);

        System.out.println("Masukkan Bilangan:  ");
        int bilangan = input04.nextInt();

        if (bilangan % 2 == 0)
        System.out.println("Bilangan " + bilangan + " Merupakan Bilangan Genap.");

        else
        System.out.println("Bilangan " + bilangan + " Merupakan Bilangan Ganjil.");

    }
}