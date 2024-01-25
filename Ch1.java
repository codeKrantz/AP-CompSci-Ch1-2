// this us all the notes from chapter 1

import javax.swing.plaf.TreeUI;

public class Ch1{

public static void main(String[] args){
    
    // this is an example of a short commet

    /*
     This
     Is
     An
     Example
     Of
     A
     Long
     Comment!
     */


/*
 * Compiling: the process of “translating” code into binary
Since modern programming IDEs have interpreters built in, programmers do not need to understand code directly.


Compile-time error:
Compiling is halted if one or more errors are found. It produces an error message for each one 
(this is the “interactive” part of IDE). These errors found during compiling are called compile-time errors.


Other Errors:
Logical Erros- these erros emerge when the human programmer makes a logical mistake in their code
Run time errors - basically an infinat loop where the code is never done 
 */



// Output
System.out.println("Hello "); // println() means that the output will go on a brand new line. also ends the line  print() is used
System.out.print("Beautiful ");
System.out.print("World"); // print() simply means the output will be put on the current line
System.out.println("--------------------------------------");

// outside of using "" variables will print their value and number like 3 simply print their value
//However if a varibale like side1 exists it will not print because of the number 1



// Variable assingment
//ALL varibales must have a assigned data type to an identifier
// SYNTAX: type identifier = data; / the = opereratior assigns value and the ; denotes the end of a line
//example:

int one = 1;
double oneHalf = 1.5;
String stringOne = "One";
//added int other forgoten examples
boolean truth = true;
char letter = 'C';
//We can use a concatenation operator, the +, to combine a string with a variable inside of the print statement.
System.out.println(one+" "+oneHalf+" "+stringOne);
System.out.println("----------------------------------------");

//Basic Operators
/*
 * Add: +
 * Subtract: -
 * Mult: *
 * Division: /
 * Modulo: %
 */
System.out.println(5%4);
// rounds down to one because they are just integers

// we can get around this issue by casting
System.out.print(3 - (double) (5)/4);
// now it prints the full value
System.out.println("Review Questoions---------------");

/*
 * Consider the following code segment:
int a = 10;
double b = 10.7;
double c = a + b;
int d = a + c;
System.out.println(c + “ “ + d);

What will be the output as a result of executing the code segment?
A. 20    20
B. 20.0    30
C. 20.7    31
D. 20.7    30.7
E. Nothing will be printed because of a compile-time error
 */




 
// My answer = E because you can not add an int to a double and save to an int because of promotion



/*
 * Consider the following code segment:
int a = 10;
double b = 10.7;
int d = a + b;

Line 3 will not compile in the code segment above. With which of the following statements 
could we replace this line so that it compiles?

int d = (int) a + b;
int d = (int) (a + b);
int d = a + (int) b;



I only
II only
III only
I and III only
II and III only

 */

 //My answer = I andd III only because that is the only options that cast apropriatly







 /*
  * Consider the following code segment:
int a = 11;
int b = 4;
double x = 11;
double y = 4;
System.out.print(a / b);
System.out.print(“, “);
System.out.print(x / y);
System.out.print(“, “);
System.out.print(a / y);


What is printed as a result of executing the code segment?
3, 2.75, 3
3, 2.75, 2.75
2, 3, 2
2, 2.75, 2.75
Nothing will be printed because of a compile-time error

  */


  //My answer = 2, 2.75, 2.75 because this is the only option that casts and promots correctly
  int a = 11;
int b = 4;
double x = 11;
double y = 4;
System.out.print(a / b);
System.out.print(",");
System.out.print(x / y);
System.out.print(", ");
System.out.print(a / y);






/*
 * Consider the following code segment:
int i = x % 50;
If x is a positive integer, which of the following could NOT be the value of i after the statement executes?
0
10
25
40
50

 */

// My answer = 0 because modulo can never equal zero as it would possibly be undefined



}



}