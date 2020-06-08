package org.cat73.demo;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var salt = BCrypt.gensalt(BCryptPasswordEncoder.BCryptVersion.$2A.getVersion(), 10);
        System.out.println("salt: " + salt);

        while (true) {
            String pw = BCrypt.hashpw("pw", salt);
            System.out.println("pw: " + pw);

            Thread.sleep(1000L);
        }
    }
}
