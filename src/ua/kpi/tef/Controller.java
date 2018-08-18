package ua.kpi.tef;

/**
 * Created by Max on 05.03.2017.
 */
import java.util.Scanner;

class Controller {

    Model model;
    View view;
    private int minValue = 0;
    private int maxValue = 100;
    private int userValue;
    private int attemptsCount = 0;
    private int [] userNumbers = new int[101];

    Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setValue();
        do {
            userValue = inputNumberWithScanner(sc);
            userNumbers[attemptsCount++] = userValue;
        }
            while(!checkNumber(userValue));
        printStats();
    }

    void printStats() {
        view.printMessage(view.ATTEMPTS_COUNT + attemptsCount);
        view.printMessage(view.HISTORY);
        for(int count = 0; count < attemptsCount; count++) {
            view.printNumber(userNumbers[count]);
        }
    }

    int inputNumberWithScanner(Scanner sc) {

            do {
                view.printMessageWithNumbers(view.INPUT_NUMBER, minValue, maxValue);
                while( ! sc.hasNextInt()) {
                    view.printMessage(view.WRONG_INPUT_NUMBER);
                    sc.next();
                }
                userValue = sc.nextInt();
            }
            while ((userValue > maxValue) || (userValue < minValue));
        return userValue;
    }

    boolean checkNumber(int userValue) {
        if(userValue == model.getValue()) {
            view.printMessage(view.RIGHT_NUMBER);
            return true;
        }
        else {
            view.printMessage(view.NOT_RIGHT_NUMBER);
            if(userValue < model.getValue())
                minValue = userValue + 1;
            else
                maxValue = userValue - 1;
            return false;
        }
    }
}
