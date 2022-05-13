/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

/**
 *
 * @author ACER
 */
public class Data {
 private static int ukuranVector;
 private static Vector<Integer> vector;
 private static boolean ketemu;
 
    public static void main(String[] args) {
 
            System.out.print("Berapa ukuran vector yang Anda mau? ");
            ukuranVector = inputData();
            buatVector();
            bacaData();
            pengurutan();
            tulisData();
            System.out.println("Apakah Anda mau melakukan pencarian? ");
            System.out.print("Jika ya, masukkan data yang Anda cari, jika tidak ketik -99 : ");
            
            int cari = inputData();
            if (cari != -99)
                cariData(cari);
            else
                System.out.println("Anda tidak mencari apa-apa. Thanks.");
 }
    
 private static void cariData(int cari) {
    System.out.println("Metoda apa yang akan digunakan untuk pencarian? ");
    System.out.println("1. Array Search");
    System.out.println("2. Binary Search");
    System.out.print("3. Vector Search (Masukkan pilihan Anda) : ");
    int metoda = inputData();
    if (metoda == 3) {
        VectorSearch cnv = new VectorSearch();
        ketemu = cnv.Search(cari);
        if (ketemu) {
        System.out.println("Data yang Anda cari " + cari
        + " ada di index Vector " + cnv.getHasil());
    } else {
    System.out.println("Data yang Anda cari " + cari + " tidak ada di Vector. ");
    }
 }
}
 
    else if (metoda == 2) {
        Binary bnr = new Binary();
        ketemu = bnr.Search(cari);
        if (ketemu) {
        System.out.println("Data yang Anda cari " + cari
        + " ada di index Vector " + bnr.getHasil());
        } else {
        System.out.println("Data yang Anda cari " + cari
        + " tidak ada di Vector. ");
        }
     } else {
        ArraySearch ars = new ArraySearch();
        ketemu = ars.Search(cari);
        if (ketemu) {
        System.out.println("Data yang Anda cari " + cari
        + " ada di index Vector " + ars.getHasil());
        } else {
        System.out.println("Data yang Anda cari " + cari
        + " tidak ada di Vector. ");
        }
     }
 }
 private static void pengurutan() {
    int pilihan;
    System.out.println("Metoda pengurutan apa yang akan digunakan? ");
    System.out.println("1. BUBBLE SORT");
    System.out.println("2. SELECTION SORT");
    System.out.println("3. INSERTION SORT");
    System.out.println("4. SHELL SHORT");
    System.out.print("5. QUICK SORT (Masukkan nilai pilihan) : ");
    pilihan = inputData();
    if (pilihan == 1)
    vector.addAll(Bubble.Sort(vector));
    else if (pilihan == 2)
    vector.addAll(Selection.Sort(vector));
    else if (pilihan == 3)
    vector.addAll(Insertion.Sort(vector));
   else if (pilihan == 4)
    vector.addAll(Shell.shellSort(vector));
    else if (pilihan==5)
    vector.addAll(Quick.quickSort(vector));
 }
 // Metoda/fungsi untuk melakukan pembacaan.
 private static int inputData() {
 BufferedReader bfr = new BufferedReader(
 new InputStreamReader(System.in));
 String angkaInput = null;
 try {
 angkaInput = bfr.readLine();
 } catch (IOException e) {
 e.printStackTrace();
 }
 int Data = Integer.valueOf(angkaInput).intValue();
 return Data;
 }
 // Metoda/fungsi untuk membuat Vector.
 private static void buatVector() {
 vector = new Vector<Integer>(ukuranVector);
 }
 // Metoda/fungsi untuk membaca data dan
 // memasukkannya ke Vector.
 private static void bacaData() {
 int data;
 for (int i = 0; i < ukuranVector; i++) {
 System.out.print("Masukkan data ke-" + (i + 1) + " : ");
 data = inputData();
 vector.add(data);
 }
 }
 // Metoda/fungsi menulis isi vector.
 private static void tulisData() {
 System.out.println("\nData setelah diurutkan : ");
 for (int j = 0; j < ukuranVector; j++) {
 System.out.println("Data ke " + (j + 1) + " = " +
vector.get(j)); 
}
 }
 public static int getUkuranVector() {
 return ukuranVector;
 }
 public static Vector<Integer> getVector() {
 return vector;
 }
}
