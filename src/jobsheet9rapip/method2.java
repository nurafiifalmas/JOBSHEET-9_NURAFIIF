/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9rapip;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class method2 {
      public static  double kecepatan ( double jarak, double waktu)
{
    return jarak / waktu ;
}
    public static void main(String[] args) {
        double hasil;
        Scanner scanner = new Scanner (System.in);
        System.out.print("Jarak tempuh :");
        double jarak = scanner.nextDouble();
        System.out.print("Waktu tempuh :");
        double waktu = scanner.nextDouble();
        
        hasil = kecepatan(jarak, waktu);
        System.out.println("kecepatan    :"+hasil+" Km/jam");
        
}
    
}
