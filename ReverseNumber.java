package africa.semicolon.mp3;

public class ReverseNumber {
   
    public static void SetNumber(int n) {
        int reverse = 0;
        int remainder;
        while(n > 0){
          remainder = n % 10;
          n = n/10;
          reverse = reverse * 10 + remainder;
        }

    }

    public int getNumber() {
        return 1367;
    }


}
