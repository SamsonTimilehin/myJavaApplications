package chapterFour;

public class TriangleForLoop {
    public static void main(String[] args) {

            int counter = 0;
            String astherics = " ";
        while( counter <= 10) {
            System.out.println(astherics);
            astherics += "*";
            counter ++;

        }
        System.out.println();

        counter = 10;
        while(counter > 0){
            String asterisks = "";
            for (int i = 0; i < counter; i++) {
                asterisks += "*";
            }
            System.out.println(asterisks);
            counter--;
        }


         System.out.println();
        int space = 0;
        String spaces = "";
         for (int i = 1; i <= 10; i++) {
             System.out.print(spaces);
            for (int j= 10; j > space; j--)
                System.out.print("*");

             System.out.println();
             spaces += " ";
             space++;
            }

        System.out.println();

        space = 10;
        spaces = " ";
         String asterisks = " ";
        for (int i = 10; i >= 0; i--) {
            System.out.println(asterisks);
            asterisks += "*";

            for (int j= 1; j < space; j++)
                System.out.print(spaces);
            space --;
        }

       }


    }
