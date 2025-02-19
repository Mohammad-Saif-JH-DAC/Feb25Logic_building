import java.util.Scanner;
class section2{
public static void main(String args[]){
/*
//Grade Classification
int a =91;
if(a>=90){System.out.println("A");}
else if(a>=80 && a<=89){System.out.println("B");}
else if(a>=70 && a<=79){System.out.println("C");}
else if(a>=60 && a<=69){System.out.println("D");}
else{System.out.println("F");}
*/

/*
//Days of the Week
int a=2;
switch(a){
case 1: System.out.println("Monday");System.out.println("Week Day");break;
case 2: System.out.println("Tuesday");System.out.println("Week Day");break;
case 3: System.out.println("Wednesday");System.out.println("Week Day");break;
case 4: System.out.println("Thursday");System.out.println("Week Day");break;
case 5: System.out.println("Friday");System.out.println("Week Day");break;
case 6: System.out.println("Saturday");System.out.println("Weekend");break;
case 7: System.out.println("Sunday");System.out.println("Weekend");break;
default : System.out.println("Invalid Number");
}
*/

/*
//Calculator

Scanner scanner = new Scanner(System.in);
System.out.print("Enter operator (+, -, *, /): ");
char op = scanner.next().charAt(0); 
System.out.print("Enter two numbers: ");
double num1 = scanner.nextDouble();
double num2 = scanner.nextDouble();

        switch (op) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0)
                    System.out.println("Result: " + (num1 / num2));
                else
                    System.out.println("Error: Division by zero!");
                break;
            default:
                System.out.println("Invalid operator!");
        }

        scanner.close();
*/

/*
Discount Calculation
Scanner scanner = new Scanner(System.in);
System.out.println("Enter Total purchase amount ");
int x = scanner.nextInt();

System.out.println("Do you have membership card (Y/N)?");
char y = scanner.next().charAt(0);
int z = 0;

if(x>=1000){
z=20;}
else if(x>=500 && x<=999){
z=10;}
else{
z=5;}
if(y=='Y'){z=z+5;}
System.out.println("Total discount is : "+z);
*/

/*
//Student pass or fail using nested switch
  Scanner scanner = new Scanner(System.in);

        // Input grades for three subjects
        System.out.print("Enter marks for Subject 1: ");
        int sub1 = scanner.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int sub2 = scanner.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int sub3 = scanner.nextInt();

        // Count number of failed subjects
        int failedCount = 0;
        failedCount += (sub1 < 40) ? 1 : 0;
        failedCount += (sub2 < 40) ? 1 : 0;
        failedCount += (sub3 < 40) ? 1 : 0;

        // Main switch to check the number of failed subjects
        switch (failedCount) {
            case 0:
                System.out.println("Status: PASS");
                break;
            default:
                System.out.println("Status: FAIL");
                // Nested switch to display the number of failed subjects
                switch (failedCount) {
                    case 1:
                        System.out.println("Failed in 1 subject.");
                        break;
                    case 2:
                        System.out.println("Failed in 2 subjects.");
                        break;
                    case 3:
                        System.out.println("Failed in all 3 subjects.");
                        break;
                }
        }

        scanner.close();

}
} */