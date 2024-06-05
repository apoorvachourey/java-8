package org.example.functionalInterfaces;

import org.example.data.Student;
import org.example.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
   static Consumer<Student> studentConsumer = (student)-> System.out.println(student);
   static Consumer<Student> studentNameConsumer = (student)-> System.out.println(student.getName());
   static Consumer<Student> studentActivityConsumer = (student)-> System.out.println(student.getActivities());
    public static void printStudents(){
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(studentConsumer);
    }

    public static void nameAndActivity(){
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(studentNameConsumer.andThen(studentActivityConsumer)); //Consumer Chaining

    }

    public static void nameAndActivityCondition(){
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach((student -> {
            if(student.getGradeLevel()>=3){
                studentNameConsumer.andThen(studentActivityConsumer).accept(student);
            }
        }));

    }
    public static void main(String[] args) {
        Consumer<String> c1 = (s)-> System.out.println(s.toUpperCase());
        c1.accept("java8");
        //printStudents();
        //nameAndActivity(); //
        nameAndActivityCondition();
    }

}
/* Lambda embraces code reusability; */