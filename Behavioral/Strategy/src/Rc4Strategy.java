public class Rc4Strategy implements Strategy {
    private static String ALGORITHM = "RC4";

    @Override
    public byte[] encrypt(String text, String key) {
        System.out.println("Encrypting " + text + " with " + ALGORITHM + " strategy.");
        //Do encrypt RC4 strategy
        return new byte[0];
    }

    @Override
    public String decrypt(byte[] encryptedData, String key) {
        System.out.println("Dencrypting with " + ALGORITHM + " strategy");
        //Do dencrypt RC4 strategy
        return "";
    }
}
