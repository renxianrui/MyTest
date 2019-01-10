package shiro;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * Created by user on 2019/1/10.
 */
public class TestEncryption {
    public static void main(String[] args) {
        String password = "123";
        String encodedPassword = new Md5Hash(password).toString();
        System.out.println(encodedPassword);
    }
}
