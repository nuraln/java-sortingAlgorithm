/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Vector; 
/**
 *
 * @author ACER
 */
public class Insertion {
    public static Vector<Integer> Sort(Vector<Integer> vectorInsertion) { 
        int i=1; 
        int index; 
        int ukuran = Data.getUkuranVector(); 
            while (i<ukuran){ 
            int temp=vectorInsertion.get(i); 
            for(index=i; index>0; index--){
                if (temp < vectorInsertion.get(index-1)){ 
                    vectorInsertion.set(index, 
                    vectorInsertion.get(index-1)); 
                }
                else break;
            }
            vectorInsertion.set(index, temp); i++;
            }
    return vectorInsertion;     
    }
}
