import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.util.*;
import java.rmi.*;
import java.awt.Button;
import javax.swing.*;
import java.awt.datatransfer.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.Label;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;
import javax.swing.ButtonGroup;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Random; 
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element; 
import org.jsoup.select.Elements;
import java.awt.Label;
import java.awt.Menu;
import java.awt.Insets;
import java.net.*;
import java.util.Scanner;

class URLTesting extends mainWindow{
   public static ArrayList stuff = new ArrayList();
   //public static void main(String[] args){mainMethodStart();}
   public static void mainMethodStart(){
      ArrayList t = new ArrayList();
      ArrayList tTwo = new ArrayList();
      Random rand = new Random();
      t.add(0);
      for(int i = 0; t.get(0).equals(i); i++){
         System.out.println(randomLetterMethod(10, 1, 10));
         char e = (char)(rand.nextInt(26) + 'a');
         System.out.println(e);
         for(int listGetter = 0; listGetter < stuff.size(); listGetter++){
            int x = listGetter;
            StringBuilder tr = new StringBuilder("");
            tr.append(stuff.get(x).toString());
            //tr.toString();
            //System.out.println(tr);
            tTwo.add(tr);
         }
         mainMethod(tTwo.toString().replace("[","").replace("]","").replace(",","").replace(" ", ""));
      }
      
   }
   public static void mainMethod(String domain){
      try{
         URL url = new URL("http", domain, ".com/");
         String output = url.toExternalForm();
         System.out.println(output);
         }
      catch(MalformedURLException e){System.out.println("not working");}
   }
   
   public static ArrayList randomLetterMethod(int a, int b, int c){
      Random randTwo = new Random();
      for(int i = 0; i<=c;i++){
         char randChar = (char)(randTwo.nextInt(a) + 'a');
         String randCharString = Character.toString(randChar);
         stuff.add(randCharString);
         }
      return stuff;
      
   }
}