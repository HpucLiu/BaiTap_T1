/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT_IF_ELSE;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BT04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tim xem so chan hay le ");
        System.out.print("Nhap a: ");
        a = sc.nextDouble();
        if(a%2==0)
            System.out.println("Day la so chan");
        else
            System.out.println("Day la so le");
        
    }
    
}
