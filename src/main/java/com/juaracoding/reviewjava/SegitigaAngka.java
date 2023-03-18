package com.juaracoding.reviewjava;

public class SegitigaAngka {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            if (i % 2== 0)
                System.out.print("_");
            if (i % 2 != 0)
                System.out.print(i+"");} // baris 1
        System.out.println();
        for (int i = 2; i <= 8; i++) {
            if (i % 2== 0)
                System.out.print("_");
            if (i % 2 != 0)
                System.out.print(i+"");} // baris 2
        System.out.println();
        for (int i = 3; i <= 7; i++) {
            if (i % 2== 0)
                System.out.print("_");
            if (i % 2 != 0)
                System.out.print(i+"");} // baris 3
        System.out.println();
        for (int i = 4; i <= 6; i++) {
            if (i % 2== 0)
                System.out.print("_");
            if (i % 2 != 0)
                System.out.print(i+"");}//baris 4
        System.out.println();
        for (int i = 5; i <= 6; i++) {
            if (i % 2 != 0)
                System.out.print(i+"");}//baris 5
    }
}
