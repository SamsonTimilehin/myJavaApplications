package chapter14;



public class FaceBookUserGrowth {

    public static void main(String[] args) {

        double targetBase;
        double growthRate = 0.04;
        double month = 1;
        double userBase = 1_000_000_000;

        while(true){
            targetBase = userBase * Math.pow(1.0 + growthRate,month);
            if(targetBase >= 1_500_000_000){
                System.out.println(month);
                break;
            }
            month++;
        }


    }

}
