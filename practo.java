import java.util.Scanner;
public class practo {
    public static void main(String[] args) {
Scanner ss=new Scanner(System.in);
System.out.print("please enter youre english marks :");
 Float english=ss.nextFloat();
 System.out.print("please enter youre maths marks :");
 Float maths=ss.nextFloat();
 System.out.print("please enter youre science marks :");
 Float science=ss.nextFloat();
 Float total1=(english+maths+science)/300;
     Float per=total1*100;
  if (english>33 && english<100 && maths>33&& maths<100&& science>33&&science<100){
    
     System.out.println(" youre pass couse you got above 33% in every subject yore score "+per+"%");
  } 
else if(english<33 && english<100 && maths>33&& maths<100&& science>33&&science<100) {
    System.out.println("you failed in english you got "+english+" you  need at least 33 marks \n youre total score is :"+per);
} else if(english>33 && english<100 && maths<33&& maths<100&& science>33&&science<100) {
    System.out.println("you failed in maths you got "+maths+" you  need at least 33 marks \n youre total score is :"+per);}
    else if(english<33 && english<100 && maths>33&& maths<100&& science<33&&science<100) {
        System.out.println("you failed in science you got "+science+" you  need at least 33 marks \n youre total score is :"+per);
    }else{
        System.out.println("please enter correct number ,or you typed wrong number ");
    }
        
    }
    
}
