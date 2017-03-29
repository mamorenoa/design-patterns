public class Context {

    private Strategy strategy;

    public void setRC4Strategy() {
        this.strategy = new Rc4Strategy();
    }

    public void setAesStrategy() {
        this.strategy = new AesStrategy();
    }

    public void setBlowfishStrategy() {
        this.strategy = new BlowfishStrategy();
    }

    public void setDesStrategy() {
        this.strategy = new DesStrategy();
    }

    public byte[] executeEncrypt(String text, String key) {
        return this.strategy.encrypt(text, key);
    }

    public String executeDecrypt(byte[] dataEncrypted, String key) {
        return this.strategy.decrypt(dataEncrypted, key);
    }

}
