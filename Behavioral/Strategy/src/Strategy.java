
public interface Strategy {
    byte[] encrypt(String text, String key);
    String decrypt(byte[] dataEncrypted, String key);
}
