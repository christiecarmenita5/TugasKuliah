import java.util.Scanner;

public class Hitung {

    public static void main(String[] args) {
        // Deklarasi variabel
        String nama;
        String nim;
        float nilaiTubes;
        float nilaiQuiz;
        float nilaiTugas;
        float nilaiUTS;
        float nilaiUAS;
        float totalNilai;

        // Input data
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Matakuliah Pemrograman Berorientasi Objek");
        System.out.println("----------------------------------------");

        System.out.print("Masukkan nama mahasiswa: ");
        nama = input.nextLine();

        System.out.print("Masukkan NIM mahasiswa: ");
        nim = input.nextLine();

        System.out.print("Masukkan nilai tubes: ");
        nilaiTubes = input.nextFloat();

        System.out.print("Masukkan nilai quiz: ");
        nilaiQuiz = input.nextFloat();

        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = input.nextFloat();

        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = input.nextFloat();

        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = input.nextFloat();

        // Hitung total nilai
        totalNilai = (float) ((0.3 * nilaiTubes) + (0.1 * nilaiQuiz) + (0.1 * nilaiTugas) + (0.25 * nilaiUTS) + (0.25 * nilaiUAS));

        // Konversi nilai total ke huruf
        String huruf;
        if (totalNilai >= 80) {
            huruf = "A";
        } else if (totalNilai >= 70) {
            huruf = "B";
        } else if (totalNilai >= 60) {
            huruf = "C";
        } else if (totalNilai >= 50) {
            huruf = "D";
        } else {
            huruf = "E";
        }

        // Output
        System.out.println("----------------------------------------");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai Matakuliah Pemrograman Berorientasi Objek: " + totalNilai + " (" + huruf + ")");
    }
}