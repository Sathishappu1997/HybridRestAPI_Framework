package com.dataForPojo;

import com.pojo.pojoClass;

public class Setvalues_datadriven_post {
	public pojoClass setvalues_datadriven(String title,String body,String author) {
		pojoClass p=new pojoClass();
		p.setTitle(title);
		p.setBody(body);
		p.setAuthor(author);
		return p ;
		
	}

}
