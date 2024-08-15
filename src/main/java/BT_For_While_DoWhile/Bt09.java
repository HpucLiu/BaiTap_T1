/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT_For_While_DoWhile;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bt09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dem uoc so cua n");
        System.out.print("Nhap n (n>0): ");
        n= sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if(n%i==0)
                s++;
        }
        System.out.println("Uoc so cua n la "+s);
    }
    
}
