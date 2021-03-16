//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Carolyn Savas
import java.util.*;
import java.util.Map;
import java.util.TreeMap;

public class Graph
{
 private TreeMap<String, String> map;
 private boolean yahOrNay;

 public Graph(String line)
 {
   String[] lines = line.split(" ");
   map = new TreeMap<String, String>();
   for(String piece : lines){
     String first = piece.substring(0,1);
     String second = piece.substring(1, 2);
     if(map.get(first)==null)
       map.put(first, "");
     if(map.get(second)==null)
       map.put(second, "");
     
     map.put(first, map.get(first)+second);
     map.put(second, map.get(second)+first);
   }
   yahOrNay = false;
 }

 public boolean contains(String letter)
 {
   String l1=letter.substring(0);
   String l2=letter.substring(1);
   if(map.get(l1).equals(l2))
     yahOrNay = false;
   return yahOrNay;
 }

 public void check(String first, String second, String placesUsed)
 {
   if(first.equals(second))
     yahOrNay = true;
   else{
     String conList = map.get(first);
     for(int i =0; i<conList.length(); i++)
       if(placesUsed.indexOf(conList.substring(i, i +1))<0)
       check(conList.substring(i, i +1), second, placesUsed+first);
   }
 }

 public String toString()
 {
   String output = "";
        for (String x: map.keySet())
            output += x + " - " + map.get(x) + "\n";
        return map.toString();
 }
}