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
public class BT11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int n,kq=0,a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiem tra so doi xung");
        System.out.print("Nhap n (n>0): ");
        n= sc.nextInt();
        a=n;
        while(n!=0){
            kq=kq*10+n%10;
            n/=10;
        }
        if(kq==a){
            System.out.println(a+"khong phai so doi xung");
        }
        else
            System.out.println(a+"la so doi xung");
    }
    
}
