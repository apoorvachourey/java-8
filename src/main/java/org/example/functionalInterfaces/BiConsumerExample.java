package org.example.functionalInterfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {


    public static void nameAndActivity(){
        BiConsumer<String,List<String>> biConsumer = (name,activities)-> System.out.println(name+" : "+activities);
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
    }




    public static void main(String[] args) {
      /*  BiConsumer<String,String> biConsumer = (a,b)->{
            System.out.println("a : "+a+" b : "+b);
        };
        biConsumer.accept("java7 ","java8");

        BiConsumer<Integer,Integer> multiply = (a,b)->{
            System.out.println("multiplication :: "+a*b);
        };

        BiConsumer<Integer,Integer> division = (a,b)->{
            System.out.println("Division :: "+(a/b));
        };

        multiply.andThen(division).accept(10,5);*/

        nameAndActivity();
    }
}
