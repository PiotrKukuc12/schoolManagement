package school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Teacher lizzy = new Teacher(1,"Lizzy", 500);
        Teacher melisa = new Teacher(2, "Melisa", 700);
        Teacher vander = new Teacher(3, "Vander", 1000);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melisa);
        teacherList.add(vander);

        Student tamara = new Student(1, "Tamara", 4);
        Student rakshith = new Student(2, "Rakshith", 12);
        Student rabbi = new Student(3, "Rabbi", 5);
        List<Student> studentList = new ArrayList<>();
        studentList.add(tamara);
        studentList.add(rakshith);
        studentList.add(rabbi);


        School ghs = new School(teacherList, studentList);
        System.out.println("GHS has earned: "+ghs.getTotalMoneyEarned());
        tamara.payFees(5000);
        System.out.println("GHS has earned: "+ghs.getTotalMoneyEarned());

        System.out.println("--------- MAKING GHS PAY SALARY --------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName() + "and now has" + ghs.getTotalMoneyEarned());
        vander.receiveSalary(vander.getSalary());
        System.out.println("GHS has spent for salary to " + vander.getName() + "and now has" + ghs.getTotalMoneyEarned());

        System.out.println(tamara);
        System.out.println(lizzy);
    }
}
