//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Carolyn Savas

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GraphRunner
{
 public static void main( String[] args ) throws IOException
 {
  Scanner file = new Scanner(new File("graph1.dat"));
  int howManyTimes = file.nextInt();
  file.nextLine();
  for(int x=0; x<howManyTimes; x++)
  {
    String in = file.nextLine();
   Graph connect = new Graph(in);
   
   in = file.nextLine();
   String start = in.substring(0,1);
   String stop = in.substring(1, 2);
   
   if(connect.contains(start) && connect.contains(stop) );
   System.out.println(connect);
  }
 }
}