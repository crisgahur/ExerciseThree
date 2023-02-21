package com.mycompany.exercisethree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ExerciseThree {

    public static void main(String[] args) {
        List<Double> HistoryMemory = new ArrayList<>();
        boolean continues = true;
        int option;
        Scanner getInt = new Scanner(System.in);

        do {
            System.out.println("WELCOME TO THE CALCULATOR APP, PLEASE CHOOSE WHICH ONE YOU WANT TO USE ");
            System.out.println("1. BASIC CALCULATOR");
            System.out.println("2. ADVANCE CALCULATOR");
            System.out.println("3. KIDS CALCULATOR");
            System.out.println("4. HISTORY");
            System.out.println("5. EXIT");
            option = getInt.nextInt();
            
            switch (option) {
                case 1 -> {
                    BasicCalculator basicCalculator = new BasicCalculator();
                    basicCalculator.operateCalculator();
                    HistoryMemory.addAll(basicCalculator.history);
                }

                case 2 -> {
                    AdvanceCalculator advanceCalculator = new AdvanceCalculator();
                    advanceCalculator.operateCalculator();
                    HistoryMemory.addAll(advanceCalculator.history);
                }

                case 3 -> {
                    KidsCalculator kidsCalculator = new KidsCalculator();
                    kidsCalculator.operateCalculator();
                    HistoryMemory.addAll(kidsCalculator.history);
                }
                case 4 -> {
                 System.out.println("Result of operations: " + HistoryMemory + '\n');
                }

                case 5 -> {
                    System.out.println("CALCULATOR DISCONNECTED");
                    continues = false;
                }
            }
        } while (continues);
    }
}
