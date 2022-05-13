/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Vector;
/**
 *
 * @author ACER
 */
public class Bubble {
    static Vector<Integer> vectorBubble; 
    public static Vector<Integer> Sort(Vector<Integer> vectorBubble) { 
        int n = 0; 
         int ukuran = Data.getUkuranVector(); 
         while (n < ukuran) {              
            for (int i = 1; i < ukuran; i++) { 
                if (vectorBubble.get(i - 1) > 
                vectorBubble.get(i)) { 
                    int temp = vectorBubble.get(i); 
                    vectorBubble.set(i, vectorBubble.get(i - 1)); 
                    vectorBubble.set(i - 1, temp); 
                } 
            } 
            n++; 
        } 
 return vectorBubble; 
 } 
         }
    
