import java.util.Scanner;
public class looppract1 {
public static void main(String[] args) {
    problem number one inverted rightangle with star using just while loop
    int a=5;
    while( a>0){ 
    //    System.out.print("g");
    //    System.out.print("\n");
       

       int b=0;
       while(b<a){
        System.out.print("* ");
       
        b++;}
        a--;
        System.out.println("\n");
    }
    sum of all first n even numbers using while loop 
int a=0;
int i=10;
int sum=0;
while (i>a){System.out.println(a*2);

sum=sum+(a*2);
a++;
}
System.out.println("the sum of first n: "+ sum);


    sum of all first n even numbers using for loop 
    Scanner ss=new Scanner(System.in);
    int sum=0;
    System.out.print(" enter the number :");
    int a=ss.nextInt();
    for (int i=0; i<a; i++){System.out.println(i*2);
sum=sum+i*2;
    }
    System.out.println("sum of first 10 numbers which are even is :"+sum);

multiplication table upto 10 of given number n 
int sum=0;
int a=4;
for (int i=0; i<=10;i++) {
sum=4*i;
System.out.println("4*"+i+"="+sum);

}
while loop
int i=0;
while(i<=10){
    sum=a*i;
    System.out.println("4*"+i+"="+sum);
    i++;

do while loop
int a=4;
int mul=0;
int i=1;
do{
    mul=a*i;
    System.out.println("4*"+i+"="+mul);
    i++;
}while(i<=10);
multiplication of table n in reverse order
int a=4;
int sum=0;
for (int i=10; i>=0;i--  ){
    sum=a*i;
    System.out.println("4*"+i+"="+sum);}
write a program to find the factorial of given number 
int a=5;
int  sum=1;
for (int i=1;a>=i;i++){ 
    sum=sum*i ;
    }
    System.out.println(sum);
write a program to sum the multiplication table of 8

int sum=0;
int a=8;
for (int i=0; i<=10;i++) {
sum=a*i +sum;
}System.out.println("the of multiples of 8 upto 10 is "+sum);

int date=09/20023;
System.out.println(date);
}}
