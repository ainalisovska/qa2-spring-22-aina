package varioustests;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class NumberTests {

       @Test
    public void operationsWithNumbers() {
        List<Integer> numbersList = new ArrayList<>();

           for (int i = 0; i < 110; i = i+4) numbersList.add(i % 30);
           System.out.println(numbersList);


           System.out.println("There are " + numbersList.size() + " numbers in a list");


//           for (Integer number : numbersList) {
//               if (number. {
//                   System.out.println(number);
//               }
//           }



           for (int i = 0; i < numbersList.size(); i++) {

            System.out.println(numbersList.get(i));
        }















    }
}
