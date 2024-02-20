import java.util.Scanner;

public class umur {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan Tahun Lahir anda : ");
        int tahunlahir = scanner.nextInt();

        System.out.println("Masukan tahun saat ini : ");
        int tahunIni = scanner.nextInt();

        int umur = tahunIni - tahunlahir ;
        System.out.println("Umur anda saat ini : " + umur);

        scanner.close();
    }
}