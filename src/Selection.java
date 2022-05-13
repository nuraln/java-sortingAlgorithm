/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Vector;
/**
 *
 * @author ACER
 */
public class Selection {
    public static Vector<Integer> Sort(Vector<Integer> vectorSelection) {
        int i; 
        int ukuran = Data.getUkuranVector(); 
        int max; 
        while (ukuran > 0){
            max = 0; 
            for(i=1; i<ukuran; i++){
                if (vectorSelection.get(max) < vectorSelection.get(i)){
                    max = i; 
                }
            }
        int temp = vectorSelection.get(max); 
        vectorSelection.set(max, vectorSelection.get(ukuran-1));
        vectorSelection.set(ukuran-1, temp); ukuran--; 
        }
        
        return vectorSelection;
    }
}
