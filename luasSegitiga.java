import java.util.Scanner;

public class luasSegitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan panjang alas segitiga:");
        double alas = scanner.nextDouble();

        System.out.println("Masukkan tinggi segitiga:");
        double tinggi = scanner.nextDouble();

        double luas = (alas * tinggi) /2 ;
        System.out.println("Luas segitiga adalah: " + luas);

        scanner.close();
    }
}