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
import java.io.StringWriter;
import java.io.PrintWriter;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

//https://stackoverflow.com/questions/23045956/icons-on-joptionpane
//https://crunchify.com/simple-way-to-get-http-response-header-in-java/

class URLTesting extends mainWindow{
   public static Color backGroundWhite = new Color(250, 249, 250);
   public static Font font = new Font("Serif" , Font.BOLD, 10);
   public static ArrayList stuff = new ArrayList();
   public static void mainMethodStart(int a, int b, int c){
      ArrayList t = new ArrayList();
      ArrayList tTwo = new ArrayList();
      Random rand = new Random();
      t.add(0);
      for(int i = 0; t.get(0).equals(i); i++){
         randomLetterMethod(a, b ,c); //used to be 10, 1 ,10
         char e = (char)(rand.nextInt(26) + 'a');
         //System.out.println(e);
         for(int listGetter = 0; listGetter < stuff.size(); listGetter++){
            int x = listGetter;
            StringBuilder tr = new StringBuilder("");
            tr.append(stuff.get(x).toString());
            tTwo.add(tr);
         }
         mainMethod(tTwo.toString().replace("[","").replace("]","").replace(",","").replace(" ", ""));
         tTwo.clear();
      }
   }
   public static void mainMethod(String domain){
      try{
         URL url = new URL("http", domain, ".com/");
         String output = url.toExternalForm();
         URLString.add(output);
         System.out.println("URLString is " + URLString);
         URLReader(output);
         URLString.clear();
         }
      catch(MalformedURLException e){System.out.println("not working");}
   }
   
   public static void URLReader(String URL){
      try{
         numberExecuted.add(1);
         Document documentTwo = Jsoup.connect(URL).get();
         
         
         URL obj = new URL(URL);
         URLConnection  connection = obj.openConnection();
         System.out.println();
         System.out.println("--------------------------------------");
         System.out.println();
         Map<String, List<String>> map = connection.getHeaderFields();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
         System.out.println();
         System.out.println("--------------------------------------");
         System.out.println();
         
         
         
         Elements linksTwo = documentTwo.select("a[href]");
         String ownTextTwo = documentTwo.body().text();
         saleText = "";
         saleText = ownTextTwo;
         System.out.println("this is ownTextTwo" + ownTextTwo);
         int t = numberExecuted.size();
         String tTwo = String.valueOf(t);
         System.out.println(tTwo);
         Label xLabel = new Label(tTwo);
         xLabel.setBounds(50,50,130,15);
         xLabel.setBackground(Color.white);
         xLabel.setFont(font);
         x.add(xLabel);
         JOptionPane.showMessageDialog(null, "Found html data continue?", "HTMLDATAFOUND",JOptionPane.ERROR_MESSAGE);
         BufferedWriter writer = new BufferedWriter(new FileWriter("testing.txt"));
         writer.write(ownTextTwo);
         System.out.println("Writer has writen");
         writer.close();
         x.remove(xLabel);
         }
      catch(IOException | NullPointerException eTwo){
         try{
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            //eTwo.printStackTrace(pw);
            String stackTrace = sw.toString();
            if(stackTrace.contains("HTTP error")){
               System.out.println("this is stackTrace: " + stackTrace.substring(stackTrace.indexOf("HTTP error"), stackTrace.indexOf("HTTP error") + 35));
               JOptionPane.showMessageDialog(null, stackTrace.substring(stackTrace.indexOf("HTTP error"), stackTrace.indexOf("HTTP error") + 35), "HTTP ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else{System.out.println("IOEXCEPTION/NULLPOINTER @ URLREADER");}
         }
         catch(StringIndexOutOfBoundsException eThree){eThree.printStackTrace();}
         try{
            System.out.println("IOEXCEPTION @URLREADER");
            numberExecuted.add(1);
            int t = numberExecuted.size();
            String tTwo = String.valueOf(t);
            Label xLabel = new Label("times executed: " + tTwo);
            xLabel.setBounds(180,160,130,15);
            xLabel.setBackground(backGroundWhite);
            xLabel.setFont(font);
            x.add(xLabel);
            Thread.sleep(100);
            x.remove(xLabel);
         }
         catch(InterruptedException e){
            System.out.println("InterruptedException @CATCH URLREADER");
         }
      }
   }
   
   
   public static ArrayList randomLetterMethod(int a, int b, int c){
      stuff.clear();
      Random randTwo = new Random();
      for(int i = 0; i<=c;i++){
         char randChar = (char)(randTwo.nextInt(a) + 'a');
         String randCharString = Character.toString(randChar);
         stuff.add(randCharString);
         }
      return stuff;
      
   }
}


            //}
            //else{System.out.println("NULLPOINTER EXCEPTION @URLREADER MOST LIKELY");}
            //if(stackTrace.contains(stackTrace.substring(stackTrace.indexOf("HTTP error")))){
            //System.out.println(stackTrace);
            //System.out.println(stackTrace.substring(stackTrace.indexOf("HTTP error"), stackTrace.indexOf("Status=") + 10));
            //String trTest = stuff.get(x).toString();
            //System.out.println(tr.toString());
            //tr.toString();
            //System.out.println(tr);