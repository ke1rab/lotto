/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author u117-9
 */
public class Number {
    
    private Set<Integer> numbers;

    public Number() {
        numbers = new HashSet<>();
    }

    public void addNumber(int number) throws Exception {
        if (number < 1 || number > 49 || numbers.contains(number)) {
            throw new Exception("Niepoprawna liczba. Liczby muszą być z zakresu 1-49 oraz nie mogą się powtarzać !!!");
        }
        numbers.add(number);
    }

    public Set<Integer> getNumbers() {
        return numbers;
    }
}



