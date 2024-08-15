/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BT_Mang;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class BT_19 {

    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        n = docSoPT(sc);
        System.out.print("Cho biet so phan tu trong mang 1<=n<=50:");
        n = sc.nextInt();
        a = new int[n];
        phatSinhMang(a);
        System.out.println("Mang duoc phat sinh: ");
        sapXepTangDan(a);
        System.out.println("===Mang a=====");
        xuatMang(a);
        int x;
        System.out.println("Nhap x: ");
        x = sc.nextInt();
        System.out.println("Cac phan tu la uoc so cua x: ");
        lietKePT(a, x);

    }
    public static void nhapMang(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("Cho biet gia tri a[" + i + "]:");
            a[i] = sc.nextInt();
        }
    }
    public static int docSoPT(Scanner sc) {
        int n = 0;
        do {
            System.out.print("Cho biet so phan tu mang (1<=n<=20)");
        } while (n <= 1 || n > 20);
        return n;
    }
    public static void xuatMang(int[] a) {
        System.out.print(Arrays.toString(a));
    }
    public static void phatSinhMang(int[] a) {
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(100);
        }
    }
    public static void sapXepTangDan(int[] a) {
        Arrays.sort(a);
    }
    public static void lietKePT(int[] a, int x) {
        for (int item : a) {
            if (x % item == 0) {
                System.out.print(item + ", ");
            }
        }
    }
}
