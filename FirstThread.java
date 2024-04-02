package com.threaddemo;
//MultiThreading in java
//few Terminologies
/*
1-Application
Application is a program which is designed to perform a specific task. 
For example, MS Word, Google Chrome, a video or audio player etc.

2-Process
Process is an executing instance of an application. 
For example, when you double click MS Word icon in your computer, 
you start a process that will run this MS word application. 

3-Thread
Thread is a smallest executable unit of a process. 
Thread has it’s own path of execution in a process. 
For example, when you start MS word, operating system creates 
a process and start the execution of a primary thread of that process. 
. A process can have multiple threads.

Multitasking :
Multitasking is an operation in which multiple tasks 
are performed simultaneously.

Multitasking can be of two types.

Process-based multitasking Or Multiprocessing :
In process-based multitasking or multiprocessing,
 Multiple processes are executed simultaneously.
 For example, You can play a video file and print
  a text file simultaneously in your computer.
 
 
Thread-based Multitasking  Or Multithreading:
In thread-based multitasking or multithreading, 
multiple threads in a process are executed simultaneously.
For example, MS word can print a document using background thread,
 at the same another thread 
can accept the user input so that user can create a new document.


*/
public class FirstThread {
/*we have started 1 thread 
all the task is inside the main method
so far we were using single thraeded programming 
main was our single thread

how to craete multiple threads in java
there are 2 ways we can create the thraed in java
1 way is by extending Thread class
2 way is by implemetimg Runnable interface

When you run this program, java command creates a primary thread 
or main thread which is responsible for executing main method.
 That’s why, execution of all java programs start with main() method.

This is an example of single thread execution.
 Java supports multi thread execution. i.e Java program can 
 have more than one threads that can run simultaneously. 
 This is called multithreaded programming.
*/
	public static void main(String[] args) {
		
		for(int i=0; i<=5;i++)
		{
			System.out.println(i);
		}
	}

}
