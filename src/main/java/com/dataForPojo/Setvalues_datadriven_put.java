package com.dataForPojo;

import com.pojo.pojoClass;

public class Setvalues_datadriven_put {
	public pojoClass setvalues_putdatadriven(String id,String author) {
		pojoClass p=new pojoClass();
		p.setId(id);
		p.setAuthor(author);
		return p ;
		
	}

}
