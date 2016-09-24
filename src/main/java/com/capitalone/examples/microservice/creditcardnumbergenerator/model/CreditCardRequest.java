package com.capitalone.examples.microservice.creditcardnumbergenerator.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CreditCardRequest implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8686209056739336163L;
	private String howMany;
	private String CreditCardType;

	public String getHowMany() {
		return howMany;
	}

	public void setHowMany(String howMany) {
		this.howMany = howMany;
	}

	public String getCreditCardType() {
		return CreditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		CreditCardType = creditCardType;
	}

}
