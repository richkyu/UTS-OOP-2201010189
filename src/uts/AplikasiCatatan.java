package uts;

import java.util.Scanner;

public class AplikasiCatatan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Catatan catatan = new Catatan();

        int pilihan = 0;
        do {
            System.out.println("\nMenu Aplikasi Catatan:");
            System.out.println("1. Tambah Catatan");
            System.out.println("2. Tampilkan Catatan");
            System.out.println("3. Ubah Catatan");
            System.out.println("4. Hapus Catatan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    catatan.tambahCatatan();
                    break;
                case 2:
                    catatan.tampilkanCatatan();
                    break;
                case 3:
                    catatan.ubahCatatan();
                    break;
                case 4:
                    catatan.hapusCatatan();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
        
        scanner.close();
    }
}
