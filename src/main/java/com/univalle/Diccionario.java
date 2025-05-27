package com.univalle;

import java.util.HashMap;
import java.util.Map;

public class Diccionario {
    public static Map<String, String> getDictionary() {
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("Díalogo", "Dialogue");
        diccionario.put("Instrucción", "Instruction");
        diccionario.put("Des. Usuario", "User");
        diccionario.put("Expertos", "Experts");
        diccionario.put("Ninguno", "None");
        diccionario.put("El usuario indica: Formulario de la Superintendencia Nacional de Salud - Cobertura.", "The user states: Form from the National Health Superintendency - Coverage.");
        diccionario.put("De acuerdo a tu conocimiento, compara con los casos conocidos el caso mencionado por el usuario y determina si existe similitud. Si la hay, responde únicamente con la palabra **APLICA**. Si no encuentras similitud con ninguno de los casos, responde únicamente con la palabra **VERIFICAR**.", "Based on your knowledge, compare the user's case with known cases and determine if there is similarity. If so, respond only with the word **APPLIES**. If not, respond only with the word **VERIFY**.");
        diccionario.put("El texto contiene la palabra APLICA.", "The text contains the word APPLIES.");
        diccionario.put("Pregunta al usuario ¿Usa abogado?", "Ask the user: Do you use a lawyer?");
        diccionario.put("El usuario responde: Sí.", "The user responds: Yes.");
        diccionario.put("El usuario responde: Natural.", "The user responds: Natural.");

        diccionario.put("El usuario responde.", "The user responds.");
        diccionario.put("El usuario responde: Jurídica.", "The user responds: Legal.");
        diccionario.put("Solicita al usuario que ingrese los siguientes datos del demandante: - Tipo de documento (obligatorio) - Identificación sin número de verificación (obligatorio) - Razón social (obligatorio)", "Request the user to enter the following details of the claimant: - Document type (required) - ID without verification number (required) - Company name (required)");
        diccionario.put("Solicita al usuario que ingrese los siguientes datos de contacto del demandante: - Teléfono celular (obligatorio) - Teléfono fijo o celular - Correo electrónico (obligatorio)", "Request the user to enter the following contact details of the claimant: - Mobile phone (required) - Landline or mobile - Email (required)");
        diccionario.put("Solicita al usuario que describa brevemente los detalles de la demanda.", "Request the user to briefly describe the details of the claim.");
        diccionario.put("Finaliza la conversación de manera amable e informa al usuario que puede descargar un borrador de la demanda utilizando el botón ubicado en la parte inferior derecha, o bien acceder al formulario a través del botón continuo.", "Kindly end the conversation and inform the user that they can download a draft of the claim using the button at the bottom right or access the form through the continue button.");
        diccionario.put("El usuario responde: No.", "The user responds: No.");
        diccionario.put("Expica al usuario que el caso probablemente la entidad no la acepte al no estar en concordancia con CUPS del Anexo 2 de la Resolución 2718 de 2024. Indicale que puede obtener más informacion en: [Supersalud](https://www.supersalud.gov.co/es-co/Paginas/Home.aspx) y finaliza amablemente la converzacion.", "Explain to the user that the entity will probably not accept the case because it is not in accordance with CUPS of Annex 2 of Resolution 2718 of 2024. Tell them that they can obtain more information at: [Supersalud](https://www.supersalud.gov.co/es-co/Paginas/Home.aspx) and politely end the conversation.");
        return diccionario;
    }
}
