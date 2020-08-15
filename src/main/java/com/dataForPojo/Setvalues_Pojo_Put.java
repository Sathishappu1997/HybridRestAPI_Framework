package com.dataForPojo;

import org.apache.commons.lang3.RandomStringUtils;

import com.pojo.pojoClass;

public class Setvalues_Pojo_Put {

	public String id_generate() {
		
		String id = RandomStringUtils.randomNumeric(2);
		return 10+id;
		
	}
	
	public pojoClass setvalues_put() {
		pojoClass p=new pojoClass();
		p.setId(id_generate());
		p.setAuthor("b12");
		return p ;
		
	}
}
