package com.criptografia.dev;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;

public class Main {

    public static void main(String[] args) throws IllegalBlockSizeException, InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeySpecException, NoSuchProviderException, UnsupportedEncodingException {

        CesarMejorado algCesar = new CesarMejorado();
        Hash hash = new Hash();

        String password = "MiPassword#2021";

        System.out.println("CESAR : " + algCesar.cifrarCesar(password));
        System.out.println("SHA1 : " + hash.sha1(password));
        System.out.println("MD5 : " + hash.md5(password));

        System.out.println("SHA1 + CESAR : " + hash.sha1(algCesar.cifrarCesar(password)));
        System.out.println("MD5 + CESAR : " + hash.md5(algCesar.cifrarCesar(password)));

        System.out.println("SHA1 + CESAR + MD5: " + hash.md5(hash.sha1(algCesar.cifrarCesar(password))));
    }
}
