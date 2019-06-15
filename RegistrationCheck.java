package vote;

import java.util.*;
public class  RegistrationCheck
{
       public String US,username;
       public String pass,password;
       public RegistrationCheck(String US ,String pass,String username,String password)
       {
               this.US=US;
               this.pass=pass; 
               this.username=username;
               this.password=password;
       }

       public boolean check()
       {
             if(US.compareTo(username)==0)
             {
                     if(pass.compareTo(password)==0)
                     {
                            System.out.println("You logged in Succesfully");
                            return false;
                      }
                      else 
                      {
                             System.out.println("Incorrect password");
                             return true;
                       }
               }
               else 
                {
                         System.out.println("Incorrect Login Details");
                         return true;
                 }
          }
} 

         