package com.criptografia.dev;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class Demo {
    public static void main(String[] args) {

        String cadenaDeTexto = "password14";
        String cadenaEncriptada = "";
        try {
            System.out.println("Texto original -> "+cadenaDeTexto);
            cadenaEncriptada = encriptar(cadenaDeTexto);
            System.out.println("Texto encriptada -> "+cadenaEncriptada);
            String cadenaDesencriptada = desencriptar(cadenaEncriptada);
            System.out.println("Texto desencriptada -> "+cadenaDesencriptada);
        } catch (UnsupportedEncodingException uee) {
            System.out.println("Ups!! > "+ uee);
        }


    }


    private static String encriptar(String s) throws UnsupportedEncodingException {
        return Base64.getEncoder().encodeToString(s.getBytes("utf-8"));
    }

    private static String desencriptar(String s) throws UnsupportedEncodingException{
        byte[] decode = Base64.getDecoder().decode(s.getBytes());
        return new String(decode, "utf-8");
    }
}
