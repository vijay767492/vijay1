public class stringss2 {
    public static void main(String[] args) {
        String name ="the president of india is vijay";
        System.out.println(name);
        String ss=new String("when to become rich");
        System.out.println(ss);
        //string methods
        String a="name of this is cAlled as the shit       ";
        int b= a.length();
     
        System.out.println(b);
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.trim());//it removes the spaces in string
        System.out.println(a.substring(3,12 ));
        System.out.println(a.replace('i','Z' ));// replacing the any charecter we want in string
        System.out.println(a.replace("i","Zh" ));//for replacing the one charecter with multiple letters
        System.out.println(a.charAt(10));//tells given index number charecter (or) letter
        System.out.println(a.indexOf('i' ));//tels which letter has which index number 
        System.out.println(a.equals("cAlled" ));








    }
}
