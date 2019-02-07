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
import java.awt.Robot;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import static java.awt.event.KeyEvent.*;
import java.awt.event.KeyListener;

//https://stackoverflow.com/questions/1248510/convert-string-to-keyevents

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
   public static ArrayList booleanCheckerTwo = new ArrayList();
   public static class extenderClass extends mainWindow{
      public static void mainExtenderMethod(){
         if(booleanChecker.get(0).equals(3)){mainExtenderClassMethodM(textBox.getTextBox(showBox));}
         if(booleanChecker.get(0).equals(2)){mainExtenderClassMethodMTwo();}
         if(booleanChecker.get(0).equals(4)){
            CharSequence find = JOptionPane.showInputDialog("Enter Site; Type in this format: i.e google.com");
            try{
               Runtime run = Runtime.getRuntime();
               Process proc = run.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
               Robot bot = new Robot();
               bot.delay(500);
               botKeyPressMethod(bot, find);
               //bot.keyRealease(finder);
               }
            catch(IOException | AWTException exse){
               System.out.println("IOEXCEPTION @ MAINEXTENDERMETHOD");
               exse.printStackTrace();
               }
            }
         if(booleanChecker.get(0).equals(5)){
            booleanCheckerTwo.clear();
            booleanCheckerTwo.add(1);
            extenderClassURL.extenderClassMethodURL();
            System.out.println("URLSTRING TO STRING" + URLString.toString());
            mainExtenderClassMethodM(URLString.toString());
            URLString.clear();
            }
         else if(booleanChecker.get(0).equals(0)){System.out.println("nothing is selected"); System.out.println(booleanChecker.get(0));}
         }
         
      public static void botKeyPressMethod(Robot bot, CharSequence text){        
         ArrayList stringContainer = new ArrayList();
         for(int i = 0; i <= text.length()-1; i++){
            char character = text.charAt(i);
            System.out.println(character);
            typeCharacter(bot, character);
         }
         int mouseClick = InputEvent.BUTTON1_DOWN_MASK;
         bot.keyPress(KeyEvent.VK_ENTER);
         
         bot.mouseMove(300,430);
         bot.mousePress(mouseClick);
         bot.mouseRelease(mouseClick);
      }
      
      public static void typeCharacter(Robot bot, char character) {
        switch (character) {
        case 'a': bot.keyPress(KeyEvent.VK_A); bot.keyRelease(KeyEvent.VK_A); break;
        case 'b': bot.keyPress(KeyEvent.VK_B); bot.keyRelease(KeyEvent.VK_B); break;
        case 'c': bot.keyPress(KeyEvent.VK_C); bot.keyRelease(KeyEvent.VK_C); break;
        case 'd': bot.keyPress(KeyEvent.VK_D); bot.keyRelease(KeyEvent.VK_D); break;
        case 'e': bot.keyPress(KeyEvent.VK_E); bot.keyRelease(KeyEvent.VK_E); break;
        case 'f': bot.keyPress(KeyEvent.VK_F); bot.keyRelease(KeyEvent.VK_F); break;
        case 'g': bot.keyPress(KeyEvent.VK_G); bot.keyRelease(KeyEvent.VK_G); break;
        case 'h': bot.keyPress(KeyEvent.VK_H); bot.keyRelease(KeyEvent.VK_H); break;
        case 'i': bot.keyPress(KeyEvent.VK_I); bot.keyRelease(KeyEvent.VK_I); break;
        case 'j': bot.keyPress(KeyEvent.VK_J); bot.keyRelease(KeyEvent.VK_J); break;
        case 'k': bot.keyPress(KeyEvent.VK_K); bot.keyRelease(KeyEvent.VK_K); break;
        case 'l': bot.keyPress(KeyEvent.VK_L); bot.keyRelease(KeyEvent.VK_L); break;
        case 'm': bot.keyPress(KeyEvent.VK_M); bot.keyRelease(KeyEvent.VK_M); break;
        case 'n': bot.keyPress(KeyEvent.VK_N); bot.keyRelease(KeyEvent.VK_N); break;
        case 'o': bot.keyPress(KeyEvent.VK_O); bot.keyRelease(KeyEvent.VK_O); break;
        case 'p': bot.keyPress(KeyEvent.VK_P); bot.keyRelease(KeyEvent.VK_P); break;
        case 'q': bot.keyPress(KeyEvent.VK_Q); bot.keyRelease(KeyEvent.VK_Q); break;
        case 'r': bot.keyPress(KeyEvent.VK_R); bot.keyRelease(KeyEvent.VK_R); break;
        case 's': bot.keyPress(KeyEvent.VK_S); bot.keyRelease(KeyEvent.VK_S); break;
        case 't': bot.keyPress(KeyEvent.VK_T); bot.keyRelease(KeyEvent.VK_T); break;
        case 'u': bot.keyPress(KeyEvent.VK_U); bot.keyRelease(KeyEvent.VK_U); break;
        case 'v': bot.keyPress(KeyEvent.VK_V); bot.keyRelease(KeyEvent.VK_V); break;
        case 'w': bot.keyPress(KeyEvent.VK_W); bot.keyRelease(KeyEvent.VK_W); break;
        case 'x': bot.keyPress(KeyEvent.VK_X); bot.keyRelease(KeyEvent.VK_X); break;
        case 'y': bot.keyPress(KeyEvent.VK_Y); bot.keyRelease(KeyEvent.VK_Y); break;
        case 'z': bot.keyPress(KeyEvent.VK_Z); bot.keyRelease(KeyEvent.VK_Z); break;
        case 'A': bot.keyPress(KeyEvent.VK_A); bot.keyRelease(KeyEvent.VK_A); break;
        case 'B': bot.keyPress(KeyEvent.VK_B); bot.keyRelease(KeyEvent.VK_B); break;
        case 'C': bot.keyPress(KeyEvent.VK_C); bot.keyRelease(KeyEvent.VK_C); break;
        case 'D': bot.keyPress(KeyEvent.VK_D); bot.keyRelease(KeyEvent.VK_D); break;
        case 'E': bot.keyPress(KeyEvent.VK_E); bot.keyRelease(KeyEvent.VK_E); break;
        case 'F': bot.keyPress(KeyEvent.VK_F); bot.keyRelease(KeyEvent.VK_F); break;
        case 'G': bot.keyPress(KeyEvent.VK_G); bot.keyRelease(KeyEvent.VK_G); break;
        case 'H': bot.keyPress(KeyEvent.VK_H); bot.keyRelease(KeyEvent.VK_H); break;
        case 'I': bot.keyPress(KeyEvent.VK_I); bot.keyRelease(KeyEvent.VK_I); break;
        case 'J': bot.keyPress(KeyEvent.VK_J); bot.keyRelease(KeyEvent.VK_J); break;
        case 'K': bot.keyPress(KeyEvent.VK_K); bot.keyRelease(KeyEvent.VK_K); break;
        case 'L': bot.keyPress(KeyEvent.VK_L); bot.keyRelease(KeyEvent.VK_L); break;
        case 'M': bot.keyPress(KeyEvent.VK_M); bot.keyRelease(KeyEvent.VK_M); break;
        case 'N': bot.keyPress(KeyEvent.VK_N); bot.keyRelease(KeyEvent.VK_N); break;
        case 'O': bot.keyPress(KeyEvent.VK_O); bot.keyRelease(KeyEvent.VK_O); break;
        case 'P': bot.keyPress(KeyEvent.VK_P); bot.keyRelease(KeyEvent.VK_P); break;
        case 'Q': bot.keyPress(KeyEvent.VK_Q); bot.keyRelease(KeyEvent.VK_Q); break;
        case 'R': bot.keyPress(KeyEvent.VK_R); bot.keyRelease(KeyEvent.VK_R); break;
        case 'S': bot.keyPress(KeyEvent.VK_S); bot.keyRelease(KeyEvent.VK_S); break;
        case 'T': bot.keyPress(KeyEvent.VK_T); bot.keyRelease(KeyEvent.VK_T); break;
        case 'U': bot.keyPress(KeyEvent.VK_U); bot.keyRelease(KeyEvent.VK_U); break;
        case 'V': bot.keyPress(KeyEvent.VK_V); bot.keyRelease(KeyEvent.VK_V); break;
        case 'W': bot.keyPress(KeyEvent.VK_W); bot.keyRelease(KeyEvent.VK_W); break;
        case 'X': bot.keyPress(KeyEvent.VK_X); bot.keyRelease(KeyEvent.VK_X); break;
        case 'Y': bot.keyPress(KeyEvent.VK_Y); bot.keyRelease(KeyEvent.VK_Y); break;
        case 'Z': bot.keyPress(KeyEvent.VK_Z); bot.keyRelease(KeyEvent.VK_Z); break;
        case '`': bot.keyPress(KeyEvent.VK_BACK_QUOTE); bot.keyRelease(KeyEvent.VK_BACK_QUOTE); break;
        case '0': bot.keyPress(KeyEvent.VK_0); bot.keyRelease(KeyEvent.VK_0); break;
        case '1': bot.keyPress(KeyEvent.VK_1); bot.keyRelease(KeyEvent.VK_1); break;
        case '2': bot.keyPress(KeyEvent.VK_2); bot.keyRelease(KeyEvent.VK_2); break;
        case '3': bot.keyPress(KeyEvent.VK_3); bot.keyRelease(KeyEvent.VK_3); break;
        case '4': bot.keyPress(KeyEvent.VK_4); bot.keyRelease(KeyEvent.VK_4); break;
        case '5': bot.keyPress(KeyEvent.VK_5); bot.keyRelease(KeyEvent.VK_5); break;
        case '6': bot.keyPress(KeyEvent.VK_6); bot.keyRelease(KeyEvent.VK_6); break;
        case '7': bot.keyPress(KeyEvent.VK_7); bot.keyRelease(KeyEvent.VK_7); break;
        case '8': bot.keyPress(KeyEvent.VK_8); bot.keyRelease(KeyEvent.VK_8); break;
        case '9': bot.keyPress(KeyEvent.VK_9); bot.keyRelease(KeyEvent.VK_9); break;
        case '-': bot.keyPress(KeyEvent.VK_MINUS); bot.keyRelease(KeyEvent.VK_MINUS); break;
        case '=': bot.keyPress(KeyEvent.VK_EQUALS); bot.keyRelease(KeyEvent.VK_EQUALS); break;
        case '~': bot.keyPress(KeyEvent.VK_BACK_QUOTE); bot.keyRelease(KeyEvent.VK_BACK_QUOTE); break;
        case '!': bot.keyPress(KeyEvent.VK_EXCLAMATION_MARK); bot.keyRelease(KeyEvent.VK_EXCLAMATION_MARK); break;
        case '@': bot.keyPress(KeyEvent.VK_AT); bot.keyRelease(KeyEvent.VK_AT); break;
        case '#': bot.keyPress(KeyEvent.VK_NUMBER_SIGN); bot.keyRelease(KeyEvent.VK_NUMBER_SIGN); break;
        case '$': bot.keyPress(KeyEvent.VK_DOLLAR); bot.keyRelease(KeyEvent.VK_DOLLAR); break;
        case '%': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_5); bot.keyRelease(KeyEvent.VK_SHIFT); bot.keyRelease(KeyEvent.VK_5); break;
        case '^': bot.keyPress(KeyEvent.VK_CIRCUMFLEX); bot.keyRelease(KeyEvent.VK_CIRCUMFLEX); break;
        case '&': bot.keyPress(KeyEvent.VK_AMPERSAND); bot.keyRelease(KeyEvent.VK_AMPERSAND); break;
        case '*': bot.keyPress(KeyEvent.VK_ASTERISK); bot.keyRelease(KeyEvent.VK_ASTERISK); break;
        case '(': bot.keyPress(KeyEvent.VK_LEFT_PARENTHESIS); bot.keyRelease(KeyEvent.VK_LEFT_PARENTHESIS); break;
        case ')': bot.keyPress(KeyEvent.VK_RIGHT_PARENTHESIS); bot.keyRelease(KeyEvent.VK_RIGHT_PARENTHESIS); break;
        case '_': bot.keyPress(KeyEvent.VK_UNDERSCORE); bot.keyRelease(KeyEvent.VK_UNDERSCORE); break;
        case '+': bot.keyPress(KeyEvent.VK_PLUS); bot.keyRelease(KeyEvent.VK_PLUS); break;
        //case '\t': bot.keyPress(KeyEvent.VK_TAB); bot.keyRelease(KeyEvent.VK_TAB); break;
        //case '\n': bot.keyPress(KeyEvent.VK_ENTER); bot.keyRelease(KeyEvent.VK_ENTER); break;
        case '[': bot.keyPress(KeyEvent.VK_OPEN_BRACKET); bot.keyRelease(KeyEvent.VK_OPEN_BRACKET); break;
        case ']': bot.keyPress(KeyEvent.VK_CLOSE_BRACKET); bot.keyRelease(KeyEvent.VK_CLOSE_BRACKET); break;
        case '\\': bot.keyPress(KeyEvent.VK_BACK_SLASH); bot.keyRelease(KeyEvent.VK_BACK_SLASH); break;
        case '{': bot.keyPress(KeyEvent.VK_OPEN_BRACKET); bot.keyRelease(KeyEvent.VK_OPEN_BRACKET); break;
        case '}': bot.keyPress(VK_CLOSE_BRACKET); bot.keyRelease(KeyEvent.VK_CLOSE_BRACKET); break;
        case '|': bot.keyPress(VK_BACK_SLASH); bot.keyRelease(KeyEvent.VK_BACK_SLASH); break;
        case ';': bot.keyPress(KeyEvent.VK_SEMICOLON); bot.keyRelease(KeyEvent.VK_SEMICOLON); break;
        case ':': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_SEMICOLON); bot.keyRelease(KeyEvent.VK_SHIFT); bot.keyRelease(KeyEvent.VK_SEMICOLON); break;
        case '\'': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_QUOTE); bot.keyRelease(KeyEvent.VK_SHIFT); bot.keyRelease(KeyEvent.VK_QUOTE); break;
        case '"': bot.keyPress(KeyEvent.VK_QUOTEDBL); bot.keyRelease(KeyEvent.VK_QUOTEDBL); break;
        case ',': bot.keyPress(KeyEvent.VK_COMMA); bot.keyRelease(KeyEvent.VK_COMMA); break;
        case '<': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_COMMA); bot.keyRelease(KeyEvent.VK_SHIFT); bot.keyRelease(KeyEvent.VK_COMMA); break;
        case '.': bot.keyPress(KeyEvent.VK_PERIOD); bot.keyRelease(KeyEvent.VK_PERIOD); break;
        case '>': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_PERIOD); bot.keyRelease(KeyEvent.VK_SHIFT); bot.keyRelease(KeyEvent.VK_PERIOD); break;
        case '/': bot.keyPress(KeyEvent.VK_SLASH); bot.keyRelease(KeyEvent.VK_SLASH); break;
        case '?': bot.keyPress(KeyEvent.VK_SHIFT); bot.keyPress(KeyEvent.VK_SLASH); bot.keyRelease(KeyEvent.VK_SHIFT); bot.keyRelease(KeyEvent.VK_SLASH); break;
        case ' ': bot.keyPress(KeyEvent.VK_SPACE); bot.keyRelease(KeyEvent.VK_SPACE); break;
        default:
            throw new IllegalArgumentException("Cannot type character " + character);
        }
    }
      
      public static void keyRelease(Robot bot, KeyEvent e){
         bot.keyRelease(VK_A);  
      }
               
      public static void mainExtenderClassMethodM(String url){
          try{
            Document document = Jsoup.connect(url).get();
            Elements links = document.select("a[href]");
            String ownText = document.body().text();
            ArrayList<String> list = new ArrayList<String>();
            list.add(ownText);
            System.out.println(list);
            //Document document = Jsoup.connect(url).get();
            try{
               String description = document.select("meta[name=description]").first().attr("content");
               System.out.println("Description : " + description);
               String keywords = document.select("meta[name=keywords]").first().attr("content");
               System.out.println("Keywords : " + keywords);

            }
            catch(NullPointerException ge){System.out.println("NullPointerException @mainExtenderClassMethodM");}
            //for(int i = 0; i <= 50; i++){System.out.println("     ");}
            if(ownText.equals("")){System.out.println("Nothing in textbox");}
         }
        catch(IOException | IllegalArgumentException es){
         System.out.println("boolean checker two: " + booleanCheckerTwo.get(0));
         if(booleanCheckerTwo.size() == 0){
          System.out.println("IOException @getterButton Class");
          JOptionPane.showMessageDialog(null, "No URL/IOException", "Not Recognized",JOptionPane.ERROR_MESSAGE);
          }
         else{
            System.out.println("link not working");
            System.out.println(" ");
         }
        }
      }
      
     public static void mainExtenderClassMethodMTwo(){
         try{
            if (chooser == null) {
               System.out.println("Chooser is null");
               chooser = new JFileChooser();
               chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
               chooser.setAcceptAllFileFilterUsed(false);
               if(chooser.showOpenDialog(x) == JFileChooser.APPROVE_OPTION){
                  Scanner br = new Scanner(new FileReader(chooser.getSelectedFile()));
                  while(br.hasNext()){
                     System.out.println(br.nextLine());
                     mainExtenderClassMethodM(br.nextLine());
                  }
               }
               chooser = null;
            }
          else{System.out.println("chooser is not null");}
         }
       catch(IOException exs){System.out.println("not working");}
      }
   }
}
class extenderClassURL extends URLTesting{
   public static void extenderClassMethodURL(){
      String size = JOptionPane.showInputDialog("type in the size of URL you want");
      int sizeInt = Integer.parseInt(size);
      String executionSize = JOptionPane.showInputDialog("how many times should I execute?");
      int executionSizeInt = Integer.parseInt(executionSize);
      int timesExecuted = executionSizeInt;
      escapeChecker.clear();
      while(escapeChecker.size() == 0){
         for(int i = 0; i <= timesExecuted; i++){
            mainMethodStart(10,1,sizeInt);
         }
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


//left over code
               //Elements metaTags = document.getElementsByTag("meta");
               //for (Element metaTag : metaTags) {
                 // String content = metaTag.attr("content");
                  //String name = metaTag.attr("name");
                  //ArrayList stuffOne = new ArrayList();
                  //if("d.title".equals(name)) {stuffOne.add(content);}
                  //if("d.description".equals(name)){stuffOne.add(content);}
                  //if("d.language".equals(name)){stuffOne.add(content);}
                  //System.out.println(stuffOne);
                  //}
                  
            //BufferedReader br2 = new BufferedReader(new FileReader("URL's.txt"));
            //String url = br2.readLine();
            //String url = ;
            
            //String keyCode = "VK_" + stringContainer.get(i);
               //Field f = KeyEvent.class.getField(keyCode);
               //int keyEvent = f.getInt(null);
               //bot.keyPress(keyEvent);
            
            
            //JOptionPane.showMessageDialog(null, "Button Has No Function", "No Function",JOptionPane.ERROR_MESSAGE);
            //if(booleanChecker.get(0).equals(5)){JOptionPane.showInputDialog(null, "This is the message", "This is the default text");}