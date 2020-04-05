package com.rk.exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3};
        int index;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Nilai Array Ke : ");
        index = userInput.nextInt();

        /* Exception Handling (try, catch dan finally) */
        System.out.println("Handling OUtOfBound");
        try {
            System.out.printf("Index ke %d adalah %d\n", index, array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        /* Runtime Error Jika File Tidak Ada */
        System.out.println("Handling IO Not Found");
        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream("Input.txt");
        } catch (IOException e) {
            System.err.println(e);
        }

        /* Menggabungkan dua Exception */
        System.out.println("Menggabungkan Dua Buah Exception");
        try {
            System.out.printf("Index ke %d adalah %d\n", index, array[index]);
            fileInput = new FileInputStream("Input.txt");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Index Yang Anda Masukkan Tidak Sesuai Dengan Jumlah Array");
        } catch (IOException e){
            System.err.println("File Tidak Ditemukan");
        }

        System.out.println("Menambahkan Finally");
        try {
            System.out.printf("Index ke %d adalah %d\n", index, array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Index Yang Anda Masukkan Tidak Sesuai Dengan Jumlah Array");
        } finally {
            System.out.println("Finally");
        }


        System.out.println("\nAkhir dari Program.");

    }
}
