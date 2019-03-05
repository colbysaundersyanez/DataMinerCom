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
import java.io.File;

//https://stackoverflow.com/questions/19156143/java-how-request-a-new-ip-every-cycle-of-my-application
//https://stackoverflow.com/questions/1248510/convert-string-to-keyevents
//https://stackoverflow.com/questions/19035893/finding-second-occurrence-of-a-substring-in-a-string-in-java/35155037
//https://stackoverflow.com/questions/2793150/how-to-use-java-net-urlconnection-to-fire-and-handle-http-requests?rq=1

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
          if(booleanChecker.get(0).equals(6)){
               ArrayList urlHolder = new ArrayList();
               String urlSale = JOptionPane.showInputDialog("Input webpage for sale (read websitesupport.txt)");
               String numberOfPages = JOptionPane.showInputDialog("Input number of pages searched");
               int numberOfPagesInteger = Integer.parseInt(numberOfPages);
               if(numberOfPagesInteger == 1){
                  URLTesting.URLReader(urlSale);
               }
               else{
                  for(int i = 1; i <= numberOfPagesInteger; i++){
                     urlHolder.add(urlSale + "?ref=pagination&page=" + i);
                     System.out.println("this is urlHolder: " + urlHolder);
                     URLTesting.URLReader(urlHolder.get(i - 1).toString()); 
                     System.out.println("This is the current Url: " + urlHolder.get(i - 1).toString());
                     //scannerMethodWebsite(URLTesting.URLReader(urlHolder.get(i - 1).toString()));
                     scannerMethodWebsite(saleText);
                  }
               }
  
          }
         else if(booleanChecker.get(0).equals(0)){System.out.println("nothing is selected"); System.out.println(booleanChecker.get(0));}
         }
         
      public static void scannerMethodWebsite(String saleTextFound){
         try{
            String testSale = "Eligible order ship free";
            String testSaleTwo = "Sold";
            BufferedReader brSale = new BufferedReader(new FileReader("testing.txt"));
            String st = saleTextFound;
            System.out.println("this is saleText: " + saleText);
            ArrayList testSaleCounter = new ArrayList();
            testSaleCounter.add(st.indexOf(testSaleTwo));
            //https://www.etsy.com/shop/mrcwoodproducts/sold
            //https://www.etsy.com/shop/mrcwoodproducts/sold?ref=pagination&page=2
            //https://www.etsy.com/shop/WhoKnowsWhat/sold
            int subtract = (int)testSaleCounter.get(0) - 1;
            testSaleCounter.set(0,subtract);
            int numberInput;
            int addedIndex = 0;
            st = st.replace("Close Beginning of a dialog window, including tabbed navigation to register an account or sign in to an existing account. Both registration and sign in support using google and facebook accounts. Escape will close this window." , "").replace(" Register Sign in Get started Continue with Facebook Continue with Google We'll never post without your permission.","").replace(" OR Email or Username Have an account? Sign in Just one more","").replace(" already have an Etsy account. Sign in with Facebook Sign in with Google OR Email or Username Password Stay signed in Forgot your password? Forgot your username or email? Reopen your account? Etsy Browse Browse Search for items or shops Search Skip to Content Sell on Etsy Sell Register Sign in Discover Cart Cart 0 Jewelry & Accessories Clothing & Shoes Home & Living Wedding & Party Toys & Entertainment Art & Collectibles Craft Supplies Vintage Gifts Take full advantage of our site features by enabling JavaScript.","[Ignore any previous undeditable html]").replace("Create your Etsy password Create Your Etsy Account Continue with Facebook Continue with Google We'll never post without your permission. OR First Name Email Password Confirm Password By clicking Register, you agree to Etsy's Terms of Use and Privacy Policy. Etsy may send you communications; you may change your preferences in your account settings. Uh oh! You need to have cookies enabled to sign in. Welcome back","").replace("stepà","[stepa was replaced]");
            System.out.println("[" + st.substring(st.indexOf("Sales") - 7, st.indexOf("Sales") + 5) + " ]"); 
            String finalText = st.replace(st.substring(0,st.indexOf("Sold") + 4), "");;
            System.out.println(st.indexOf("Eligible orders ship free Favorite Add to Word Art Wood 3D Cutout Family by MRC Wood Products Sold"));
            System.out.println(st.substring(173,st.indexOf("Sold")));
            System.out.println("This is finalText: " + finalText);
            int numberOfStrings = finalText.length();
            ArrayList indexerNumber = new ArrayList();
            for(int i = 0; i < numberOfStrings; i++){
               try{
                  //System.out.println("this is the last index of sold" + st.lastIndexOf("Sold"));
                  int indexer = getLength(finalText);
                  //System.out.println(indexer);
                  int indexerTwo = finalText.indexOf("Eligible", finalText.indexOf("Eligible") + indexer);
                  String testing = finalText.substring(indexerTwo) + finalText.indexOf("Sold");
                  //System.out.println(indexer);
                  String t = testing.substring(testing.indexOf("Eligible"), testing.indexOf("Sold") + 4); 
                  System.out.println("Item Number: " + i + " Item: " + t);
                  //System.out.println(t.substring(t.indexOf("to") + 2));
                  //System.out.println(testing.substring(testing.indexOf("Eligible"), testing.indexOf("Sold") + 4));
                  //System.out.println(t.replace(t.substring(45), ""));
                  finalText = finalText.replace(finalText.substring(0,indexer + 1), ""); //this might be why the indexer is only printing out 17 instead of the 24 becuase the sold is being canceled out by the one
                  //finalText = finalText.replace(finalText.substring(0, indexer), "");
                  //System.out.println(finalText);
                  indexerNumber.add(indexer);
                }         
                  catch(StringIndexOutOfBoundsException e){
                        System.out.println("string ended"); 
                        break;
                     }
                  }
                  System.out.println("Loop ended");
                  System.out.println("this is indexerNumber: " + indexerNumber);
                  int sum = 0;
                  for(int i = 0; i<indexerNumber.size(); i++){
                     int tTwo = (int)indexerNumber.get(i);
                     sum += tTwo;
                  }
                  System.out.println("this is the sum: " + sum);
                  if(sum != st.lastIndexOf("Sold")){
                     JOptionPane.showMessageDialog(null, "Missing " + (st.lastIndexOf("Sold") - sum) + " Indexes", "MissingIndexes",JOptionPane.ERROR_MESSAGE);
                     System.out.println("missing " + (st.lastIndexOf("Sold") - sum) + "Indexes");
                     System.out.println(st.indexOf("Personalized"));
                     st = st.replace(st.substring(0,st.indexOf("Personalized")), "");
                     System.out.println("this is last index : " + st.substring(0, st.indexOf("Sold")));
                  }
                  System.out.println(st.substring(1722,2950));
                  PrintWriter writer = new PrintWriter("testing.txt");
                  writer.print("");
                  writer.close();  
               }
            catch(IOException saleFinderException){System.out.println("IOException @booleanChecker 6 button");}     
      }
         
      public static int getLength(String text){
         int indexOne = text.indexOf("Eligible");
         int indexTwo = text.indexOf("Sold");
         String indexText = text.substring(indexOne, indexTwo);
         int lengthOf = indexText.length();
         return lengthOf + 4;
      }
      
      public static String findingIndexChoosing(String string, String findingString, int indexNumber){
         string.split(findingString, indexNumber);
         string.join(findingString);
         return string;
      }
        
      public static String findingIndexOfSold(String fullString, String wordIndexing, int firstIndex){
         try{
            int secondIndex = fullString.indexOf(wordIndexing, firstIndex + 1);
            return fullString.substring(secondIndex);
            }
         catch(StringIndexOutOfBoundsException e){System.out.println();}
         return "No more Product";
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
      for(int i = 0; i <= timesExecuted; i++){
         mainMethodStart(10,1,sizeInt);
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
                                 //System.out.println("this is testSaleTwo" + st.indexOf(testSaleTwo));
                     //System.out.println("this is the final text" + saleFinderFinalText);
                 // }
                                         //int second = st.indexOf("Sold", first + 1);
                        //int third = st.indexOf("Sold", second + 1);
                        //System.out.println("this is the firstSubString: " + st.substring(first));
                        //System.out.println("this is the substringTwo: " + st.substring(second));
                        //System.out.println("this is the third substring: " + st.substring(third));
                        //System.out.println("this is testingOne: " + st.indexOf("Sold", st.indexOf("Sold") + i));
                        //System.out.println(st.indexOf(testSaleTwo));
                        //System.out.println("this is testing: " + testingTwo);

                        //System.out.println("this is the lenght" + saleFinderFinalText.length());
                        //System.out.println(saleFinderFinalText.substring(saleFinderFinalText.indexOf("Learn"),saleFinderFinalText.length()));
            
                     //for(int i = 0; i < numberInput; i++){
                        //String saleFinderFinalText = st.substring(st.lastIndexOf(testSale) + 1, st.indexOf(testSaleTwo));
                        //String saleFinderFinalText = st.indexOf(testSale, saleFinderFinalText.indexOf(testSale) + i);
                        //int iPlus = numberOfStrings*i;
                        
                        
                        
                        
                        
                        //int testing = saleFinderFinalText.indexOf(testSale, saleFinderFinalText.indexOf(testSale) + 1);
                        //String testingTwo = st.substring(st.indexOf(testSaleTwo) + 1);
                        //int first = st.indexOf("Sold") + iPlus;
                        //System.out.println(first);
                        //System.out.println("this is the final text" + finalTextTest);
                        //String finalText = findingIndexOfSold(st,"Sold",iPlus);
                        //if(finalText.equals("No more Product")){break;}
                        //else{System.out.println(finalText);}
                     //}            
                     
                     
                     
                     
                                       //while((int)testSaleCounter.get(0) != 0){
                     //find way to remove from the testSaleCounter.get(0)
                     //testSaleCounter.get(0)
                     
                                      //String saleFinderFinalText = st.substring(st.lastIndexOf(testSale) + 1, st.indexOf(testSaleTwo));
                     //saleFinderFinalText = saleFinderFinalText.replace("Close", "[closewasreplace]");
                     //String testing = "this is a test";
                     //System.out.println(testing);
                     //System.out.println(saleFinderFinalText);
                     //String numberInputString = JOptionPane.showInputDialog("Enter number of products");
                     //if(numberInputString.equals("max")){numberInput = 5000;}
                     //else{numberInput = Integer.parseInt(numberInputString);}
                                          //String stTesting = st.subString(0, st.indexOf("Sold"));
                     //System.out.println(stTesting);