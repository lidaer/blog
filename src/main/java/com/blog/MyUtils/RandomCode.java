package com.blog.MyUtils;

import java.util.Random;

public class RandomCode {

    // 获得随机的验证码
    public static String getRandomCode(){
        StringBuffer data = new StringBuffer("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            sb.append(data.charAt(random.nextInt(62)));
        }
        return sb.toString();
    }
}
