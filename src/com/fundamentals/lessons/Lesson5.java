package com.fundamentals.lessons;

/*
* The content of this class is for the lesson 5 slide deck
* Primitive data Types
*/
public class Lesson5 {

    // This primitive type can be true or false only .
    boolean myBoolean = true;

    // This primitive type has a value range of 0 to 65535
    char myChar = 'c';

    // This primitive type has a value range of -128 to 127
    byte myByte = 9;

    // This primitive type has a value range of -32768 to 32767
    short myShort = 235;

    /*
    *  This primitive type has a value range of
    *  -2,147,483,648 to 2,147,483,647 * */
    int myInt=2345;

    /* This primitive types has a value range of
    * -9,223, 372,036,854,775,808, to 9,223,372,036,854,775,807 */
    long myLong = 56864L;

    // This primitive type value range varies
    float mtFloat = 34.53F;

    // This primitive type value range varies
    double myDouble = 36.43D;
    double myOtherDouble = 84.98;

     //Decimal value of 26
    int value = 26;

    // Hexadecimal value of 26
    int value3 = 0x1a;

    // Binary value of 26
    int value2 = 0b11010;

    // Octal value of 26
    int value4 = 032;

    // scientific Notation use E or e
    double d2 = 23.65E8;

   // Using underscores to make the number readable
   long l2 = 4_568_987-367L;

   // This method shows a local variable
   public void showLocalExample() {
        int able = 20;
        System.out.println(able);
    } // end method

    // This method has 2 parameters and uses a local variable
    public void showLocalWithParameter(int able, int beta) {
           int total = able + beta;
           System.out.println(total);
     }

     // This method has a return type of int
     public int showLocalReturn(int type1, int type2) {
        return type1 + type2;
      }

     // This method instance variables and changes value.
     public void showInstanceVariable() {
         System.out.println("Before");
         System.out.println(myInt);
         System.out.print("After");
         myInt = 14;
         System.out.println(myInt);
     }// end method

        // Method shows implicit & explicit conversion
        public void showConversion() {
          long val = myInt; // implicit or widening conversion
          int delta = (int)myLong; // explicit or narrowing conversion
          //int echo = (int) l2; // explit conversion overflow
          //System.out.println(echo);  // 274.028
            int foxtrot = (int)myDouble;
            System.out.println(foxtrot); //original 36.43 actual 36
         }
}