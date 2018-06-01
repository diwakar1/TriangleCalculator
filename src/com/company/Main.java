package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len1;
        int len2;
        int len3;
        int eqlTriangle;
        System.out.println("enter one side of triangle: ");
        len1 = input.nextInt();
        System.out.println("enter second side of triangle: ");
        len2 = input.nextInt();
        System.out.println("enter third side of triangle: ");
        len3 = input.nextInt();
        if (len1 == len2 && len3 == len2) {
            System.out.println("this is equiltriangle ");


        } else if
                ((((len1 * len1) + (len2 * len2)) == (len3 * len3)) ||
                    (((len1 * len1) + (len3 * len3)) == (len2 * len2)) ||
                    (((len3 * len3) + (len2 * len2)) == (len1 * len1)))
        {
            System.out.println("this is right triangle");
        }
            else {
                System.out.println("this is not right triangle");
            }


        }


    }



