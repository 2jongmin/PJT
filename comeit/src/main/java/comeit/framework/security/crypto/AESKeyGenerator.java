package comeit.framework.security.crypto;

import java.security.Key;
import javax.crypto.KeyGenerator;
import org.apache.commons.codec.binary.Base64;

public class AESKeyGenerator {

  public static void main(String[] args) {
    try {
      KeyGenerator generator = KeyGenerator.getInstance("AES");
      //generator.init(256);
      generator.init(128);
   
      Key key = generator.generateKey();
   
      byte[] keyBytes = key.getEncoded();
      String base64EncodedKey = Base64.encodeBase64URLSafeString(keyBytes);
      System.out.println(String.format("Key : %s Length : %d", base64EncodedKey, keyBytes.length));
    } catch(Exception ex) {
      
    }
  }

}
