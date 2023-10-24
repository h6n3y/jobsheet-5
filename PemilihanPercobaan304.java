import java.util.Scanner;

public class PemilihanPercobaan304 {
    public static void main(String[] args) {
        
        // Scanner
        Scanner input04 = new Scanner(System.in);

        // Tipe Data
        double angka1, angka2, hasil;
        char operator;

        System.out.print("Masukkan Angka Pertama : ");
        angka1 = input04.nextDouble();

        System.out.print("Masukkan Angka Kedua : ");
        angka2 = input04.nextDouble();

        System.out.print("Masukkan Operator (+ , - , * , /) : ");
        operator = input04.next().charAt(0);

        // Switch Case
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                    System.out.println(angka1 + " + " + angka2 + " = " + hasil);

                    break;

            case '-':
                hasil = angka1 - angka2;
                    System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                    
                    break;

            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                
                    break;

            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + " = " + hasil);

                    break;
            
            default:

                    break;
        }
    }
}
