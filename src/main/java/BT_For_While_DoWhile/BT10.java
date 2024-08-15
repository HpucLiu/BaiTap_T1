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
public class BT10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,kq;
        boolean s=true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiem tra so nguyen to");
        System.out.print("Nhap n (n>0): ");
        n= sc.nextInt();
       for(int i=2;i<=n/2;i++)
        {
            kq=n%i;
            if(kq==0)
            {
                s=false;
                break;
            }
        }
        if(s)
            System.out.println(n + " la so nguyen to");
        else
            System.out.println(n + " khong phai so nguyen to");
    
    }
    
}
