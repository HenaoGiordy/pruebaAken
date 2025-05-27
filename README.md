# 🧠 JSON Translator - LibreTranslate + Java

Este proyecto en Java realiza la **traducción automática de archivos JSON** que contienen objetos con estructura anidada. Traduce tanto las **claves** (keys) como los **valores** de los campos desde **español a inglés*
Creé un diccionario para ir guardando cada una de las traducciones y así fuera más rápida la ejecución.
---

## 📦 Tecnologías usadas

- ☕ Java 17+
- 🧰 [Jackson](https://github.com/FasterXML/jackson) para manejo de JSON

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
├── src/
│   ├── com/univalle/
│   │   ├── Main.java           # Clase principal que carga, traduce y guarda el JSON
│   │   ├── ObjetoJson.java     # Clase de modelo con mapeo de claves en español/inglés
│   │   └── Traductor.java      # Cliente HTTP que se conecta a LibreTranslate
├── Prueba_Junior.json          # Archivo de entrada original
├── output.json                 # Archivo de salida traducido
