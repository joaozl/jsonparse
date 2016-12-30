package test;

import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.Set;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;
import javax.swing.text.html.HTMLDocument.Iterator;
 
public class Main {
    
	public final static String personJSONData = 
			"  {" +
			"  \"users\": "+
			"  [{" +
            "   \"name\": \"Jack\", " +
            "   \"age\" : 13, " +
            "   \"isMarried\" : false, " +
            "   \"address\": { " +
            "     \"street\": \"#1234, Main Street\", " +
            "     \"zipCode\": \"123456\" " +
            "   }, " +
            "   \"phoneNumbers\": [\"011-111-1111\", \"11-111-1111\"] " +
            " }," +
            "{" +
            "   \"name\": \"Jack\", " +
            "   \"age\" : 13, " +
            "   \"isMarried\" : false, " +
            "   \"address\": { " +
            "     \"street\": \"#1234, Main Street\", " +
            "     \"zipCode\": \"123456\" " +
            "   }, " +
            "   \"phoneNumbers\": [\"011-111-1111\", \"11-111-1111\"] " +
            " }]"+
            " }"
            ;
	
	//Display all keys 
	public static JsonValue getAllKeys (String JsonData){
		JsonReader reader = Json.createReader(new StringReader(JsonData));
        
        JsonObject personObject = reader.readObject();
         
        reader.close();
        
        //Eg output
		String parsed= "";
		String tempKey= "name";
		JsonArray test;
		
		//Set temp = personObject.entrySet();
		//get first level keys
		Set keys   = personObject.keySet();
		//get all keys values from json object
		keys = personObject.entrySet();
		//test
		//test = personObject.get("name");
		
		test = personObject.getJsonArray(JsonData);
		
		return test;
	}
	
	//Set array keys
	public static Array setKeys (Set keys){
		
		
		return null;
	}
	
	
	public static String parseJson (String JsonData){
		JsonReader reader = Json.createReader(new StringReader(JsonData));
        
        JsonObject personObject = reader.readObject();
         
        reader.close();
        
        //Eg output
		String parsed= "";
//		String tempKey= "name";
		
		//Set temp = personObject.entrySet();
		Set keys   = personObject.keySet();
		boolean isArray =  personObject.containsKey(personObject);
		
		for (Object object : keys) {
//			if(tempKey.equals(object)){
			parsed  += object + " -> " + personObject.get(object)+"\n";
//			}
		
		}
		
		return parsed;
	}
	
	public static void main(String[] args) {
		
		//System.out.println(Main.parseJson(personJSONData));
		System.out.println(Main.getAllKeys(personJSONData));
    
	}
}
