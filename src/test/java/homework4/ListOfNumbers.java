package homework4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {

    @Test
    public void operationsWithNumbers() {
        List<Integer> numbersList = new ArrayList<>();

        for (int i = 2; i < 110; i = i+3) numbersList.add(i % 30);
        System.out.println(numbersList);
        System.out.println("There are " + numbersList.size() + " numbers in a list");

        for (Integer number : numbersList) {
            if ((number/2) == 4) {
                System.out.println("We get 4 if divide by 2 this number: " + number);
            }
        }

        for (Integer number : numbersList) {
            if ((number%2) == 0) {
                System.out.println("We can divide by 2 without remainder: " + number);
            }
        }
    }
}






