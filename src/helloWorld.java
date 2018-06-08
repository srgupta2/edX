public class helloWorld { // class, same name as file, program
    public static void main(String[] args){ //main method, group of statements

        System.out.println("Hello, World"); //don't forget ; at end of statements

        int x = 10;
        int y = 5;
        int z = x + y;

        x =  z - y;
        y = x + z;
        z = 2 * z;

        System.out.println(x + "and" + y + "and" +z);

    }
}
/* use a backslash(\) as an escape sqnce for special characters

String is anything between quotation marks
void methods have no return value
public static void methodName(){} --written outside of main
calling a method: methodName(); -- methods called inside of main

Data types
Integer (int): whole numbers, neg. included
Double (double): real numbers, decimals, neg. included
Character (char): single characters (letters, symbols, spaces)
 - string objects made of char characters
 Boolean: true or false values
 Modulus (%): divides two numbers and returns remainder
 - x%2 = 0 if no remainder ergo (x is) even, 1 if odd...
 - Truncation: divide, decimal, it cuts off (doesn't round)
 Concatenation: use + to put together strings
 int and double = double
 Mix with string results in a string

 Variable: name, type, can be given a value, piece of memory
 - updating the variable/output, especially after iterating through a loop
 - global vs local(in method) scope
 Casting: converting data by ex. double y = (double) 3*4

 String strVar;
 strVar = "Hello World!"
 System.out.print(strVar);

 Constants:
 public static final type NAME = XX;

 In practice BJP4 2.13: valuesOfABC, output of C is 16
 - C = b = 9 after b-1 and a = 7 after a+1 twice

 - Operators follow PEMDAS, Mod is same level as MD, so PMMDAS
 - remember truncation if not a double and the .0 if a double

 Scanner:
 above class: import java.util.Scanner;
 in main method: Scanner name = new Scanner(System.in); (in a sense, creates an object)
 in another method: String name = (nameScanner = input) input.next();
 System.out.println("Hello" + name);
 ---DECLARE A NEW SCANNER IN EVERY METHOD AND NOT JUST MAIN??????------

 input.nextInt();, input.nextDouble(); input.nextLine(); = string w/ spaces

---create functions outside of main method, but call them in main....

MODULE 2:

Booleans: (true or false)
==, !=, ><, <=, >=

Strings compared with: string1.equals("string2");
- equalsIgnoreCase, startsWith, endsWith, contains

IF STATEMENTS: depends on boolean condition
- if--> else if--> else

Loops:
while(){statement, update variable}, var declaration outside of loop (otherwise resets every time)
for (int i = 1, i<30, i++){}

-setting a var for user input, using that as the loop limit
ex. int x = input.nextInt(); and then for (int i = 0; i<x; i++){}...

Mod 3:

Parameters
-inside of () of method, need to pass in when call method
- function name(type name){}
-if declare a variable in main method and function,
a change in parameter does not affect main method??
- only w/in scope of function

Returns:
- instead of void, put data type returning; ex. public static int(){}
- at end: return data;
- "capture" data: var = functionName(parameter);

s
 */

// put these files on Git for own laptop :P..maybe write up notes too