import vote.Candidates;
import vote.Registration;
import vote.RegistrationCheck;
import vote.StoreFile;
import vote.Information;
import java.util.*;
import java.io.*;
import vote.Wincheck;
import vote.Result;

public class Usage
{
       public static void main(String args[])  throws IOException
      {
           Registration r=new Registration();  
           StoreFile sf=new StoreFile();
           Candidates c=new Candidates();  
           Scanner sc=new Scanner(System.in);
           System.out.print("Total Number of voters are going to vote:");
           int  n=sc.nextInt();
           int cand1=0,cand2=0,cand3=0;
             for(int i=0;i<n;i++)
               {
                   System.out.println("Welcome to voting management System");
                   
                   System.out.println("Are you registered for voting:y/n");
                   char c1;
                   int not=1;
                   boolean check=true;
                   c1=sc.next().charAt(0);
               do
               {    
                   if(c1=='n' || c1=='N')
                   {
                               System.out.print("Enter your  age:");
                               int checkage=sc.nextInt();
                               if(checkage<18)
                               {
                                       System.out.println("You are not eligible to vote");
                                        not=0;
                                        break;
                               }
                               else
                               {
             	            System.out.println("Please do register for voting");              	
              	            r.register();
              	            sf.store();
                               check=false;
                                 }
                  }
                  else if(c1=='y' || c1=='Y')
                   { 
                               System.out.println("please login to vote");
                               check=false;
                   }
                   else
                   {
                               System.out.println("Incorrect option...");
                               c1=sc.next().charAt(0);
                    }
                }while(check);


                    String us;
                    String pass;
                    boolean x=true;
                    if(not!=0)
                   {
                   do
                   {
                        System.out.print("Enter username:");
                       us=sc.next()+sc.nextLine();  
                       System.out.print("Enter password:");
                       pass=sc.next()+sc.nextLine();  
                       RegistrationCheck rk=new RegistrationCheck(us,pass,r.username,r.password);   
                       x=rk.check();              
                     }while(x);
	          c.print();
                             System.out.print("Enter the choice you have to vote:");                           
                            int choice=sc.nextInt();
                             switch(choice)
                             {
                                     case 1:cand1++;
                                            break;
                                     case 2:cand2++;
                                            break;
                                     case 3:cand3++;
                                            break;
                             } 
                     System.out.print("If you want to continue Enter 1");
                     int exi=sc.nextInt();
                     if(exi==1)
                      {
                            break;
                      }
                }
               }
                int winner=Wincheck.win(cand1,cand2,cand3);
                Result res=new Result();
                res.result(winner,cand1,cand2,cand3);
                System.out.println("Total number of polled votes:"+(cand1+cand2+cand3));
                System.out.println("Total number of unpolled votes:"+(n-(cand1+cand2+cand3)));  
      
}
}                