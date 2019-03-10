package com.postnord;

import com.google.gson.Gson;
import org.json.JSONObject;
import org.json.XML;

import java.nio.charset.StandardCharsets;

public class ConvertXml2Json {

    public static String convertJsonObject2Xml(JSONObject json) {
        return XML.toString(json);
    }

    public static String convertJsonString2Xml(String jsonString) {
        byte[] bytes = jsonString.getBytes(StandardCharsets.ISO_8859_1);
            String encodedString = new String(bytes,StandardCharsets.ISO_8859_1);
            JSONObject json = new JSONObject(encodedString);
        return XML.toString(json);
    }

    public static String convertJavaObjectToJsonString(Object simpleObject) {
        Gson gson = new Gson();
        return gson.toJson(simpleObject);
    }
}
