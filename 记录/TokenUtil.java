package com.libf.SpringTimeTask;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class TokenUtil {
	//私有化静态工具类
    private static TokenUtil ourInstance;

	//私有化构造方法
    private TokenUtil() {
    }

	//公开静态获取工具类，双重检查机制
    public static TokenUtil getrInstance(){
        if (ourInstance == null){
            synchronized (TokenUtil.class){
                if (ourInstance == null)
                ourInstance = new TokenUtil();
            }
        }
        return ourInstance;
    }

	//获取Token令牌
    public String getToken(){
        String token = (System.currentTimeMillis() + new Random().nextInt(999999999)) + "";
        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            byte md5[] =  md.digest(token.getBytes());
            BASE64Encoder encoder = new BASE64Encoder();
            return encoder.encode(md5);
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "";
    }

}
