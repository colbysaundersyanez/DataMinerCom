import java.util.*;
import java.io.*;
import java.util.Scanner;

class sortingAL{
   public static ArrayList container = new ArrayList();
   public static void main(String[] args){
      mainMethod("sortingParagraph.txt");
   }
   public static void mainMethod(String fileString){
      try{
         //File file2 = new File("testing.txt");
         Scanner file = new Scanner(new File(fileString));
         Scanner file2 = new Scanner(new FileInputStream("testing.txt"));
         while(file.hasNextLine()){
            String str = file.nextLine();
            container.add(str);
            System.out.println(container);
            String str2 = "not";
            while(file2.hasNextLine()){
               String str3 = file2.nextLine();
               System.out.println("this is str3: " + str3);
               if(str.contains(str3)){System.out.println("file.contains is working");}
               else{System.out.println("Not working");}
               //System.out.println("this is file2.nextLine()" + file2.nextLine());
            }
         }
      }
      catch(IOException ex){System.out.println("IOException @ mainMethod() (filenotfound)");}
   }
   public static void methodTwo(String stringSort){
      
      
   }
}