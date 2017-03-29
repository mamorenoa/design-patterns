import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class Utils {

    public static SecretKey buildSecretKey(String algorithm, String key) throws NoSuchAlgorithmException {
        SecureRandom secureRandom = new SecureRandom(key.getBytes());
        KeyGenerator keyGenerator = KeyGenerator.getInstance(algorithm);
        keyGenerator.init(secureRandom);
        return keyGenerator.generateKey();
    }

    public static Cipher buildCipher(String algorithm, SecretKey secretKey, int mode) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(mode, secretKey);
        return cipher;
    }
}
