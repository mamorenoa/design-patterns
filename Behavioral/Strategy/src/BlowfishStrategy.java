public class BlowfishStrategy implements Strategy {
    private static String ALGORITHM = "Blowfish";

    @Override
    public byte[] encrypt(String text, String key) {
        System.out.println("Encrypting " + text + " with " + ALGORITHM + " strategy.");
        //Do encrypt Blowfish strategy
        return new byte[0];
    }

    @Override
    public String decrypt(byte[] encryptedData, String key) {
        System.out.println("Dencrypting with " + ALGORITHM + " strategy");
        //Do dencrypt Blowfish strategy
        return "";
    }
}
