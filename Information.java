package vote;


import java.io.*;

public class Information extends Registration implements Serializable
{
          String name;
          String city;
          String address;
          static int age;
          
          
          Information(String name,int age,String address,String city)
          {
                   this.name=name;
                   this.city=city;
                   this.address=address;
                    this.age=age;
           }

          public String toString()
          {
                    return  username+"\t"+password+"\t"+ name+"\t"+age+"\t"+address+"\t"+city;
           }
 
          public static Information getInformationDetails () throws IOException
          {       
                   String name;
                   String city;
                   String address;
                   int age; 
                   DataInputStream dis= new DataInputStream(System.in);
                   System.out.print("Enter your Name:");
                   name=dis.readLine();
                   System.out.print("Enter your city:");
                   city=dis.readLine();
                   System.out.print("Enter your address:");
                   address=dis.readLine();
                   System.out.print("Enter your age:");
                   age=Integer.parseInt(dis.readLine());

                   Information i=new Information(name,age,address,city);
                  return i;
           }
	public static int age1()
                  {
                         return age;
                    }
}