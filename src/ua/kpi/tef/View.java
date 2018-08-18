package ua.kpi.tef;

/**
 * Created by Max on 05.03.2017.
 */
class View {
    static final String INPUT_NUMBER = "Input a number ";
    static final String WRONG_INPUT_NUMBER = "The number is not correct! Repeat please! ";
    static final String NOT_RIGHT_NUMBER = "Try one more time! ";
    static final String RIGHT_NUMBER = "Congratulations! The number is right! ";
    static final String ATTEMPTS_COUNT = "Attempts count: ";
    static final String HISTORY = "History of the game: ";


    void printMessage(String message){
        System.out.println(message);
    }

    void printNumber(int number){
        System.out.print(number + "  ");
    }

    void printMessageWithNumbers(String message, int minValue, int maxValue){
        System.out.println(message + "[" + minValue + "; " + maxValue + "]");
    }

}
