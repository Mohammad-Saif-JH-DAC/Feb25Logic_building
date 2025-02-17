class Prime{
public static void main(String args[]){
int a = 17;
boolean x = false;
for(int i = 2;i<a;i++){
if(a%i==0){
x = true;}
}
if(x){System.out.println("Not a Prime");}
else{System.out.println("Prime");}
}
}