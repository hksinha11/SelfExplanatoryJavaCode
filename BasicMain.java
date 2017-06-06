import java.io.*;
import java.lang.*;
import java.util.*;

class BasicMain{ // The name of the class where main is defined should be name as the file name 
   int a;
   int b;
   BasicMain(int a ,int b)   //Definition of a contructor and it itself carries paramter which results in intialization of variables 
   {                         //by calling it in the main method!!
      this.a=a;
      this.b=b;
   }
   public int add( int a, int b)   // A function with two parameters
   {
    return a+b;
   }
   public int add()                //A function without parameters 
   {
    return a+b;
   }
   public static void main(String[] args)
   {
        BasicMain obj = new BasicMain(5,6);
        int res1 = obj.add(5,6); //returns 11
        int res2 = obj.add();  // returns 11
        System.out.println(" Parameterized function result is "+res1);
        System.out.println(" Function without parameters result is "+res2);
   }
 }
 //Overriding the add function in two ways also covers the concept of polymorphism!
