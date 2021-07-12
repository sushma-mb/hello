package com.Sushma;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a string: ");

        String n=s.nextLine();
        for(int i=n.length()-1;i>=0;i--)
            System.out.print(n.charAt(i)+" ");
    }
}
