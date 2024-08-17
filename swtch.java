import java.util.Scanner;
public class swtch {
    public static void main(String[] args) {

       Scanner ss=new Scanner(System.in);
       System.out.println("please enter yore age :");
        int a=ss.nextInt();
switch (a){
    case 18:
    System.out.println("enjoy");
    break;
    case 32:
    System.out.println("find peace");
    break;
    case 60:
    System.out.println("rip");
    break;
}
System.out.println("vijay");
//or
Scanner ss=new Scanner(System.in);
System.out.println("please enter yore age :");
 int a=ss.nextInt();
switch (a){
case 18->{System.out.println("enjoy");}

case 32->{System.out.println("find peace");}

case 60->{
System.out.println("rip");
}
}
System.out.println("vijay");



    }
}
