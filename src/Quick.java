/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Vector; 
/**
 *
 * @author ACER
 */
public class Quick {
    private static void swap(Vector<Integer> vectorQuick, int left, int right) {
            int temp = vectorQuick.get(left);
            vectorQuick.set(left, vectorQuick.get(right)); 
            vectorQuick.set(right, temp); 
    }
    
    public static Vector<Integer> quickSort(Vector<Integer> vectorQuick) {
        int ukuran = Data.getUkuranVector() - 1; 
        quickSortRecursive(vectorQuick, 0, ukuran); 
        return vectorQuick; 
    }
    
     private static void quickSortRecursive(Vector<Integer> vectorQuick, int left, int right) {
        int pivot; 
        if (left >= right) 
        return; 
        pivot = partition(vectorQuick, left, right); 
        quickSortRecursive(vectorQuick, left, pivot - 1);
        quickSortRecursive(vectorQuick, pivot + 1, right); 
    } 
     
     public static int partition(Vector<Integer> vectorQuick, int left, int right) {
        while (true) { 
            while ((left < right) 
            && (vectorQuick.get(left) < 
            vectorQuick.get(right))) 
            right--; 
            if (left < right) 
            swap(vectorQuick, left, right); 
            else 
            return left; 
            while ((left < right) 
            && (vectorQuick.get(left) < 
            vectorQuick.get(right))) 
            left++; 
            if (left < right) 
            swap(vectorQuick, left, right--); 
            else 
            return right; 
        }
    } 
}
