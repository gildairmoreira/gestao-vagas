package br.com.gildairmoreira.gestaovagas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class PrimeiroTest {
    
    @Test
    public void it_must_be_possible_to_calculate_two_numbers() {
        var result = calculate(2, 3);
        assertEquals(result, 5);
    }

    @Test
    public void validate_incorrect_values() {
        var result = calculate(2, 3);
        assertNotEquals(result, 5);
        }
    
    public static int calculate(int num1, int num2){
        return num1+num2;
    }
}
