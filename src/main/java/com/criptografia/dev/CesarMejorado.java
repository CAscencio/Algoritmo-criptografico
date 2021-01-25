package com.criptografia.dev;

public class CesarMejorado {

    public static void main(String[] args) {

        String abcMin = "abcdefghijklmnñopqrstuwxyz";
        String abcMay = new String(abcMin);
        String numeros = "0123456789";
        abcMay = abcMay.toUpperCase();

        String[] arrAbcMin = abcMin.split("");
        String[] arrAbcMay = abcMay.split("");
        String[] arrNum = numeros.split("");

        //VARIABLES CESAR
        String abcMinCes = "cdefghijklmnñopqrstuwxyzab";
        String abcMayCes = new String(abcMinCes);
        String numerosCes = "2345678901";
        abcMayCes = abcMayCes.toUpperCase();

        String[] arrAbcMinCes = abcMinCes.split("");
        String[] arrAbcMayCes = abcMayCes.split("");
        String[] arrNumCes = numerosCes.split("");

        String mensaje = "abc";
        String letraIntermedio = "";
        String mensajeIntermedio = "";


        for (int i = 0; i < mensaje.length(); i++) {

            if (Character.isUpperCase(mensaje.charAt(i))) {

                for (int e = 0; e < arrAbcMay.length; e++) {                      //COMPRUEBO SI ES MAYUSCULA
                    if (arrAbcMay[e].equals(mensaje.charAt(i) + "")) {
                        mensajeIntermedio = mensajeIntermedio + arrAbcMayCes[e];
                    }

                }
            } else if (Character.isLowerCase(mensaje.charAt(i))) {                //COMPRUEBO SI ES MINUSCULA
                for (int e = 0; e < arrAbcMin.length; e++) {
                    if (arrAbcMin[e].equals(mensaje.charAt(i) + "")) {
                        mensajeIntermedio = mensajeIntermedio + arrAbcMinCes[e];
                    }

                }

            } else if (Character.isDigit(mensaje.charAt(i))) {                    //COMPRUEBO SI ES UN NUMERO
                for (int e = 0; e < arrNumCes.length; e++) {
                    if (arrNum[e].equals(mensaje.charAt(i) + "")) {
                        mensajeIntermedio = mensajeIntermedio + arrNumCes[e];
                    }

                }

            } else {//EN CUALQUIER OTRO CASO CONCATENA CARACTER
                mensajeIntermedio = mensajeIntermedio + mensaje.charAt(i) + "";
            }

        }

        System.out.println(mensajeIntermedio);

    }

}


