package com.mycompany.exercisethree;

import java.util.ArrayList;
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
        List<Double> listNumbers = new ArrayList<>();
        
        Scanner optionSelected = new Scanner(System.in);
        System.out.println("WELCOME TO THE ADVANCE CALCULATOR, PLEASE CHOOSE WHAT YOU WANT TO DO ");
        System.out.println("1. ADD");
        System.out.println("2. SUBSTRACT");
        System.out.println("3. MULTIPLY");
        System.out.println("4. DIVIDE");
        System.out.println("5. POWER OF");
        System.out.println("6. LOGARITHM");
        System.out.println("7. RETURN");
        try {
            option = optionSelected.nextInt();
                 listNumbers = (option >= 1 && option <= 6) ? getInputString() : listNumbers;
        } catch (InputMismatchException e) {
            System.out.println("Invalid option, please enter a valid option");
            optionSelected.nextLine(); // clear the scanner buffer
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
        double result = Math.log(number) / Math.log(base);
        history.add("Logarithm requested. Values:" + numbersList.toString() +  ". Result: " + Double.toString(result));
        return result;
    }

    public double powersOfThree(List<Double> numbersList) {
        double number = numbersList.get(0);
        double result = Math.pow(number, 3);
        history.add("Power of requested. Values:" + numbersList.toString() +  ". Result: " + Double.toString(result));
        return result;
    }
}
