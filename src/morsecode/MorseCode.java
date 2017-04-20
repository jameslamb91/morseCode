package morsecode;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Corey Lamb
 */
public class MorseCode {
    
    static String englishAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    static String[] morseAlphabet = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", 
    "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", 
    "", "-.--", "--..", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----."};

    public static void main(String[] args) {
    //Check for appropriate option code
        if(!((args[0].equals("-m2e"))||(args[0].equals("-e2m")))){
            System.err.print("\nInvalid option code."
                    + "\nPlease enter one of the following:"
                    + "\n\"-e2m\" to translate a message from english to morse code"
                    + "\n\"-m2e\" to translate a message from morse code to to english.");
            System.exit(1);
        }
        
        else if(args[0].equals("-m2e")){
            toEnglish();
        }
        else if(args[0].equals("-e2m")){
            toMorse();
        }
    }
    public static void toEnglish(){
         /**try {
                
                int ch;
                int lastCh = -1;
                while ((ch = System.in.read()) != -1){
                    
                    int indexOf = morseAlphabet.indexOf(ch);
                    
                    if (ch == ' ' && lastCh == ' '){
                        continue;
                    }
                    if(indexOf >= 0){
                        System.out.print(alphabet.charAt(((indexOf + key) % (alphabet.length()))));
                    }
                    else if (ch == '\n' || ch == '\r'){
                        ch = ' ';
                        indexOf = englishAlphabet.indexOf(ch);
                        System.out.print(englishAlphabet.charAt(((indexOf + key) % (englishAlphabet.length()))));
                    }
                    else {
                        continue;
                    }
                    lastCh = ch;
                }
            } catch (IOException ex) {
                Logger.getLogger(MorseCode.class.getName()).log(Level.SEVERE, null, ex);
            }**/
        System.out.print("This function is currently unavailable.");
        System.exit(10);
    }
    public static void toMorse(){
        try {
                
                int ch;
                while ((ch = System.in.read()) != -1){
                    if (ch == ' '){
                       System.out.print("| ");
                       continue;
                    }
                    
                    int indexOf = englishAlphabet.indexOf(ch);
                    if (indexOf < 0){
                        indexOf = englishAlphabet.indexOf(ch-32);
                    }
                    
                    if(indexOf >= 0){
                        System.out.print(morseAlphabet[indexOf] + " ");
                    }
                    else if (ch == '\n' || ch == '\r'){
                       System.out.println();
                       continue;
                    }
                    else {
                        continue;
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(MorseCode.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
