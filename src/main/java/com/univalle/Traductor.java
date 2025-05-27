package com.univalle;

import java.util.Map;

public class Traductor {
    public static String traducir(String texto) {
        if (texto == null || texto.isBlank()) return texto;

        Map<String, String> diccionario = Diccionario.getDictionary();

        if (diccionario.containsKey(texto.trim())) {
            return diccionario.get(texto.trim());
        }

        for (Map.Entry<String, String> entry : diccionario.entrySet()) {
            if (texto.contains(entry.getKey())) {
                texto = texto.replace(entry.getKey(), entry.getValue());
            }
        }

        return texto;
    }
}
