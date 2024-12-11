import java.util.Scanner;


abstract class Cipher {
    protected int shift; 

  
    public Cipher(int shift) {
        this.shift = shift % 26;
    }

    
    public abstract String process(String text);
}
