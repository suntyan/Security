package com.security.demo.util;


import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author HJH
 * @Description:
 * @date 2019/8/2 17:01
 */
public class MyPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence.toString());
    }
}
