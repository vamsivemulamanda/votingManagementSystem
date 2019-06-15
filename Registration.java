package vote;

import java.util.*;

public class Registration
{
        Scanner sc=new Scanner(System.in);
         public String username;
         public String password;
         public void register()
        {
                    System.out.print("Enter  Username:");
                     this.username=sc.next()+sc.nextLine();
       	 System.out.print("Enter password:");
       	 this.password=sc.next()+sc.nextLine();
        }
}