# 🧠 JSON Translator - LibreTranslate + Java

Este proyecto en Java realiza la **traducción automática de archivos JSON** que contienen objetos con estructura anidada. Traduce tanto las **claves** (keys) como los **valores** de los campos desde **español a inglés*
Creé un diccionario para ir guardando cada una de las traducciones y así fuera más rápida la ejecución.
---

## 📦 Tecnologías usadas

- ☕ Java 17+
- 🧰 [Jackson] para manejo de JSON

---

## 🛠️ ¿Qué hace el proyecto?

- Carga un archivo `Prueba_Junior.json` con estructura compleja.
- Genera un **diccionario de traducción** para claves y valores.
- Utiliza LibreTranslate para traducir automáticamente los campos `texto`, `tipo`, `actor`, `equipo` y `herramienta`.
- Reasigna los campos a sus versiones en inglés: `type`, `text`, `actor`, `team`, `tool`.
- Reemplaza los `id` por nuevos UUIDs únicos, preservando referencias cruzadas.
- Exporta el archivo traducido como `output.json`.

---

## 📁 Estructura del proyecto

```bash
src/
└── com/univalle/
    ├── Main.java         # Punto de entrada, orquesta el procesamiento
    ├── ObjetoJson.java   # Modelo con mapeo de claves JSON
    ├── Traductor.java    # Utiliza el diccionario para traducir
    └── Diccionario.java  # Diccionario estático con traducciones clave→valor
resources/
    └── Prueba_Junior.json # Archivo JSON original
