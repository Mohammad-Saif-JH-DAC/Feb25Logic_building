class Fibonacci{
public static void main (String args[]){
int z=0;
int a = 1;
for(int i =0; i<10; i++){
System.out.println(z);
int y=a+z;
z=a;
a=y;

}
}
}