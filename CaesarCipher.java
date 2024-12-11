import java.util.Scanner;


public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

     
        System.out.print("Enter the shift value: ");
        int shift = scanner.nextInt();
        scanner.nextLine(); 
       
        Cipher encryptor = new CaesarEncrypt(shift); 
        String encryptedText = encryptor.process(text);
        System.out.println("Encrypted text: " + encryptedText);

        Cipher decryptor = new CaesarDecrypt(shift); 
        String decryptedText = decryptor.process(encryptedText);
        System.out.println("Decrypted text: " + decryptedText);

        scanner.close(); // Close the scanner
    }
}
