package chapterSix;

import java.security.SecureRandom;

public class CoinTossing {
    private static final   SecureRandom secureRandom = new SecureRandom();
    private enum StateOfCoin{
         HEAD, TAIL
    }

    public static void main(String[] args) {
        StateOfCoin sideOfTheCoin = null;



        for(int i = 1; i <=10 ; i++ ) {
            int coinDisplayed= flip();
            if(coinDisplayed ==1){
                sideOfTheCoin = StateOfCoin.HEAD;
            }else if(coinDisplayed ==2){
                sideOfTheCoin = StateOfCoin.TAIL;
            }
            System.out.println(sideOfTheCoin);

        }
    }
    public static int flip(){
        return 1 + secureRandom.nextInt(2);
    }
}
