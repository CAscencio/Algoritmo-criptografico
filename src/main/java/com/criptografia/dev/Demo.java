package com.criptografia.dev;
import java.util.*;

public class Demo {
    public static void main(String[] args) {

        if(args.length == 0){

            String mensaje = "demito";

            char caracter;
            int codigoASCII;
            int int1, int2, int3, int4;
            String binario;
            String encryptado;
            String key;

            for (int i = 0; i < mensaje.length(); i++){
                caracter = mensaje.charAt(i);
                codigoASCII = caracter;
                System.out.println(codigoASCII);
            }
        }


    }
}
