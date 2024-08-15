/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT_Mang;

import java.util.Scanner;

public class BT_18 {

    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Cho biet so phan tu trong mang 1<=n<=50:");
        n = sc.nextInt();
        a = new int[n];
        nhapMang(a, sc);
        System.out.println("===Mang a=====");
        xuatMang(a);
        int snt=soNguyenTo(a);
        System.out.println("So nguyen to cua mang la: " + snt);
        int min = timMin(a);
        System.out.println("So nho nhat cua mang la: " + min);
    }
    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Cho biet gia tri a[" + i + "]:");
            a[i] = sc.nextInt();
        }
    }
    public static void xuatMang(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
    public static int soNguyenTo(int[] a) {
        int n=a[0];
        for(int i=2;i<a[i]/2;i++){
           if(n%i!=0)
                System.out.println(n);
    }
        return n;
    }
    public static int timMin(int[] a) {
        int min = a[0];
        for (int x : a) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }
}
