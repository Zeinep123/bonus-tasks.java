import java.util.Scanner; 

class CaesarDecrypt extends Cipher {
    public CaesarDecrypt(int shift) {
        super(shift);
    }

    @Override
    public String process(String text) {
        String decryptedText = "";  

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) { 
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char shifted = (char) ((c - base - shift + 26) % 26 + base); 
                decryptedText += shifted; 
            } else {
                decryptedText += c; 
            }
        }

        return decryptedText;
    }
}