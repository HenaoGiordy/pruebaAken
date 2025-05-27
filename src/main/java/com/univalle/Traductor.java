package com.univalle;

import okhttp3.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Traductor {
    public static String traducir(String texto) {
        if (texto == null || texto.isBlank()) return texto;

        Map<String, String> diccionario = Diccionario.getDictionary();

        // Si existe una traducción exacta
        if (diccionario.containsKey(texto.trim())) {
            return diccionario.get(texto.trim());
        }

        // Si no hay coincidencia exacta, intenta encontrar coincidencias parciales
        for (Map.Entry<String, String> entry : diccionario.entrySet()) {
            if (texto.contains(entry.getKey())) {
                texto = texto.replace(entry.getKey(), entry.getValue());
            }
        }

        return texto;
    }
}
