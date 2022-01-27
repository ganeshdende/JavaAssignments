package com.assignment.Assignment12;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Assignment12 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        students.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        students.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        students.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        students.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        students.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        students.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        students.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        students.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        students.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        students.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        students.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        students.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        students.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        students.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        students.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        students.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
        Supplier<Stream<Student>> streamSupplier = () -> students.stream();

        //task 1
        System.out.println("Departments in college");
        streamSupplier.get().map(Student::getDept).distinct().forEach(System.out::println);

        //task2
        System.out.println("Names of student enrolled after 2018");
        streamSupplier.get().filter((s) -> s.getBatch() > 2018).map(student -> student.sname).forEach(System.out::println);

        //task3
        System.out.println("Details of Maile student in comp sci dept");
        streamSupplier.get().filter((s) -> s.getGender().equals("Male"))
                .filter((s) -> s.getDept().equals("Computer Science")).forEach((s) -> s.display());

        //task4

        System.out.println("no of male and female students:");

    }
}