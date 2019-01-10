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

class button implements ActionListener{
   
   public JPanel buttonCreator(JPanel f, int a, int b, int c, int d, String name){
      System.out.println("button created");
      Button g = new Button(name);
      g.setBounds(a,b,c,d);
      g.addActionListener(this);
      g.setVisible(true);
      f.add(g);
      return f;
      }
      
   public void actionPerformed(ActionEvent e){System.out.println("ButtonWithNoClass");}
   }
  
class closeButton extends button implements ActionListener{
    public void actionPerformed(ActionEvent e){System.exit(0);}
}

class getterButton extends button implements ActionListener{
   public void actionPerformed(ActionEvent e){extenderClass.mainExtenderMethod();}
   public static class extenderClass extends mainWindow{
      private static JFileChooser chooser;
      public static void mainExtenderMethod(){
          try{
            String url = textBox.getTextBox(showBox);
            Document document = Jsoup.connect(url).get();
            Elements links = document.select("a[href]");
            String ownText = document.body().text();
            ArrayList list = new ArrayList();
            list.add(ownText);
            if(ownText.equals("")){System.out.println();}
         }
        catch(IOException | IllegalArgumentException es){System.out.println("IOException @getterButton Class");}
        try{
            if (chooser == null) {
               System.out.println("this code is working");
               chooser = new JFileChooser();
               chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
               chooser.setAcceptAllFileFilterUsed(false);
               if(chooser.showOpenDialog(x) == JFileChooser.APPROVE_OPTION){
                  BufferedReader br = new BufferedReader(new FileReader(chooser.getSelectedFile()));
                  System.out.println(br.readLine());
                  }
               }
            else{System.out.println("chooser is not null");}
            //JFileChooser chooser = new JFileChooser();
            //if(chooser.showOpenDialog(x) == JFileChooser.APPROVE_OPTION) {System.out.println(chooser);}
            }
            catch(IOException exs){System.out.println("not working");}

      }
   }
}

class textBoxClear extends button implements ActionListener{
   public void ActionListener(ActionEvent e){textBoxClearExtenderMethod.clearMethod();}
   public static class textBoxClearExtenderMethod extends mainWindow{
      public static void clearMethod(){
         System.out.println("not working");
         //showBox.setText(" ");
         //showBox.setText("");
         //Not working; bug with java AWT or something that doesn't exist outside of swing. 
      }
   }
}