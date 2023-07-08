package day36lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        Course course1 = new Course("Summer","Turkish",97,128);
        Course course2 = new Course("Winter","English",98,154);
        Course course3 = new Course("Spring","Turkish",93,113);
        Course course4 = new Course("Summer","English",94,129);

        List<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);

        // Average Score' ların 91' den büyük olup-olmaığını bulunuz.
        boolean r1 = courses
                .stream()
                .allMatch(t->t.getAverageScore()>91);

        System.out.println(r1);

        // Kurs isimlerinden "Turkish" harfini içerip-içermediğini bulunuz.
        boolean r2 = courses
                .stream()
                .anyMatch(t->t.getCourseName().contains("Turkish"));

        System.out.println(r2);
    }
}
