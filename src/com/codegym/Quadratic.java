package com.codegym;

import java.security.NoSuchAlgorithmException;

public class Quadratic {
    public static void main(String[] args) {

        Quadratic.solve(1,3,2);

    }
    public static void solve(double a,double b,double c) {
        double delta, n1, n2;
        delta = b*b - 4*a*c;
        if(delta<0){
            System.out.println("The equation has no roots");
        }
        else if(delta==0){
            n1 = n2 = -b/(2*a);
            System.out.println("Equation with double solution "
                    + "\nx1 = x2 =" + n1);
        }
        else{
            n1 = (-b + Math.sqrt(delta))/(2*a);
            n2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("The equation has two distinct solutions: "
                    + "\nX1 = " + n1 + "\nX2 = " + n2);
        }
    }
}
