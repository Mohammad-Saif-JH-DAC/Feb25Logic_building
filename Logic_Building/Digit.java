class Digit{
public static void main (String args[]){
int a = 123456;
int count = 0;
while(a!=0){
count +=1;
a=a/10;
}
System.out.println("Total digits are : "+count);
}
}