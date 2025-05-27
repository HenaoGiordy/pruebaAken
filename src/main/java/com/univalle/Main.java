package com.univalle;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static final Map<String, String> idMap = new HashMap<>();
    private static final SecureRandom random = new SecureRandom();

    public static void main(String[] args) throws IOException {


            ObjectMapper mapper = new ObjectMapper();
            File input = new File("Prueba_Junior.json");

            List<ObjetoJson> objetos = mapper.readValue(input, new TypeReference<>() {});

            for (ObjetoJson obj : objetos) {
                procesarObjeto(obj);
            }

            mapper.writerWithDefaultPrettyPrinter()
                    .writeValue(new File("output.json"), objetos);

            System.out.println("✅ Archivo generado correctamente: output.json");
        }

    private static void procesarObjeto(ObjetoJson obj) {
        obj.setId(generarIdUnico(obj.getId()));
        obj.setTipo(Traductor.traducir(obj.getTipo()));
        obj.setTexto(Traductor.traducir(obj.getTexto()));
        obj.setActor(Traductor.traducir(obj.getActor()));
        obj.setEquipo(Traductor.traducir(obj.getEquipo()));
        obj.setHerramienta(Traductor.traducir(obj.getHerramienta()));

        if (obj.getInteracciones() != null) {
            for (ObjetoJson sub : obj.getInteracciones()) {
                procesarObjeto(sub);
            }
        }
    }

        private static String generarIdUnico(String originalId) {
            if (originalId == null) return null;
            if (idMap.containsKey(originalId)) return idMap.get(originalId);

            String newId = generarCadenaAleatoria(50);
            idMap.put(originalId, newId);
            return newId;
        }

        private static String generarCadenaAleatoria(int length) {
            String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            StringBuilder builder = new StringBuilder(length);
            for (int i = 0; i < length; i++) {
                builder.append(chars.charAt(random.nextInt(chars.length())));
            }
            return builder.toString();
        }
}