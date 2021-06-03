package com.devsuperior.dscatalog.services.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	private String fieldMesage;
	private String message;
	
	public FieldMessage() {
	}

	public FieldMessage(String fieldMesage, String message) {
		super();
		this.fieldMesage = fieldMesage;
		this.message = message;
	}

	public String getFieldMesage() {
		return fieldMesage;
	}

	public void setFieldMesage(String fieldMesage) {
		this.fieldMesage = fieldMesage;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
