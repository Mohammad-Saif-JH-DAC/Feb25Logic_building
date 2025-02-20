class Swaptwo{
public static void main(String args[]){
int a = 10;
int b = 20;
System.out.println("Your Numbers before swapping "+a+" "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("Your Numbers after swapping "+a+" "+b);
}
}