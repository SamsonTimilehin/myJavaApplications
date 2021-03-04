public class TwelveDays {

    public static void main(String[] args) {
        int counter = 0;

        while (counter <= 12){
            System.out.print("On the ");
            counter ++;
            switch(counter){
                case 12 -> System.out.print("twelve");
                case 11 -> System.out.print("eleven");
                case 10 -> System.out.print("ten");
                case 9 -> System.out.print("nine");
                case 8 -> System.out.print("eight");
                case 7 -> System.out.print("seventh");
                case 6 -> System.out.print("sixth");
                case 5 -> System.out.print("fifth");
                case 4 -> System.out.print("fourth");
                case 3 -> System.out.print("third");
                case 2 -> System.out.print("second");
                case 1 -> System.out.print("first");

            }
            System.out.println(" Day of Christmas my true love gave to me");

            switch(counter){
                case 12:
                    System.out.println("twelve Drummers Drummer");
                case 11:
                    System.out.println("eleven Piper piping");
                case 10:
                    System.out.println("the Lords a leaping");
                case 9:
                    System.out.println("nine ladies dancing");
                case 8:
                    System.out.println("eight maids a milking");
                case 7:
                    System.out.println("seven Swans a swimming");
                case 6:
                    System.out.println("six Geese a laying ");
                case 5:
                    System.out.println("five Golden Rings");
                case 4:
                    System.out.println("four Calling Birds");
                case 3:
                    System.out.println("three French Hens");
                case 2:
                    System.out.println("two Turtle Doves");
                case 1:
                    System.out.printf("A partridge in a pear tree %n%n");
            }
        }
    }
}
