package com.Java.LineComparision;

import java.util.Scanner;

public class LineComparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double l1;
        Double l2;
        System.out.println("Enter first line co-ordinates ,first points(x1,y1): ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter first line co-ordinates,second points(x2,y2): ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        l1 = (Double) Math.sqrt((x1 - x2) * (x1 - x2) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of len1: " + l1);
    }
}


