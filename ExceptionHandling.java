package com.demo;
// marker interface-
// A marker interface in Java is an interface that does not have any abstract methods. It is used to provide additional information about a class.
//Marker interfaces are also known as tagging interfaces.
//class extendz class
//class implements interface
//interface extends interface


/*
interface parent
{
	
}
interface child extends parent
{
	
} 
class abc
{
	
}
*/

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            Integer i = new Integer("abc");
        } catch (NumberFormatException ns) {
            System.out.println("String Value");
            return; // Add a return statement to exit the program after catching the exception
        }
        System.out.println("Hello");
    }
}
