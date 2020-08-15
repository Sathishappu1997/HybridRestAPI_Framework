package com.DataForJsonObject;

import org.json.simple.JSONObject;

public class Post_Put_Delete_JsonObjecct {

	public JSONObject Post_JsObject() {

		JSONObject jsobj = new JSONObject();
		jsobj.put("title", "a23");
		jsobj.put("body", "56");
		jsobj.put("author", "p3");

		return jsobj;
	}

	public JSONObject Put_JsObject() {

		JSONObject jsobj = new JSONObject();
		jsobj.put("id", "63");
		jsobj.put("author", "p4");

		return jsobj;
	}

	public JSONObject Delete_JsObject() {

		JSONObject jsobj = new JSONObject();
		jsobj.put("id", "1003");

		return jsobj;
	}
}
