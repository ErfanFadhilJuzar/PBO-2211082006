/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Erfan160323;

/**
 *
 * @author Erfan
 */
public class Hari {
    public static void main(String[] args){
        
        String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday","Thursday","Friday", "Saturday"};
        
        System.out.println("===For Loop===");
        for(int i = 0; i < days.length; i++){
            System.out.println(days[i]);
        }
        
        System.out.println("\n===Do While Loop===");
        int k = 0;
        do{
            System.out.println(days[k]);
            k++;
        }while (k<days.length);
        
        System.out.println("\n===While Loop===");
        int j = 0;
        while(j<days.length){
            System.out.println(days[j]);
            j++;
        }
    }
}
