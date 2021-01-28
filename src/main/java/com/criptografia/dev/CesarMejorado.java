package com.criptografia.dev;

public class CesarMejorado {

    public String cifrarCesar(String mensaje) {

        //Texto a salir (cfrado)
        String cipher = "";
        String cipherReverse = "";
        //Posiciones a adelantar
        int adelantar = 3;

        //Convertimos el mansaje en un array de caracteres
        char[] letras = mensaje.toCharArray();

        //Vamos por cada caracter sumandole 3
        for (int i = 0; i < letras.length; i++) {

            // de esta manera obtenemos el codigo ascii del caracter  ((int) letras[i])
            // luego a ese numero le sumamos 3 ( ((int) letras[i])+ adelantar)  <- quedaria asi
            // y luego convertimos ese numero en la letra a la que hace
            // referencia en el codigo ascii solo casteando el numero a (char)

            cipher += (char) (((int) letras[i]) + adelantar);
        }

        for (int j = cipher.length() - 1; j >= 0; j--) {
            // Y vamos concatenando cada carácter a la nueva cadena
            cipherReverse += cipher.charAt(j);
        }

        //Texto cifrado reverse
        return cipherReverse;
    }
}
