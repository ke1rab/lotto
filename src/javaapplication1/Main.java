/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author u117-9
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Number userNumbers = new Number();

        System.out.println("Witaj w Lotto!");

        for (int i = 0; i < 6; i++) {
            try {
                System.out.print("Podaj unikalną liczbę z zakresu 1-49. Liczby nie mogą się powtarzać : ");
                int number = scanner.nextInt() ;
                userNumbers.addNumber(number);
            } catch(Exception e) {
                System.out.println(e.getMessage());
                i--;
            }
        }

        System.out.print("Ile gier chcesz rozegrać. Maksymalnie jest to 10 000: ");
        int numGames = scanner.nextInt();

        Game Game1 = new Game();
        Game1.playGames(userNumbers, numGames);
    
      
    }
        
 
        
    }




    
    

