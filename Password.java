package bootcampday3examples;

import java.util.Scanner;
public class Password {

public static void main(String[] args) {
    // TODO Auto-generated method stub
    int min =8;
    int max=16;
    int digit=0;
    int special=0;
    int upCount=0;
    int loCount=0;
    String password;
    Scanner scan = new Scanner(System.in);
    System.out.println(" Enter Your Password:");
        password = scan.nextLine();
    if(password.length()>=min&&password.length()<=max){
        for(int i =0;i<password.length();i++){
            char c = password.charAt(i);
            if(Character.isUpperCase(c)){
                upCount++;
            }
            if(Character.isLowerCase(c)){
                loCount++;
            }
            if(Character.isDigit(c)){
                digit++;
            }
            if(c>=33&&c<=46||c==64){
                special++;
            }
        }
        if(special==1&&loCount==1&&upCount==1&&digit==1){
            System.out.println("valid");
        }
        else{
        	System.out.println("notvalid");
        }
    }

    if(password.length()<min){

        for(int i =0;i<password.length();i++){
            char c = password.charAt(i);
            if(Character.isLowerCase(c)){
                loCount++;
            }
            }

        if(loCount>0){
            System.out.println(" Password must be atleat "+min+" characters:");
            System.out.println(" You need atleast one upper case chracter:");
            System.out.println(" You need atleast one digit:");
            System.out.println(" You need atleast one special chracter:");
    }
    }
    else if(password.length()<min&&upCount>1){
        for(int i =0;i<password.length();i++){
        char c =password.charAt(i);
        if(Character.isLowerCase(c)){
            loCount++;
        }
         if(Character.isUpperCase(c)){
            upCount++;
        }
        }
        if(loCount>0&&upCount>0){
        System.out.println(" Password must be atleast "+min+" chracters:");
        System.out.println(" You need atleast one digit:");
        System.out.println(" You need atleast one special chracter:");
    }
    }
     if(password.length()>max||password.length()>=max&&upCount>1&&loCount>1&&digit>1){
         System.out.println(" Password is too long.Limit is "+max+" chracters:");
                 System.out.println(" You need atleast one special chracter:");

        }
      if(password.length()>=min&&password.length()<=max&&loCount>0&&upCount>0&&digit>0&&special==0){
         System.out.println(" You need atleast a special chracter");
     }
      if(password.length()>=min&&password.length()<=max&&loCount>0&&upCount>0&&digit==0&&special==0){
         System.out.println(" You need atleast one digit:");
         System.out.println(" You need atleast one special chracter:");
     }
   }
}


