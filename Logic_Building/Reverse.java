class Reverse{
public static void main (String args[]){
int a = 12345;
int b = 0;
int c =0;
while(a!=0){
c=a%10;
b = b*10+c;
a=a/10;
}
System.out.println(b);
}
}