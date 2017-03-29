public class AesStrategy implements Strategy {
    private static String ALGORITHM = "AES";

    @Override
    public byte[] encrypt(String text, String key) {
        System.out.println("Encrypting " + text + " with " + ALGORITHM + " strategy.");
        //Do encrypt AES strategy
        return new byte[0];
    }

    @Override
    public String decrypt(byte[] encryptedData, String key) {
        System.out.println("Dencrypting with " + ALGORITHM + " strategy");
        //Do dencrypt AES strategy
        return "";
    }
}
