package vote;

import java.io.*;


public class StoreFile
{
      public void store() throws IOException
      {
      	FileOutputStream fout=new FileOutputStream("voting1.txt");
                   ObjectOutputStream oops=new ObjectOutputStream(fout);
                    Information i=null;
                    i=Information.getInformationDetails();
                    oops.writeObject(i);
      }
}
      