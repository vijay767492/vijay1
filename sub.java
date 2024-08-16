import java.util.Scanner;

public class sub {
    public static void main(String[] args) {
       
        //int a=60;
            //a+=10;
            //System.out.println(a);
            //comparistion operators
              //System.out.println(9<=10);
//logical operator

//System.out.println(9>=10 &&99==99);
//System.out.println(9<=10 || 9>=10);
//or
//boolean a=(9>=10);
//boolean b=(99==99);
//System.out.println(a || b);
// order of precedent
// int a =6*5 -34/2;
// System.out.println(a);
// increamnet & decreament
// int a=10;

// System.out.println(a);
// System.out.println(a++);
// System.out.println(a);
//    we can also do it for the char
// char ch='f';
// System.out.println(++ch);
// float f=7/4f*9/2f;
// System.out.println(f);
Scanner ss=new Scanner (System.in);
System.out.println("please enter the first number :");
int a=ss.nextInt();
System.out.println("please enter the 2nd number :");
int b=ss.nextInt();
 if (a>b){
 System.out.println("first number is greater than 2nd one :"+a+">"+b);}
 else if(a==b) {
    System.out.println("1st and 2nd numbers are equal :"+a+"="+b);}
else{
    System.out.println("2nd number is greater than 1st one :"+a+"<"+b);
}
 }

}
