package com.postnord;
 
import org.json.JSONObject;
import org.json.XML;

public class ConvertXml2Json {
	
	public static String convertJsonObject2Xml(JSONObject json) {
		String xml = XML.toString(json);				
		return xml;
	}

	public static String convertJsonString2Xml(String jsonString) {
				
				JSONObject json = new JSONObject(jsonString);
				String xml = XML.toString(json);				
				return xml;
	}
}
