/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author Arsa Aryana
 */
import java.util.Scanner;

class Catatan {
    private String[] data;
    private int size;
    private Scanner scanner;

    public Catatan() {
        data = new String[100]; // Kapasitas awal array
        size = 0; // Jumlah data yang ada
        scanner = new Scanner(System.in);
    }

    public void tambahCatatan() {
        System.out.print("Masukkan catatan: ");
        String catatan = scanner.nextLine();
        data[size] = catatan;
        size++;
        System.out.println("Catatan berhasil ditambahkan.");
    }

    public void tampilkanCatatan() {
        System.out.println("Catatan Anda:");
        for (int i = 0; i < size; i++) {
            System.out.println((i+1) + ". " + data[i]);
        }
    }

    public void ubahCatatan() {
        System.out.print("Masukkan nomor catatan yang ingin diubah: ");
        int nomor = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer
        if (nomor > 0 && nomor <= size) {
            System.out.print("Masukkan catatan baru: ");
            String catatanBaru = scanner.nextLine();
            data[nomor - 1] = catatanBaru;
            System.out.println("Catatan berhasil diubah.");
        } else {
            System.out.println("Nomor catatan tidak valid.");
        }
    }

    public void hapusCatatan() {
        System.out.print("Masukkan nomor catatan yang ingin dihapus: ");
        int nomor = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer
        if (nomor > 0 && nomor <= size) {
            for (int i = nomor - 1; i < size - 1; i++) {
                data[i] = data[i + 1];
            }
            size--;
            System.out.println("Catatan berhasil dihapus.");
        } else {
            System.out.println("Nomor catatan tidak valid.");
        }
    }
}
