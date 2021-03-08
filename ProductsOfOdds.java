package chapterFour;

public class ProductsOfOdds {
    public static void main(String[] args) {

        int odd = 1;
        for( int counter = 1; counter <= 15; counter +=2){
            odd = odd * counter;


    }
        System.out.println("The product of odd numbers from 1 - 15 is "+  odd);
    }
}
