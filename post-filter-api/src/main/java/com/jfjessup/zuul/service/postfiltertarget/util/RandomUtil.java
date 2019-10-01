package com.jfjessup.zuul.service.postfiltertarget.util;

public class RandomUtil {
    private final static String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
            + "0123456789"
            + "abcdefghijklmnopqrstuvxyz";

    public static String getAlphaNumericString(int size) {
        StringBuilder sb = new StringBuilder(size);

        for (int i = 0; i < size; i++) {
            int index = (int) (ALPHA_NUMERIC_STRING.length() * Math.random());
            sb.append(ALPHA_NUMERIC_STRING.charAt(index));
        }

        return sb.toString();
    }
}
