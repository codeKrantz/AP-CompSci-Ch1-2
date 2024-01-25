// this us all the notes from chapter 1
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

//We can use a concatenation operator, the +, to combine a string with a variable inside of the print statement.
System.out.println(one+" "+oneHalf+" "+stringOne);
System.out.println("----------------------------------------");

}



}