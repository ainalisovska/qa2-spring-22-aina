package homework4;

import lesson2.Student;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

public class ListOfStudents {

    @Test
    public void listOfStudents () {
        List<Object> students = new ArrayList<>();


        Student daniel = new Student();
        daniel.setFirstName("Daniels");
        daniel.setLastName("Ozolins");
        daniel.setAge(18);
        daniel.setPersonalCode("030304-11567");
        daniel.setCourse("QA1");

        Student aiga = new Student();
        aiga.setFirstName("Aiga");
        aiga.setLastName("Petersone");
        aiga.setAge(19);
        aiga.setPersonalCode("120403-13333");
        aiga.setCourse("QA2");

        Student vika = new Student();
        vika.setFirstName("Viktorija");
        vika.setLastName("Sudraba");
        vika.setAge(19);
        vika.setPersonalCode("120403-13333");
        vika.setCourse("QA1");

        Student slava = new Student();
        slava.setFirstName("Jaroslav");
        slava.setLastName("Zolotov");
        slava.setAge(18);
        slava.setPersonalCode("130603-13444");
        slava.setCourse("QA2");

        Student renar = new Student();
        renar.setFirstName("Renars");
        renar.setLastName("Melnais");
        renar.setAge(19);
        renar.setPersonalCode("110103-16789");
        renar.setCourse("QA2");

        students.add(daniel);
        students.add(aiga);
        students.add(vika);
        students.add(slava);
        students.add(renar);


        System.out.println(students.get(1));
        System.out.println(students.size());





        for (Object student: students) {
            System.out.println(student);

        }













    }

}
