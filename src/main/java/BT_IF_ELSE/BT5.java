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
public class BT5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sokm, sotien = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Tinh tien di taxi ");
        System.out.print("Nhap so km: ");
        sokm = sc.nextDouble();
        if(sokm==1)
            sotien=15000;
        else if(sokm<=5)
            sotien=1*15000+(sokm-1)*13500;
        else if(sokm>=6)
            sotien=1*15000+(sokm-1)*13500+(sokm-5)*11000;
        else if(sokm>=120)
            sotien=(1*15000+(sokm-1)*13500+(sokm-5)*11000)*0.1;
        
        System.out.println("So tien khach phai tra la " +sotien);
    }
    
}
