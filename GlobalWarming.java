package Chapter_Five;

public class GlobalWarming {
    private String storeQuestions;
    private String answer;
    private int score;
    private boolean questionOneSelected;
    private boolean questionTwoSelected;
    private boolean questionThreeSelected;
    private boolean questionFourSelected;
    private boolean questionFiveSelected;



    public String displayQuestion(int questionNumber){


        switch (questionNumber) {
            case 1 -> {
                if (questionOneSelected) {
                    throw new IllegalArgumentException("Question has already been selected!");
                }
                storeQuestions = "1. what is his state?\n A. Jos\n B. Kano\n C. Rivers\n D. Lagos";
                answer = "D";
                questionOneSelected = true;
            }
            case 2 -> {
                if (questionTwoSelected) {
                    throw new IllegalArgumentException("Question has already been selected!");
                }
                storeQuestions = "2. what is her brother's name?\n A. John\n B. Peter\n C. Jane\n D. Michael";
                answer = "C";
                questionTwoSelected = true;
            }
            case 3 -> {
                if (questionThreeSelected) {
                    throw new IllegalArgumentException("Question has already been selected!");
                }
                storeQuestions = "3. what is her color?\n A. Blue\n B. Green\n C. Yellow\n D. Purple";
                answer = "B";
                questionThreeSelected = true;
            }
            case 4 -> {
                if (questionFourSelected) {
                    throw new IllegalArgumentException("Question has already been selected!");
                }
                storeQuestions = "4. what is her brother's color?\n A. Brown\n B. White\n C. Black\n D. Yellow";
                answer = "A";
                questionFourSelected = true;
            }
            case 5 -> {
                if (questionFiveSelected) {
                    throw new IllegalArgumentException("Question has already been selected!");
                }
                storeQuestions = "5. what state is her mother from?\n A. Oyo\n B. Kano\n C. Abuja\n D. Jos";
                answer = "D";
                questionFiveSelected = true;
            }
        }

        return storeQuestions;
    }


    public String getSelectAnswer(String selectedOption) {
        if(answer.equals(selectedOption)) {
            score++;
        }
        return answer;
    }

    public int getScore() {
        return score;
    }
}
