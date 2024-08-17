import java.util.Scanner;
public class logical{
    public static void main(String[] args){
       Scanner ss =new Scanner(System.in);
       System.out.println(" please enter you 1st number to check odd or even");
       int a=ss.nextInt();
// if (a>=34){
// System.out.println("not applicable for sex or marriage");}
// else if (a>=30&&a<34){
//     System.out.println("get marraige soon");}
//     else if(a>0&&a<18 ){
//         System.out.println("studying is waste try doing or building a bussiness");}
//         else if(a>18&&a<30) {
//             System.out.println("fuck hard ,fuck every bitch you like try to love have good relation cheat on partner do what ever youy want ");

//         }
//         else{
//             System.out.println("not applicable for sex or marriage");
System.out.println(" please enter you 2nd number to check odd or even");
int b=ss.nextInt();
if ((a%2)==0&&(b%2)==0){
System.out.println("both are even numbers");
}
else if ((a%2)==0&&(b%2)!=0){
    System.out.println(" first number is even but 2nd one is not an even number");
}
else if ((a%2)!=0&&(b%2)==0 ){
    System.out.println("2nd number you entered is is even and 1st number is odd");
}
else {
    System.out.println(" both are odd numbers");
}

        }

    }



            
