package com.mycompany.exercisethree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Cristian Gallego
 */
public class Calculator {

    public List<Double> history = new ArrayList<>();
    public List<Double> listNumbers = new ArrayList<>();
    public int option;

    public List<Double> getInputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the numbers:");
        String values = scanner.nextLine();
        List<Double> numbersList = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(values);
        while (matcher.find()) {
            double number = Double.parseDouble(matcher.group());
            numbersList.add(number);
        }
        return numbersList;
    }

    public double sumList(List<Double> numbersList) {
        double sum = 0;
        for (double number : numbersList) {
            sum += number;
        }
        history.add(sum);
        return sum;
    }

    public double subtractList(List<Double> numbersList) {
        double result = numbersList.get(0);
        for (int i = 1; i < numbersList.size(); i++) { // ¿Por qué me marca error si pongo la i con double?
            double value = numbersList.get(i);
            result = result - value;
        }
        history.add(result);
        return result;
    }

    public double multiply(List<Double> numbersList) {
        double result = numbersList.get(0);
        for (int i = 1; i < numbersList.size(); i++) {
            double value = numbersList.get(i);
            result *= value;
        }
        history.add(result);
        return result;

    }

    public double divideList(List<Double> numbersList) {
        double result = numbersList.get(0);
        for (int i = 1; i < numbersList.size(); i++) {
            double value = numbersList.get(i);
            result /= value;
        }
        history.add(result);
        return result;
    }

    public void history() {
        for (int i = 0; i < history.size(); i++) {
             System.out.println(history.get(i));
        }
    }

    public void operateCalculator() {

    }
}
