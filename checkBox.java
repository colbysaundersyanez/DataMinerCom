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

class checkBox implements ItemListener{
   public static Color backGroundWhite = new Color(250, 249, 250);
   public JPanel checkBoxCreator(JPanel x, String s,int a, int b, int c, int d){
      Checkbox check = new Checkbox(s);
      check.setBounds(a,b,c,d);
      check.addItemListener(this);
      check.setBackground(backGroundWhite);
      x.add(check);
      return x;
   } 
   public void itemStateChanged(ItemEvent e){System.out.println("nothing set for box");}
} 

class URLUser extends checkBox implements ItemListener{
   public void itemStateChanged(ItemEvent e){extenderURL.mainExtenderURLMethod();}
   public static class extenderURL extends mainWindow{
      public static void mainExtenderURLMethod(){
         Font font = new Font("Serif" , Font.BOLD, 9);
         System.out.println("checkBox works");
         Label desc = new Label("Enter the URL in the box provided");
         Label desc2 = new Label("Meta Data will be provided");
         Label desc3 = new Label("other data + Meta Data stored in files");
         desc.setBounds(25,50,100,50);
         desc.setFont(font);
         desc.setBackground(Color.white);
         x.add(desc);
      }
   }
}