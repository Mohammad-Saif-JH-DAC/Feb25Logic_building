/*

Section 1 
____________________________________________________________________________________

public class Main {
public void main(String[] args) {
System.out.println("Hello, World!");
}
}
#Error: Main method is not static in class Main, please define the main method as:
   public static void main(String[] args)

Corrected
public class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");
}
}
*/

/*
public class Main {
static void main(String[] args) {
System.out.println("Hello, World!");
}
}
#Error: Main method not found in class Main, please define the main method as:
public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

Corrected
public class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");
}
}
*/

/*
public class Main {
public static int main(String[] args) {
System.out.println("Hello, World!");
return 0;
}
}
Error: Main method must return a value of type void in class Main, please
define the main method as:
   public static void main(String[] args)

Corrected

public class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");
}
}
*/

/*
public class Main {
public static void main(String[] args) {
System.out.println("Main method with String[] args");
}
public static void main(int[] args) {
System.out.println("Overloaded main method with int[] args");
}
}
Output : Main method with String[] args
*/

/*
public class Main {
public static void main(String[] args) {
int x = y + 10;
System.out.println(x);
}
}
Main.java:70: error: cannot find symbol
int x = y + 10;
        ^
  symbol:   variable y
  location: class Main
1 error
Corrected:

public class Main {
public static void main(String[] args) {
int y =5; //Initialize first
int x = y + 10;
System.out.println(x);
}
}
*/

/* public class Main {
public static void main(String[] args) {
int x = "Hello";
System.out.println(x);
}
}
Error: Wrong datatype
Corrected:
public class Main {
public static void main(String[] args) {
String x = "Hello";
System.out.println(x);
}
}
*/


/*
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!"       }
}
error: ';' expected
    System.out.println("Hello, World!"
                                        ^
error: reached end of file while parsing

Corrected:
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");  
    }
}

*/

/*
public class Main {
public static void main(String[] args) {
int class = 10;
System.out.println(class);
}
}
error: <identifier> expected
    int class = 10;
        ^
Corrected : 
public class Main {
public static void main(String[] args) {
int class1 = 10;
System.out.println(class1);
}
}


public class Main {
public void display() {
System.out.println("No parameters");
}
public void display(int num) {
System.out.println("With parameter: " + num);
}
public static void main(String[] args) {
display();
display(5);
}
}
Error:error: non-static method display() cannot be referenced from a static context
        display();
        ^
error: non-static method display(int) cannot be referenced from a static context
        display(5);
        ^
Corrected: 
public class Main {
    public static void display() {  
        System.out.println("No parameters");
    }
    
    public static void display(int num) {  
        System.out.println("With parameter: " + num);
    }

    public static void main(String[] args) {
        display();     
        display(5);
    }
}

public class Main {
public static void main(String[] args) {
int[] arr = {1, 2, 3};
System.out.println(arr[5]);
}
}
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
	at Main.main(Main.java:4)
Corrected:
public class Main {
public static void main(String[] args) {
int[] arr = {1, 2, 3};
System.out.println(arr[2]);
}
}

public class Main {
public static void main(String[] args) {
while (true) {
System.out.println("Infinite Loop");
}
}
}
Op: Infinite loop
Correction : Avoid usage of true in while condition and put a valid condition whose state would change after every iteration.

public class Main {
public static void main(String[] args) {
String str = null;
System.out.println(str.length());
}
}
Exception in thread "main" java.lang.NullPointerException
    at Main.main(Main.java:4)
Correction : Give proper String value to str.



public class Main {
public static void main(String[] args) {
double num = "Hello";
System.out.println(num);
}
}
Main.java:3: error: incompatible types: String cannot be converted to double
    double num = "Hello";
                 ^
1 error
Correction : 
Use string instead of double.


public class Main {
public static void main(String[] args) {
int num1 = 10;
double num2 = 5.5;
int result = num1 + num2;
System.out.println(result);
}
}
Main.java:4: error: incompatible types: possible lossy conversion from double to int
    int result = num1 + num2;
                           ^
1 error
Correction:
Make result of type double on explicitly convert  num2 to int.

public class Main {
public static void main(String[] args) {
int num = 10;
double result = num / 4;
System.out.println(result);
}
}
OP --> 2.0 (Expected 2.5)
Correction:
Make num or 4 to double so that division must be in float or double.


public class Main {
public static void main(String[] args) {
int a = 10;
int b = 5;
int result = a ** b;
System.out.println(result);
}
}
error: bad operand types for binary operator '**'
    int result = a ** b;
                  ^
  first type:  int
  second type: int
Correction: use of Math.pow()

public class Main {
public static void main(String[] args) {
int a = 10;
int b = 5;
int result = a + b * 2;
System.out.println(result);
}
}
OP-->20


public class Main {
public static void main(String[] args) {
int a = 10;
int b = 0;
int result = a / b;
System.out.println(result);
}
}
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at Main.main(Main.java:5)
Solution : No solution as division by 0 is not allowed.


Snippet 21:
public class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");
// Missing closing brace here
}
error: reached end of file while parsing
Correction : Close all the brackets.

public class Main {
    public static void main(String[] args) {
        static void displayMessage() {  
            System.out.println("Message");
        }
    }
}
error: illegal start of expression
        static void displayMessage() {
        ^
Correction : 

public class Confusion {
public static void main(String[] args) {
int value = 2;
switch(value) {
case 1:
System.out.println("Value is 1");
case 2:
System.out.println("Value is 2");
case 3:
System.out.println("Value is 3");
default:
System.out.println("Default case");
}
}
}
OP-->2,3, Default Case. //Because break statement is not given.
Solution : Give break statement in each case.

public class MissingBreakCase {
public static void main(String[] args) {
int level = 1;
switch(level) {
case 1:
System.out.println("Level 1");
case 2:
System.out.println("Level 2");
case 3:
System.out.println("Level 3");
default:
System.out.println("Unknown level");
}
}
}
 Error to Investigate: When level is 1, why does it print "Level 1", "Level 2", "Level 3", and
"Unknown level"? What is the role of the break statement in this situation?
Solution : Again no use of break creates fall through effect. Use of break statement prevent this situation.

Compilation Error:
Cannot switch on a value of type double. 
Only convertible int values, strings, or enum constants are permitted.

public class Switch {
public static void main(String[] args) {
int number = 5;
switch(number) {
case 5:
System.out.println("Number is 5");
break;
case 5:
System.out.println("This is another case 5");
break;
default:
System.out.println("This is the default case");
}
}
}
 Error to Investigate: Why does the compiler complain about duplicate case labels? What
happens when you have two identical case labels in the same switch block?
Error :Duplicate case label.

Solution : Use different case value.

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++




