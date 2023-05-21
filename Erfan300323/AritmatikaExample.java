/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Erfan300323;

/**
 *
 * @author Erfan
 */
public class AritmatikaExample {
    public static void main(String[] args) {
        Aritmatika aritmatika = new Aritmatika();
        int c = aritmatika.tambah(10, 5);
        System.out.println("C " + c);
        System.out.println("ganjil " + aritmatika.cekganjil(c));
        for (int number : aritmatika.getganjil(c)) {
            System.out.print(number + " ");
        }

    }
}
