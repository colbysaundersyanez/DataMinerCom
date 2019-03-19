class testingIndexing extends mainWindow{
   static class testingIndexingExtended extends URLTesting{
      public static void indexingMethod(String indexingString){
         String testSale = "Eligible order ship free";
         String testSaleTwo = "Sold";
         System.out.println("this is saleText: " + saleText);
         //it seems that the html parser is ignoring html elements; any repeat elements do not get counted
         //nor printing making the output vary from page to page.
         //If that is not the case then it may be the indexer although that is unlikely as the saleText
         //contains only text that is not repeating. 
         //https://github.com/jhy/jsoup/issues/765
         //https://www.etsy.com/shop/mrcwoodproducts/sold
         //https://www.etsy.com/shop/mrcwoodproducts/sold?ref=pagination&page=2
         //https://www.etsy.com/shop/WhoKnowsWhat/sold
         //indexingString = indexingString.replace("Close Beginning of a dialog window, including tabbed navigation to register an account or sign in to an existing account. Both registration and sign in support using google and facebook accounts. Escape will close this window." , "").replace(" Register Sign in Get started Continue with Facebook Continue with Google We'll never post without your permission.","").replace(" OR Email or Username Have an account? Sign in Just one more","").replace(" already have an Etsy account. Sign in with Facebook Sign in with Google OR Email or Username Password Stay signed in Forgot your password? Forgot your username or email? Reopen your account? Etsy Browse Browse Search for items or shops Search Skip to Content Sell on Etsy Sell Register Sign in Discover Cart Cart 0 Jewelry & Accessories Clothing & Shoes Home & Living Wedding & Party Toys & Entertainment Art & Collectibles Craft Supplies Vintage Gifts Take full advantage of our site features by enabling JavaScript.","[Ignore any previous undeditable html]").replace("Create your Etsy password Create Your Etsy Account Continue with Facebook Continue with Google We'll never post without your permission. OR First Name Email Password Confirm Password By clicking Register, you agree to Etsy's Terms of Use and Privacy Policy. Etsy may send you communications; you may change your preferences in your account settings. Uh oh! You need to have cookies enabled to sign in. Welcome back","").replace("stepà","[stepa was replaced]");
         //https://github.com/jhy/jsoup/issues/614
         System.out.println("[" + indexingString.substring(indexingString.indexOf("Sales") - 7, indexingString.indexOf("Sales") + 5) + " ]");          
         indexingString = indexingString.replace(indexingString.substring(0, indexingString.indexOf("Eligible")), "");
         String finalText = indexingString.replace(indexingString.substring(0,indexingString.indexOf("Sold") + 4), "");
         //System.out.println(finalText.substring(173,finalText.indexOf("Sold")));
         System.out.println("This is finalText:" + finalText);
         int numberOfStrings = finalText.length();
         System.out.println(countingMethod(" Eligible orders ship free Favorite Add to Personalized Family Name Sign Plaque Established Family Sign Carved Engraved Wall Sign wedding or anniversary gift Sold"));
         for(int i = 0; i <= finalText.length(); i++){
            try{
               int indexOne = 0;
               int indexTwo = finalText.indexOf("Sold") + 4;
               String t = finalText.substring(finalText.indexOf("Eligible") - 1, finalText.indexOf("Sold") + 4);
               if(t.equals("") || t.equals(" ") ||t.equals("El")){
                  System.out.println("Item Number: " + i + " Item: String not found/Unreadable");
               }
               else{System.out.println("Item Number: " + i + " Item:" + t);}
               finalText = finalText.replace(finalText.substring(indexOne,indexTwo), "");
            }
            catch(StringIndexOutOfBoundsException e){
               System.out.println("String Ended");
               System.out.println("leftover String:" + finalText);
               System.out.println("Last Index:" + finalText.substring(0, finalText.indexOf("Sold") + 4));
               finalText = "";
               break;
            }
         }
      }
      public static int countingMethod(String countedString){
         int counted = countedString.length();
         return counted;
      }
   }
}