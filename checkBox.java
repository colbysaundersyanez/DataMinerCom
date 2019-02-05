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
      public static Label desc = new Label("Enter the URL in the box");
      public static Label desc2 = new Label("Meta Data will be provided");
      public static Label desc3 = new Label("Data will be stored in file");    
      public static Font font = new Font("Serif" , Font.BOLD, 10);
      public static void mainExtenderURLMethod(){
         System.out.println("checkBox works");
         chooser = new JFileChooser();
         if(booleanChecker.size() == 0){
            booleanChecker.add(3);  
            shortMethod(desc,20,5,130,15,font,x);
            shortMethod(desc2,20,20,130,15,font,x);
            shortMethod(desc3,20,35,130,15,font,x);
         }
         else{
            removerMethod(x);
            booleanChecker.clear();
            System.out.println("booleanChecker cleared" + booleanChecker.size());
         }
      }
      public static JPanel shortMethod(Label t, int a, int b , int c, int d, Font font, JPanel x){
         t.setBounds(a,b,c,d);
         t.setFont(font);
         t.setBackground(Color.white);
         x.add(t);
         return x;
      }
      public static JPanel removerMethod(JPanel jpanel){
         jpanel.remove(desc);
         jpanel.remove(desc2);
         jpanel.remove(desc3);
         return jpanel;
      }
   }
}

class fileChooser extends checkBox implements ItemListener{
   public void itemStateChanged(ItemEvent e){fileChooserExtender.fileChooserExtenderMethod();}
   static class fileChooserExtender extends mainWindow{
      public static Label newLabel = new Label("Input a file (Must be .txr)");
      public static void fileChooserExtenderMethod(){
         chooser = null;
         if(booleanChecker.size() == 0){
            booleanChecker.add(2);
            //shortMethod(newLabel,20,5,130,15,font,x);
            //Label needed to be printed.
         }
         else{
            booleanChecker.clear();
            System.out.println("booleanChecker cleared" + booleanChecker.size());
         }
      }
   }
}

class socialMedia extends checkBox implements ItemListener{
   public static Label socialMediaOne = new Label("Will do a social media");
   public static Label socialMediaTwo = new Label("search according to ");
   public static Label socialMediaThree = new Label("socialReadme.txt");
   public static Font font = new Font("Serif" , Font.BOLD, 10);
   public void itemStateChanged(ItemEvent es){socialMediaExtenderClass.socialMediaExtenderClassMethod();}
   static class socialMediaExtenderClass extends mainWindow{
      public static void socialMediaExtenderClassMethod(){
         if(booleanChecker.size() == 0){
            booleanChecker.add(4);
            labelMakerClass.labelMakerClassMethod(socialMediaOne,20,5,130,15,font,x);
            labelMakerClass.labelMakerClassMethod(socialMediaTwo,20,20,130,15,font,x);
            labelMakerClass.labelMakerClassMethod(socialMediaThree,20,35,130,15,font,x);
         }
         else{
            booleanChecker.clear();
            labelMakerClass.labelRemover(socialMediaOne, x);
            labelMakerClass.labelRemover(socialMediaTwo, x);
            labelMakerClass.labelRemover(socialMediaThree, x);
            System.out.println("booleanChecker cleared" + booleanChecker.size());
         }
      }
   }
}

class randomSearch extends checkBox implements ItemListener{
   public void itemStateChanged(ItemEvent es){randomSearchExtenderClass.randomSearchExtenderClassMethod();}
   static class randomSearchExtenderClass extends mainWindow{
      public static void randomSearchExtenderClassMethod(){
         if(booleanChecker.size() == 0){
            booleanChecker.add(5);
            System.out.println("checkBox works; Rand Search.");
         }
         else{
             booleanChecker.clear();
             System.out.println("booleanChecker cleared" + booleanChecker.size());
         }
      }
   }
}

class labelMakerClass extends mainWindow{
   public static JPanel labelMakerClassMethod(Label t, int a, int b , int c, int d, Font font, JPanel x){
        t.setBounds(a,b,c,d);
        t.setFont(font);
        t.setBackground(Color.white);
        x.add(t);
        return x;
   }
   public static JPanel labelRemover(Label a, JPanel x){
      x.remove(a);
      return x;
   }
}