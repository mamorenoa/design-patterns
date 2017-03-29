
public class StrategyDPExample {
    private static String TEXT_TO_ENCRYPT = "DesingPatterns";
    private static String KEY = "12345";

    public static void main(String[] args) {
        Context context = new Context();

        //RC4 Strategy
        context.setRC4Strategy();
        byte[] rc4DataEncrypted = context.executeEncrypt(TEXT_TO_ENCRYPT, KEY);
        String rc4DateDecrypted = context.executeDecrypt(rc4DataEncrypted, KEY);

        //AES Strategy
        context.setAesStrategy();
        byte[] aesDataEncrypted = context.executeEncrypt(TEXT_TO_ENCRYPT, KEY);
        String aesDataDecrypted = context.executeDecrypt(aesDataEncrypted, KEY);

        //Blowfish Strategy
        context.setBlowfishStrategy();
        byte[] blowfishDataEncrypted = context.executeEncrypt(TEXT_TO_ENCRYPT, KEY);
        String blowfishDataDecrypted = context.executeDecrypt(blowfishDataEncrypted, KEY);

        //DES Strategy
        context.setDesStrategy();
        byte[] desDataEncrypted = context.executeEncrypt(TEXT_TO_ENCRYPT, KEY);
        String desDataDecrypted = context.executeDecrypt(desDataEncrypted, KEY);
    }
}
