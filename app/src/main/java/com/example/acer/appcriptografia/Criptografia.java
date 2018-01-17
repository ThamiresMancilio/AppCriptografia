package com.example.acer.appcriptografia;

/**
 * Created by Acer on 10/11/2017.
 */

public class Criptografia {

    public String Criptografar(String texto, boolean criptografa) {

        String alfabeto = " <abcdefghijklmnopqrstuvwxyzçéáíúóãõABCDEFGHIJKLMNOPQRSTUVWXYZÇÁÉÓÍÚÃÕ1234567890.;:?,º]}§[{ª!@#$%&*()_+-=\\/|\'\">";

        char[] t = texto.toCharArray();

        String palavra="";

        int posicao;
        for (int i = 0; i < t.length; i++) {

            if (criptografa){

                posicao = alfabeto.indexOf(t[i]) + 5;

            }else{
                posicao = alfabeto.indexOf(t[i]) - 5;
            }

            if (alfabeto.length() <= posicao) {

                posicao = posicao - alfabeto.length();

            }
            palavra = palavra + alfabeto.charAt(posicao);

        }
        return palavra;
    }

}
