package Chapter_Seven;

import java.util.Arrays;

public class SieveOfEratosthenes {

    public static void main(String[] args) {

        boolean [] prime = new boolean[10];
        System.out.println(Arrays.toString(findPrimeIndices(prime)));


    }
    public static boolean[] findPrimeIndices(boolean[] numbers){
        for(int i = 2; i < numbers.length; i++){
            if(numbers[i]){
                eliminateMultiples(numbers, i);
            }
        }

        return numbers;
    }

    private static void eliminateMultiples(boolean[] numbers, int i){
        int multiple;
        for(int j = 2; j < numbers.length; j++){
            multiple = i * j;
            if(multiple < numbers.length){
                numbers[multiple] = false;
            }
            else break;
        }
    }



}

