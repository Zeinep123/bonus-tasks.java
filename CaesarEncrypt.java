import java.util.Scanner; 

class CaesarEncrypt extends Cipher {
    public CaesarEncrypt(int shift) {
        super(shift); // Наследуем сдвиг от базового класса
    }

    @Override
    public String process(String text) {
        String encryptedText = ""; 

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) { 
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char shifted = (char) ((c - base + shift) % 26 + base); 
                encryptedText += shifted; 
            } else {
                encryptedText += c; 
            }
        }

        return encryptedText;
    }
}