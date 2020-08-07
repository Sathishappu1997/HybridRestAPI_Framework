package com.DataForPayload;

public class Datadriven_payloads {
	public static String datadriven_post(String title,String body,String author) {
		String post1=  "{\r\n" + 
				"         \"title\": \""+title+"\",\r\n" + 
				"        \"body\": \""+body+"\",\r\n" + 
				"        \"author\": \""+author+"\"\r\n" + 
				"    }";
				return post1;
					

	}
	public static String datadrivenputpayload(String id,String title,String author) {
		return "{\"id\":\""+id+"\",\r\n" + 
				"\"title\":\""+author+"\"\r\n" + 
				"}";
	}
	
	public static String datadrivendeletepayload(String id) {
		String delete=  "{\r\n" + 
				"         \"id\": \""+id+"\",\r\n" + 
				
				"    }";
				return delete;
		
	}

}
