/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Erfan160323;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Erfan
 */
public class NomorTerbesar_BufferedReader {
    public static void main( String[] args ){ 
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[11];
        int terbesar = 0;
        for(int i=1;i+1<=a.length;i++){
            try {
                System.out.print("nomor "+i+" : ");
                a[i] = Integer.parseInt(dataIn.readLine());
                if(terbesar>a[i]){
                      terbesar=terbesar;
                }
                else{
                    terbesar = a[i];
                }
            }
            catch (IOException e) {
                System.out.println("Error!");
            }
        }
        System.out.println("Nomor terbesar adalah "+terbesar);
    }
}
