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

//change button class in order to get urllink/fileSelect to work; file explore popping up when url link option
//is clicked and the other way around. 
//Also, file explore is not detecting more than one URL; use the .hasNext() function in other button class
//https://stackoverflow.com/questions/3202305/web-scraping-with-java I don't think JSoup has some of the HTML scrapping I need

//Things to Implement:
//-Socil Media Scraper; Perhaps using a bot to collect data from the screen instead of actual html parsing as 
//social media has work arounds against data scraping
//-CheckBoxes for said scraping
//-Sorting algorith to go through raw data and gather the most important i.e Names, Adresses, Emails,etc.
//(ideas on how to do this)
//the essential thing such as names and such cant be identified through traditional means i.e web parsing 
//should the algorith have to go through raw data and then take that and transform it to something that can be graphed 
//or perhaps have them as separate algorithms. 
//*for testing with this I should take paragraphs and attempt to gather some pheasable data from it. 
//HTML parsing provides about the same amount of data as a paragraph although it will require more filters. JSoup has filtering
//as well as the java utility filtering i.e .toString()
//-Using said sorting algorith in tandum with a python graphing framework 

//https://stackoverflow.com/questions/17383867/set-icon-image-in-java
//for setting icon image; need to design an icon. 


//https://coderanch.com/t/643075/java/Random-URL-generator-gt-Critique
//ways to implement a random url search and the development of an algorithm to do so
//https://stackoverflow.com/questions/5951322/there-is-a-url-valid-generator-for-java
//https://github.com/namics/java-random/blob/master/src/main/java/com/namics/commons/random/generator/basic/UrlGenerator.java
//
//-use a bot to create random pheasable words such as "the" "it" and log all url's in a log file and then
//run them through a url html parser that takes that data and structures it into data that can be read. 
//second idea would be to create a url maker that takes a randomly generated value starting at a random word/letter
//and running it through an alogrithm that would add http://(random value).com/org/edu/gov,etc.
//it would validate that it is a real website, gather all the information i.e title, category,etc.
//for both it would bookshelf the data in a manner that i can go back and choose a certain category for further
//study and potential demographics that could yield monetary gain in trends and statistics.

// Eligible orders ship free Favorite Add to Personalized Rustic Sign Family Name Sign State Shape Sign 16x20 Sold
//this is the format of the sold items
//https://www.etsy.com/shop/mrcwoodproducts/sold
//have AI open webpage physically open the previous url search for the next page button and gather the url
//and repeat until theres no more sale pages.


class mainWindow extends Frame{
   public static JFileChooser chooser;
   public static JPanel x = new JPanel();
   public static ArrayList URLString = new ArrayList();
   public static ArrayList booleanChecker = new ArrayList();
   public static Color backGroundWhite = new Color(250, 249, 250);
   public static Color mainInfoDisplay = new Color(255,255,255);
   public static ArrayList numberExecuted = new ArrayList();
   public static ArrayList escapeChecker = new ArrayList();
   public static textBox showBox = new textBox();
   public static ArrayList<String> containerStrings = new ArrayList<String>();
   public static String saleText;
   public static ArrayList numberStore = new ArrayList();
   public static ArrayList<String> finalWordContainer = new ArrayList<String>();
   public static ArrayList<String> wordSortingContainer = new ArrayList<String>();
   public static ArrayList<String> finalWordContainerTwo = new ArrayList<String>();
   public mainWindow(){
      super("DataMiner");
      setSize(300,300);
      setVisible(true);
      setBackground(backGroundWhite);
      //setLayout(null);
      x.setSize(300,300);
      setResizable(false);
      x.setLayout(null);
      add(x);
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.out.println("closing");
            System.exit(0);
         }        
      }); 
      addKeyListener(new KeyAdapter(){
         public void keyPressed(KeyEvent e){
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_ESCAPE){
               escapeChecker.add(1);
               System.out.println("escape key pressed");
            }
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
      fileChooser fileChecker = new fileChooser();
      fileChecker.checkBoxCreator(x,"File Select",180,30,90,20);
      socialMedia socialMediaCheck = new socialMedia();
      socialMediaCheck.checkBoxCreator(x,"Social Media", 180,50,90,20);
      randomSearch randomSearchCheck = new randomSearch();
      randomSearchCheck.checkBoxCreator(x,"Rand Search" , 180,70,100,20);
      saleFinder saleFinderCheck = new saleFinder();
      saleFinderCheck.checkBoxCreator(x,"Sale Finder" , 180,90,100,20);
      sortingData sortingDataCheck = new sortingData();
      sortingDataCheck.checkBoxCreator(x,"Sorting" , 180,110,100,20);
   }
}
