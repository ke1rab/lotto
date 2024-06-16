/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author u117-9
 */
public class Game {
    
    
    
     private static  int maxGames  = 10000;
    private static  int costGame = 5;
    private static  int match3 = 5;
    private static  int match4 = 250;
    private static  int match5 = 100000;
    private static  int match6 = 3000000;

    private Random random;

    public Game() {
        random = new Random();
    }

    public void playGames(Number userNumbers, int numGames) throws Exception {
        if (numGames <= 0 || numGames > maxGames) {
            throw new Exception("Ilość gier jest nieprawidłowa.");
        }

        int totalCost = numGames * costGame;
        int totalPrize = 0;
        int[] matchCounts = new int[7];

        for (int i = 0; i < numGames; i++) {
            List<Integer> systemNumbers = generateRandomNumbers();
            int matches = CountMatches(userNumbers.getNumbers(), systemNumbers);
            matchCounts[matches]++;
            totalPrize += calculatePrize(matches);
        }

        printResults(matchCounts, totalPrize, totalCost);
    }

    private List<Integer> generateRandomNumbers() {
        List<Integer> systemNumbers = new ArrayList<>();
        while (systemNumbers.size() < 6) {
            int number = random.nextInt(49) + 1;
            if (!systemNumbers.contains(number)) {
                systemNumbers.add(number);
            }
        }
        return systemNumbers;
    }

    private int CountMatches(Set<Integer> userNumbers, List<Integer> systemNumbers) {
        int matches = 0;
        for (int number : userNumbers) {
            if (systemNumbers.contains(number)) {
                matches++;
            }
        }
        return matches;
    }

    private int calculatePrize(int matches) {
        switch (matches) {
            case 3:
                return match3; 
            case 4:
                return match4;
            case 5:
                return match5;
            case 6:
                return match6;
            default:
                return 0;
        }
    }

    private void printResults(int[] matchCounts, int totalPrize, int totalCost) {
        for (int i = 3; i <= 6; i++) {
            System.out.println("Liczba trafień " + i + " liczb: " + matchCounts[i]);
        }
        System.out.println("Wygrana : " + totalPrize + " zł");
        System.out.println("Za grę trzeba zapłacić: " + totalCost + " zł");
    }
}



