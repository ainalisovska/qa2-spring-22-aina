import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Loops {
    @Test
    public void loopsLesson() {
        List<String> studentNames = new ArrayList<>();

        System.out.println(studentNames.isEmpty());

        studentNames.add("Dmitry");
        studentNames.add("Svetlana");
        studentNames.add("Sergey");
        studentNames.add("Anna");
        studentNames.add("Deniss");
        studentNames.add("Anton");
        studentNames.add("Timur");
        studentNames.add("Daniel");
        studentNames.add("Darja");
        //studentNames: "Dmitry", "Svetlana", "Sergey" (List of Strings)

//        System.out.println(studentNames.get(1));
//        System.out.println(studentNames.size());
//        System.out.println(studentNames.isEmpty());

        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println(studentNames.get(i));
        }

//        for (String name : studentNames) {
//            System.out.println(name);
//        }

        for (String name : studentNames) {
            if (name.startsWith("D")) {
                System.out.println(name);
            }
        }

        for (String name : studentNames) {
            if (name.startsWith("D")) {
                System.out.println(name + " This name starts with D");

            }else {
                System.out.println(name + " This name doesn't start with D");
            }
        }


    }
}
