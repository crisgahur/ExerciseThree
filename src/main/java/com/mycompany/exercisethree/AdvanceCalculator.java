package com.mycompany.exercisethree;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cristian Gallego
 */
public class AdvanceCalculator extends Calculator {

    @Override
    public void operateCalculator() {
        
        Scanner getInt = new Scanner(System.in);
        System.out.println("WELCOME TO THE ADVANCE CALCULATOR, PLEASE CHOOSE WHAT YOU WANT TO DO ");
        System.out.println("1. ADD");
        System.out.println("2. SUBSTRACT");
        System.out.println("3. MULTIPLY");
        System.out.println("4. DIVIDE");
        System.out.println("5. POWER OF");
        System.out.println("6. LOGARITHM");
        System.out.println("7. RETURN");
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
                System.out.println("The result is: " + sumList(listNumbers) + '\n');
            }

            case 2 -> {
                System.out.println("The result is: " + subtractList(listNumbers) + '\n');
            }

            case 3 -> {
                System.out.println("The result is: " + multiply(listNumbers) + '\n');
            }

            case 4 -> {
                System.out.println("The result is: " + divideList(listNumbers) + '\n');
            }

            case 5 -> {
                System.out.println("The result is: " + powersOfThree(listNumbers) + '\n');
            }

            case 6 -> {
                System.out.println("The result is: " + calculateLogarithm(listNumbers));
            }

            case 7 -> {
                System.out.println('\n');
            }
            
        }
        
    }

    public double calculateLogarithm(List<Double> numbersList) {
        double base = numbersList.get(0);
        double number = numbersList.get(1);
        history.add(Math.log(number) / Math.log(base));
        return (Math.log(number) / Math.log(base));
    }

    public double powersOfThree(List<Double> numbersList) {
        double number = numbersList.get(0);
        history.add(number * number * number);
        return (number * number * number);
    }

}
