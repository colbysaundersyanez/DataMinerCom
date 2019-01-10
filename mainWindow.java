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

class mainWindow extends Frame{
   public static JPanel x = new JPanel();
   public static Color backGroundWhite = new Color(250, 249, 250);
   public static Color mainInfoDisplay = new Color(255,255,255);
   public static textBox showBox = new textBox();
   public mainWindow(){
      super("DataMiner");
      setSize(300,300);
      setVisible(true);
      setBackground(backGroundWhite);
      //setLayout(null);
      x.setSize(300,300);
      x.setLayout(null);
      add(x);
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.out.println("closing");
            System.exit(0);
         }        
      }); 
   }
   
   public void paint(Graphics g) {
      Font font = new Font("Serif" , Font.BOLD, 9);
      Graphics2D g2 = (Graphics2D) g;
      g2.setColor(Color.black);
      g2.setFont(font);
      g2.drawString("Author: Colby S. Yanez", 15, 285);
      Graphics2D g4 = (Graphics2D) g;
      g4.setColor(mainInfoDisplay);
      g4.fillRect(15,40,145,200);
      Graphics2D g3 = (Graphics2D) g;
      g3.setColor(Color.black);
      g3.setFont(font);
      g3.drawString("DataMiner", 15, 270); 
      //g3.drawLine(97,65,188,65);
     // g3.setFont(new Font("default", Font.BOLD, 16)); 
   }
   
   public static void main(String[] args){
      mainWindow window = new mainWindow();
      if(Desktop.isDesktopSupported()){System.out.println("desktop is supported");}
      else{System.out.println("Desktop is not supported");}
      accessoryLayoutClass.mainMethod();
   }
}

class accessoryLayoutClass extends mainWindow{
   public static void mainMethod(){
      closeButton b = new closeButton();
      b.buttonCreator(x,215,230,65,25,"Close");
      URLUser checkOne = new URLUser();
      checkOne.checkBoxCreator(x,"URL link",180,10,70,20);
      getterButton b2 = new getterButton();
      b2.buttonCreator(x,145,230,65,25,"Find Data");
      showBox.textBoxCreator(x,160,187,120,25);
   }
}
