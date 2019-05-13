import java.awt.*;
import java.awt.event.*;
import java.awt.Toolkit.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

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
import java.awt.Dimension;
import javax.swing.*;

class barGraphClass extends Frame{
   public  JScrollPane scrollPane;
   public JTextArea console;
   public JPanel scrollFrame = new JPanel();
   public ScrollPane SC = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
   
   Font font = new Font("Serif" , Font.BOLD, 9);
   public static Color redColor = new Color(255,0,0);
   public int height;
   public int width;
   public int numberOfGraphs = 28;
   public static ArrayList<Integer> numberHolder = new ArrayList<Integer>();
   public static Color backGroundWhite = new Color(250, 249, 250);
   public static Color blackColor = new Color(0,0,0);
   public ArrayList<Integer> graphHeight = new ArrayList<Integer>(); //first one only allowed to change within the range of 25 - 225
   //public int[] graphWidth = {30,15, 60,15, 90,15, 120, 15, 150,15, 180,15, 210, 15, 240, 15};
   ArrayList graphWidthArrayList = new ArrayList();
   public int[] graphWidth = {};
   public int[] graphWidthY = {15};
   public barGraphClass(int height, int width){
      super("Item Graph");
      setResizable(false);
      setSize(height,width);
      setVisible(true);
      setBackground(backGroundWhite);
      //setLayout(null);
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            try{
               Runtime p = Runtime.getRuntime();
               p.exec("taskKill /F /IM notepad.exe");
            }
            catch(IOException e){System.out.println("IOException @Runtime p in barGraphClass window");}
            System.out.println("closing");
            System.exit(0);
         }        
      });
   //scrollFrame.setSize(30,300);
   //add(scrollFrame);
   //scrollFrame.setBounds(50,50,50,50);
   //scrollFrame.setBackground(blackColor);
   //scrollFrame.setVisible(true);
   //console = new JTextArea(1, 1);
   //scrollPane = new JScrollPane(console);
   //scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
   //scrollPane.setVisible(true);
   
   //Rectangle rect = new Rectangle(200, 200);
   //SC.add(new ScrollPane());
   //SC.setContent(rect);
   //add(SC);
   barGraphExtender.barGraphExtenderTwo.numberCheck(); 
   //add(new ScrolledPane());
   
   }
   
   //public class ScrolledPane extends JPanel{
   //   public ScrolledPane(){
   //      setPreferredSize(new Dimension(200,250));
         
   //   }
   //}
   
   
   public void paint(Graphics g) {
   
      Graphics2D gLine = (Graphics2D) g;
      gLine.drawLine(25,25, 25, 275);
      gLine.drawLine(25,275,875,275);
      gLine.drawLine(875, 25, 875,275);
      Font font = new Font("Serif" , Font.BOLD, 9);
      Graphics2D g2 = (Graphics2D) g;
      g2.setFont(font);
      for(int i = 0; i <= numberOfGraphs - 1; i++){
         String numberOnGraph = Integer.toString(i * 100);
         String numberOnGraphTwo = Integer.toString(i);
         int numberOnGraphInt = Integer.parseInt(numberOnGraph);
         if(numberOnGraphInt != 900){
            g2.drawString(numberOnGraph, 4, (275 - (i*25)));
         }
         else{g2.drawString("900+", 4, (275 - (i*25)));}
         g2.drawString(numberOnGraphTwo, (30 * (i + 1)) , 290);
      }
      Graphics2D f = (Graphics2D) g;
      f.setColor(redColor);
      try{
         for(int x = 1; x <= numberOfGraphs; x++){
            graphWidthArrayList.add(30 * x);   
         }
      }
      catch(ArrayIndexOutOfBoundsException erqfq){System.out.println("ends");}
      int k = 0;
      for(int x = 0; x <= 28; x++){
         long longNumber = Math.round(((numberHolder.get(x) * -1) * .27));
         int intNumber = (int)longNumber;
         //System.out.println(intNumber);
         graphHeight.add(intNumber);
      } 
      for(int i = 0; i <= 27; i++){
         try{
            int kTwo = (Integer)graphWidthArrayList.get(i);
            f.fillRect(kTwo, 270, graphWidthY[0], graphHeight.get(i));
         }
         catch(ArrayIndexOutOfBoundsException eswf){System.out.println("loop ends"); break;}
      }
   }
   
   public void addScrollPane(){
      scrollFrame.setSize(30,300);
      add(scrollFrame);
      scrollFrame.setBounds(875,0,20,300);
      scrollFrame.setBackground(blackColor);
      scrollFrame.setVisible(true);
      System.out.println("ScrollPane Added");
   }
   
   public static class barGraphExtender extends getterButton{
      public static class barGraphExtenderTwo extends extenderClass{
         public static void numberCheck(){
            getterButton newGetter = new getterButton();
            if(finalNumbersSorted.size() == 0){
               extenderClass.cancelOptionMethod();
               extenderClass.finalNumberSortingMethod();
            }
            System.out.println("this is finalNumbersSorted" + finalNumbersSorted);
            for(int i = 0; i <= 28; i++){
               numberHolder.add(finalNumbersSorted.get(i));
            }
         }
      }
   }
}



class barGraph{
   public int height;
   public int width;
   public barGraph(int height, int width){
      this.height = height;
      this.width = width;
   }
}
