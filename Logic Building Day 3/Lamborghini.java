/*
SECTION 3: Lamborghini Exercise:
*/



public class Lamborghini{
public static void main(String args[]){


/*
1. Write a program to calculate the sum of the first 50 natural numbers:
int total =0;
for(int i =1; i<=50; i++){
total += i;
}
System.out.println("Sum of first 50 natural no. : "+total);
*/

/*
2. Write a program to compute the factorial of the number 10.
int total =1;
for(int i =1; i<=10; i++){
total *= i;
}
System.out.println("Factorial of 10 : "+total);
*/

/*
3. Write a program to print all multiples of 7 between 1 and 100.

for(int i =1;i<15; i++){
if(7*i>100){break;}
System.out.print(7*i + " ");
}
*/


/*
4. Write a program to reverse the digits of the number 1234. The output should be 4321.
int a=0;
int b=1234;
while(b>0){
a=a*10+(b%10);
b=b/10;
}
System.out.println(a);
*/


/*
5. Write a program to print the Fibonacci sequence up to the number 21.
int x=0; //first
int y =1; //second
int z=0;
System.out.print("Fibonacci Series: " + x + " " + y + " ");
while(z<21){
z=x+y;
System.out.print(z+" ");
x=y;
y=z;
}

*/
/*
 6. Write a program to find and print the first 5 prime numbers.
 int count = 0;
        int num = 2; 

        while (count < 5) {  // Loop to find first 5 primes
            boolean isPrime = true;

            for (int i = 2; i * i <= num; i++) {  
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            } 
            if (isPrime) {  
                System.out.println(num);
                count++;
            }

            num++; 
        }
*/

/*
7. Write a program to calculate the sum of the digits of the number 9876. The output should be 30 (9 + 8 + 7 + 6).
int a=0;
int b=9876;
while(b>0){
a=a+(b%10);
b=b/10;
}
System.out.println(a);
*/

/*
8. Write a program to count down from 10 to 0, printing each number.
for(int x=10;x>=0;x--){System.out.println(x);}
*/

/*
9. Write a program to find and print the largest digit in the number 4825.
int a=0;
int b=4825;
while(b>0){
if(a<b%10){
a=(b%10);}
b=b/10;
}
System.out.println(a);
*/

/*
10. Write a program to print all even numbers between 1 and 50.
for(int i=1;i<50;i++){
if(i%2==0){
System.out.println(i);}
}
*/

/*
11. Write a Java program to demonstrate the use of both pre-increment and post-   decrement operators in a single expression.
int count = 0;
for (int i = 0; i < 4; i++) {
count += i++ - ++i;
}
System.out.println(count); //O/P: -4
*/

/*
12. Write a program to draw the following pattern:
*****
*****
*****
*****
*****


for(int i=0;i<5;i++){
for(int j=0; j<5; j++){
System.out.print("*");
}
System.out.println();
}
*/

/*
13. Write a program to print the following pattern:
11111
22222
33333
44444
55555

for(int i=1;i<6;i++){
for(int j=0; j<5; j++){
System.out.print(i);
}
System.out.println();
}

*/

/*
14. Write a program to print the following pattern:
*
**
***
*****
*******
*********

for(int i=0;i<=6;i++){
for(int j=0; j<i; j++){
System.out.print("*");
}
System.out.println();
}
*/

/*
15. Write a program to print the following pattern:
1
22
333
4444
55555


for(int i=0;i<6;i++){
for(int j=0; j<i; j++){
System.out.print(i);
}
System.out.println();
}
*/

/*
16. Write a program to print the following pattern:
1
12
123
1234
12345

for(int i=1;i<=6;i++){
for(int j=1; j<i; j++){
System.out.print(j);
}
System.out.println();
}
*/

/*
17. Write a program to print the following pattern:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15


int count=1;
for(int i=1;i<=6;i++){
for(int j=1; j<i; j++){
System.out.print(count+" ");
count++;
}
System.out.println();
}
*/

/*
19. Write a program to print the following pattern:
1
1*2
1*2*3
1*2*3*4
1*2*3*4*5



for(int i=1;i<6;i++){
for(int j=1; j<=i; j++){
System.out.print(j);
if(j<i){System.out.print("*");}

}
System.out.println();
}
*/


/*
20. Write a program to print the following pattern:
1
1*3
1*3*5
1*3*5*7
1*3*5*7*9


for(int i=1;i<6;i++){
int m=1;
for(int j=1; j<=i; j++){
System.out.print(m);
m+=2;
if(j<i){System.out.print("*");}

}
System.out.println();
}

*/

/*
21. Write a program to print the following pattern:
5
5*4
5*4*3
5*4*3*2
5*4*3*2*1

for(int i=1;i<6;i++){
int m=5;
for(int j=1; j<=i; j++){
System.out.print(m);
m-=1;
if(j<i){System.out.print("*");}

}
System.out.println();
}

*/


/*
22. Write a program to print the following pattern:
   *
  **
 ***
****

for(int i=1;i<5;i++){

for(int j =4-i;j>0;j--){
System.out.print(" ");
}
System.out.print("*".repeat(i));
System.out.println();
}
*/

/*
23. Write a program to print the following pattern:
    *
   ***
  *****
 *******
*********

int count=1;
for(int i=1;i<5;i++){

for(int j =4-i;j>0;j--){
System.out.print(" ");
}
System.out.print("*".repeat(count));
count +=2;
System.out.println();
}
*/

/*
24. Write a program to print the following pattern:
*********
 *******
  *****
   ***
    *

int count=9;
for(int i=5;i>0;i--){

for(int j =5-i;j>0;j--){
System.out.print(" ");
}
System.out.print("*".repeat(count));
count -=2;
System.out.println();
}

*/

/*
25. Write a program to print the following pattern:
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *


int count=1;
for(int i=1;i<5;i++){

for(int j =5-i;j>0;j--){
System.out.print(" ");
}
System.out.print("*".repeat(count));
count +=2;
System.out.println();
}
int count1=9;
for(int i=5;i>0;i--){

for(int j =5-i;j>0;j--){
System.out.print(" ");
}
System.out.print("*".repeat(count1));
count1 -=2;
System.out.println();
}
*/

/*
26. Write a program to print the following pattern:
1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
5*5*5*5*5
4*4*4*4
3*3*3
2*2
1
*/

for(int i=1;i<6;i++){
for(int j=1; j<=i; j++){
System.out.print(i);
if(j<i){System.out.print("*");}

}
System.out.println();
}

for(int i=1;i<6;i++){
int x=6-i;
for(int j=6-i; j>0; j--){
System.out.print(x);
if(j>1){System.out.print("*");}

}
System.out.println();
}

*/

}
}









