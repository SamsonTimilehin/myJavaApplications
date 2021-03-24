package chapterFour;

public class TabularOutput {
    public static void main(String[] args) {


        System.out.printf("%s%5s%6s%7s","N","10*N","100*N","1000*N");
        int counter = 1;
        while (counter <= 5){

            System.out.printf("%n%d%5d%6d%7d",counter,counter*10,counter*100,counter*1000);
            counter ++;
        }

    }
}
