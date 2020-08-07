package com.dataForPojo;

import com.pojo.pojoClass;

public class Setvalues_datadriven_delete {
	public pojoClass setvalues_datadriven(String i,String author) {
		pojoClass p=new pojoClass();
		p.setId(i);
		
		p.setAuthor(author);
		return p ;
		
	}

}
