package com.fundamentals.java;

import com.fundamentals.lessons.Lesson5;
import com.fundamentals.lessons.Lesson7;

public class Main {



    public static void main(String[] args) {
        // lesson4Examples();
        //lesson5Examples();
        lesson7Examples();
    }

       public static void lesson7Examples() {
           Lesson7 myLesson7 = new Lesson7();
           myLesson7.exampleArithmatic();
           //myLesson7.addTwoNumbers();  // uncomment to test
           myLesson7.exampleAssignment();
           myLesson7.exampleAND();
           myLesson7.exampleOr();
           myLesson7.exampleXor();
           myLesson7.exampleLeftshift();
           myLesson7.exampleRightShift();
           myLesson7.exampleRelational();
    }  // end method


       public static void lesson5Examples() {
           Lesson5 myLesson5 = new Lesson5();
           myLesson5.showLocalExample();
           myLesson5.showLocalWithParameter(10, 12);
           int example = myLesson5.showLocalReturn(15, 8);
           System.out.println(example);
           myLesson5.showInstanceVariable();
           myLesson5.showConversion();
       }


       public static void lesson4Examples()  {
               // write your code here
        System.out.println("Welcome to java");
        System.out.println("This is my first sentence");
        System.out.println("I am new to java");
        System.out.println("This java course is cool");
        System.out.println("I am learning stuff everyday");



    }
}
