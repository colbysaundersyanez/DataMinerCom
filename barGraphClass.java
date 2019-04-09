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

class barGraphClass extends Frame{
   Font font = new Font("Serif" , Font.BOLD, 9);
   public static Color redColor = new Color(255,0,0);
   public int height;
   public int width;
   public int numberOfGraphs = 28;
   public static Color backGroundWhite = new Color(250, 249, 250);
   public int[] graphHeight = {50}; //first one only allowed to change within the range of 25 - 225
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
            System.out.println("closing");
            System.exit(0);
         }        
      }); 
   }
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
         g2.drawString(numberOnGraph, 7, (275 - (i*25)));
         g2.drawString(numberOnGraphTwo, (30 * (i + 1)) , 290);
      }
      //g2.drawString("1", 15,275);
      //g2.setColor(Color.black);
      //g2.setFont(font);
      //g2.drawString("Author: Colby S. Yanez", 15, 285);
      Graphics2D f = (Graphics2D) g;
      f.setColor(redColor);
      try{
         for(int x = 1; x <= numberOfGraphs; x++){
            graphWidthArrayList.add(30 * x);
            System.out.println(graphWidthArrayList);
            //graphWidth[x] = 30 * x;     
            System.out.println(Arrays.toString(graphWidth));
            System.out.println(x);    
         }
      }
      catch(ArrayIndexOutOfBoundsException erqfq){System.out.println("ends");}
      int k = 0;
      for(int i = 0; i < numberOfGraphs; i++){
         try{
            //f.fillRect(graphWidth[k], graphHeight[0], graphWidth[k + 1], graphHeight[1]);
            int kTwo = (Integer)graphWidthArrayList.get(i);
            
            f.fillRect(kTwo, graphHeight[0], graphWidthY[0], 225);
            //System.out.println(graphWidth[k] + " " + graphHeight[0]+ " " + graphWidth[k + 1]+ " " + graphHeight[1]);
            System.out.println("Filled Rectangle");
            k = k += 2;
            System.out.println(k);
         }
         catch(ArrayIndexOutOfBoundsException eswf){System.out.println("loop ends"); break;}
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