package chapterFour;

public class CompoundInterest {
    public static void main(String[] args) {

        double amount1;
        double amount2;
        double amount3;
        double amount4;
        double amount5;
        double principal = 1000.0;
        double rate1 = 0.06;
        double rate2 = 0.07;
        double rate3 = 0.08;
        double rate4 = 0.09;
        double rate5 = 0.10;

         System.out.printf("%s%25s%25s%25s%25s%25s%n", "Year", "Amount on deposit(6%)","Amount on deposit(7%)","Amount on deposit(8%)","Amount on deposit(9%)","Amount on deposit(10%)");

        for (int year = 1; year <= 10; ++year) {


            amount1 = principal * Math.pow(1.0 + rate1, year);
            amount2 = principal * Math.pow(1.0 + rate2, year);
            amount3 = principal * Math.pow(1.0 + rate3, year);
            amount4 = principal * Math.pow(1.0 + rate4, year);
            amount5 = principal * Math.pow(1.0 + rate5, year);


            System.out.printf("%4d%24.2f%24.2f%24.2f%24.2f%24.2f%n", year, amount1,amount2,amount3,amount4,amount5);
        }
    }
}
