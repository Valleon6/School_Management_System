import schoolManagementSystem.School;
import schoolManagementSystem.Student;
import schoolManagementSystem.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher Vero = new Teacher(1, "Vero", 500);
        Teacher Jane = new Teacher(2, "Jane", 700);
        Teacher Gabriel = new Teacher(3, "Gabriel", 600);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(Vero);
        teachers.add(Jane);
        teachers.add(Gabriel);

        Student Val = new Student(1, "Val", 6);
        Student Chisom = new Student(2, "Chisom", 5);
        Student Oge = new Student(3, "Oge", 3);

        List<Student> students = new ArrayList<>();
        students.add(Val);
        students.add(Chisom);
        students.add(Oge);

        School Benbee = new School(teachers, students);
        System.out.println ("Benbee has earned $" + Benbee.getTotalMoneyEarned());

        Teacher Paul = new Teacher(4, "Paul", 900);


        Benbee.addTeacher(Paul);

        Val.payFees(5000);
        System.out.println ("Benbee has earned $" + Benbee.getTotalMoneyEarned());
        Chisom.payFees(7000);
        System.out.println ("Benbee has earned $" + Benbee.getTotalMoneyEarned());

        System.out.println("--------Making School pay Salary---------");

        Vero.receiveSalary(Vero.getSalary());
        System.out.println ("Benbee has spent " + Vero.getSalary() + " for " + Vero.getName() +
                "'s salary" + " and now has " + Benbee.getTotalMoneyEarned());

        Jane.receiveSalary(Jane.getSalary());
        System.out.println("Benbee has spent " + Jane.getSalary() + " for " + Jane.getName() +
                "'s salary" + " and now has " + Benbee.getTotalMoneyEarned());

        Paul.receiveSalary(Paul.getSalary());

        System.out.println(Val);
        System.out.println(Vero);
        System.out.println(Paul);

        System.out.println(Benbee.getTotalMoneyEarned());





    }
}