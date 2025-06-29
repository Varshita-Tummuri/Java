import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.*;

class File_Operations {

    public void Encrypt(SecretKey skey, File inputFile, File outputFile) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, skey);

        FileInputStream inputStream = new FileInputStream(inputFile);
        FileOutputStream outputStream = new FileOutputStream(outputFile);
        CipherOutputStream cipherOutput = new CipherOutputStream(outputStream, cipher);

        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            cipherOutput.write(buffer, 0, bytesRead);
        }

        inputStream.close();
        cipherOutput.close();

        System.out.println("File Encrypted Successfully!");
    }

    public void Decrypt(SecretKey skey, File inputFile, File outputFile) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, skey);

        FileInputStream inputStream = new FileInputStream(inputFile);
        CipherInputStream cipherInput = new CipherInputStream(inputStream, cipher);
        FileOutputStream outputStream = new FileOutputStream(outputFile);

        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = cipherInput.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }

        cipherInput.close();
        outputStream.close();

        System.out.println("File Decrypted Successfully!");
    }
}

public class File_EncryptDecrypt {

    public static void main(String[] args) throws Exception {

        // Generate AES key
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        SecretKey skey = keyGen.generateKey();

        // Create plain text file
        File inputFile = new File("TextFile.txt");
        FileWriter w = new FileWriter(inputFile);
        w.write("This is the message!");
        w.flush();
        w.close();

        File encryptedFile = new File("encryptedText.enc");
        File decryptedFile = new File("decryptedText.txt");

        File_Operations operation1 = new File_Operations();

        operation1.Encrypt(skey, inputFile, encryptedFile);
        operation1.Decrypt(skey, encryptedFile, decryptedFile);
    }
}
