package com.macro.meedog.security.util;

/**
 * @author "xxxxxx"
 * @modified 2020/11/22 2:44 下午
 */

public class CryptUtil {
    //"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJvNjI4dzVmeklEdExPSFR2MFlMSTY3cFhDX2VjIiwiY3JlYXRlZCI6MTYwNjAyNzI3NDY1NCwiZXhwIjoxNjA2MDI3MjgyfQ.fw7z07p09MJVAOVH6y_MtNU6BpQqb0CeygFY-5-5rcTgn1evBLWvisaMIZ6qeZDl1h47FfJKmYZQgR2FpozkhA"

    public static String encode(String key) {
        if (key == null) {
            return null;
        }
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < key.length(); i++) {
            if (Character.isUpperCase(key.charAt(i))) {
                buf.append(Character.toLowerCase(key.charAt(i)));
            } else if (Character.isLowerCase(key.charAt(i))) {
                buf.append(Character.toUpperCase(key.charAt(i)));
            } else {
                buf.append(key.charAt(i));
            }
        }
        return buf.toString();
    }

    public static String decode(String key) {
        if (key == null) {
            return null;
        }
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < key.length(); i++) {
            if (Character.isLowerCase(key.charAt(i))) {
                buf.append(Character.toUpperCase(key.charAt(i)));
            } else if (Character.isUpperCase(key.charAt(i))) {
                buf.append(Character.toLowerCase(key.charAt(i)));
            } else {
                buf.append(key.charAt(i));
            }
        }
        return buf.toString();
    }

    /*public static void main(String[] args) {
        String key = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJvNjI4dzVmeklEdExPSFR2MFlMSTY3cFhDX2VjIiwiY3JlYXRlZCI6MTYwNjAyNzI3NDY1NCwiZXhwIjoxNjA2MDI3MjgyfQ.fw7z07p09MJVAOVH6y_MtNU6BpQqb0CeygFY-5-5rcTgn1evBLWvisaMIZ6qeZDl1h47FfJKmYZQgR2FpozkhA";

        // String encodeKey = CryptUtil.encode(key);
        // System.out.println("encoded: " + encodeKey);
        String decodedKey = CryptUtil.decode(encodeKey);
        System.out.println("decoded: " + decodedKey);
        System.out.println("key: " + encodeKey);
    }*/

}