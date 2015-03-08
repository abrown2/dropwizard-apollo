package com.disney.apollo.dw.domain;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Product {
	
		public Product() {
			
		}
		
		public Product(long id, String title) {
			this.id = id;
			this.title = title;
		}
	
	 	private long id;

	    @Length(max = 50)
	    private String title;

	    @JsonProperty
	    public long getId() {
			return id;
		}

	    @JsonProperty
	    public String getTitle() {
			return title;
		}

	    

	    
}
