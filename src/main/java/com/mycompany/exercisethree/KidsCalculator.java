package com.mycompany.exercisethree;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Cristian Gallego
 */
public class KidsCalculator extends Calculator {

    @Override
    public void operateCalculator() {

        Scanner getInt = new Scanner(System.in);
        System.out.println("WELCOME TO THE KIDS CALCULATOR, PLEASE CHOOSE WHAT YOU WANT TO DO ");
        System.out.println("1. ADD");
        System.out.println("2. SUBSTRACT");
        System.out.println("3. MULTIPLY");
        System.out.println("4. DIVIDE");
        System.out.println("5. RETURN");
        try {
            option = getInt.nextInt();
            listNumbers = (option >= 1 && option <= 4) ? getInputString() : null;
        } catch (InputMismatchException e) {
            System.out.println("Invalid option, please enter a valid option");
            getInt.nextLine(); // clear the scanner buffer
            operateCalculator();
        }

        switch (option) {
            case 1 -> {
                if (listNumbers.size() < 4) {
                    System.out.println("The result is: " + sumList(listNumbers) + '\n');
                } else {
                    System.out.println("Error. You just can write a maximum of 3 numbers" + '\n');
                }
            }

            case 2 -> {
                if (listNumbers.size() < 4) {
                    System.out.println("The result is: " + subtractList(listNumbers) + '\n');
                } else {
                    System.out.println("Error. You just can write a maximum of 3 numbers" + '\n');
                }
            }

            case 3 -> {
                if (listNumbers.size() < 4) {
                    System.out.println("The result is: " + multiply(listNumbers) + '\n');
                } else {
                    System.out.println("Error. You just can write a maximum of 3 numbers" + '\n');
                }
            }

            case 4 -> {
                if (listNumbers.size() < 4) {
                    System.out.println("The result is: " + divideList(listNumbers) + '\n');
                } else {
                    System.out.println("Error. You just can write a maximum of 3 numbers" + '\n');
                }
            }

            case 5 -> {
                System.out.println();
            }

        }

    }

}
