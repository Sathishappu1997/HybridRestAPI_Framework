package com.DataForHashmap;

import java.util.HashMap;
import java.util.List;

import io.restassured.RestAssured;



public class Post_Put_Delete_HashmapData {
	
	public HashMap<String, Object> post_map() {
		HashMap<String,Object >map=new HashMap<String,Object>();
		map.put("title", "a23");
		map.put("body", "56");
		map.put("author", "p3");
		
	
	
	return map;
	

}
	public HashMap<String, Object> put_map() {
		HashMap<String,Object >map=new HashMap<String,Object>();
		map.put("id", "63");
		
		map.put("author", "p4");
		
		return map;
		
	}
	
	public HashMap<String, Object> delete_map() {
		HashMap<String,Object >map=new HashMap<String,Object>();
		map.put("id", "1003");
		return map;
	}
	
}
