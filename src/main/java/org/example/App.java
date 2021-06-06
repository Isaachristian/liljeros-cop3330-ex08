/*
 *  UCF COP3330 Summer 2021 Assignment 8 Solution
 *  Copyright 2021 Isaac Liljeros
 */

package org.example;

import java.util.Scanner;

/**
 * Pizza Party
 */
public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        double people, pizzas, slices;
        int slicesPerPerson, slicesLeftover;

        System.out.print("How many people? ");
        people = scanner.nextInt();

        System.out.print("How many pizzas do you have? ");
        pizzas = scanner.nextInt();

        slices = pizzas * 8;
        slicesPerPerson = (int) (slices / people);
        slicesLeftover  = (int) (slices - (slicesPerPerson * people));

        System.out.println((int)people + " people with " + (int)pizzas + " pizzas");
        System.out.println("Each person gets " + slicesPerPerson + " pieces of pizza.");
        System.out.println("There are " + slicesLeftover + " leftover pieces");
    }
}
