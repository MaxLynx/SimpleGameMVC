package ua.kpi.tef;

/**
 * Created by Max on 05.03.2017.
 */
import java.util.Random;

class Model {
    static final int MAX_VALUE = 100;
    private int value;

    int getValue() {
        return value;
    }

    void setValue()
    {
        Random rand = new Random();
        this.value = rand.nextInt(MAX_VALUE+1);
    }
}
