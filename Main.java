import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input panjang sisi persegi dari pengguna
        System.out.print("Masukkan panjang sisi persegi: ");
        double sisi = input.nextDouble();

        // Hitung luas persegi
        double luas = sisi * sisi;

        // Tampilkan hasil
        System.out.println("Luas dari persegi adalah: " + luas);
    }
}
