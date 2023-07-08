package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        Course course1 = new Course("Summer","TurkishDay",97,128);
        Course course2 = new Course("Winter","EnglishNight",98,154);
        Course course3 = new Course("Spring","TurkishNight",93,113);
        Course course4 = new Course("Summer","EnglishDay",94,129);

        List<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);

        // Average Score' ların 91' den büyük olup-olmadığını kontrol ediniz.
        boolean r1 = courses
                .stream()
                .allMatch(t->t.getAverageScore()>91);
        System.out.println(r1);

        // Kurs isimlerinden "Turkish" harfini içerip-içermediğini kontrol ediniz.
        boolean r2 = courses
                .stream()
                .anyMatch(t->t.getCourseName().contains("Turkish"));
        System.out.println(r2);

        // Kurs dönemleri içinde "Fall" kelimesinin hiç bulunmadığını kontrol ediniz.
        boolean r3 = courses
                .stream()
                .noneMatch(t->t.getCourseName().contains("Fall"));
        System.out.println(r3);

        // Average score en yüksek olan kursun ismini bulunuz.
        String r4 = courses
                .stream()
                .sorted(Comparator.comparing(Course::getAverageScore).reversed())
                .findFirst()
                .get()
                .getCourseName();
        System.out.println(r4);

        // Tüm course objectlerini Average score küçükten büyüğe diziniz ve ilk ikisini liste halinde yazınız.
        List<Course> list1 = courses
                .stream()
                .sorted(Comparator.comparing(Course::getAverageScore))
                .skip(2)
                .collect(Collectors.toList());
        System.out.println(list1);

        // Tüm course objectlerini Average score küçükten büyüğe diziniz ve ilk üçünü liste halinde yazınız.
        List<Course> list2 = courses
                .stream()
                .sorted(Comparator.comparing(Course::getAverageScore))
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(list2);
    }
}
