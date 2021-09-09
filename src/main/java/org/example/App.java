package org.example;
import java.util.Scanner;
/**
 * What is your current age? 25
 * At what age would you like to retire? 65
 * You have 40 years left until you can retire.
 * It's 2015, so you can retire in 2055.
 *
 */
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mario Espaillat
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println( "What is your current age? " );
        int age= in.nextInt();
        System.out.println( "At what age would you like to retire? " );
        int ageR= in.nextInt();
        System.out.println( "You have "+ (ageR-age) +" years left until you can retire." );
        System.out.println( "It's 2015, so you can retire in "+ ((ageR-age)+2015) +"." );
    }
}
