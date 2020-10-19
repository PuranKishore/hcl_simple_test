package com.company.hcl;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Select Sides 2/3: ");
        int side = in.nextInt();

        if ( side == 2 || side == 3) {
            System.out.print("Input Side-1: ");
            double side1 = in.nextDouble();
            System.out.print("Input Side-2: ");
            double side2 = in.nextDouble();

            if ( side == 3) {
                System.out.print("Input Side-3: ");
                double side3 = in.nextDouble();
                System.out.println( is_Valid( side1, side2,side3 ) ?
                        "The area of the triangle is " + area_triangle(side1, side2, side3) : "Invalid triangle" );
            } else if ( side == 2) {
                double area = ( side1 * side2 ) / 2;
                System.out.println("Area of Triangle is: " + area);
            }
        } else {
            System.out.println("Please select only 2 or 3 sides..");
        }

    }

    public static boolean is_Valid(double side1, double side2, double side3) {
        if ( side1 + side2 > side3 &&
                side2 + side3 > side1 &&
                side1 + side3 > side2) return true;
        else return false;
    }
    public static double area_triangle(double side1, double side2, double side3) {
        double area = 0;
        double s = (side1 + side2 + side3)/2;
        area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
        return area;
    }

}
