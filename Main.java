package com.company;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Main {

  static  Logger logger=Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        logger.info("Enter the number");
        int n1=sc.nextInt();

       logger.log(Level.INFO,"Hello {0}",n1);

    }


}