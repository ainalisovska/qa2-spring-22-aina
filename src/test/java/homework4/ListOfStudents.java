package homework4;

import lesson2.Student;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

public class ListOfStudents {

    @Test
    public void listOfStudents () {
        List<Student> students = new ArrayList<>();

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

        for (int i = 0; i < students.size(); i++) {
            System.out.println(i+1 +": " + students.get(i).getFirstName());
        }

        for (Student student : students) {
            if (student.getCourse().contentEquals("QA1")) {
                System.out.println(student.getFirstName() + " is attending course QA1");
            }
        }
    }
}
