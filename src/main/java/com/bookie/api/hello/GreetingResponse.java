package com.bookie.api.hello;


import com.fasterxml.jackson.annotation.*;


public class GreetingResponse {
	
	@JsonProperty("msg")
	private String greetingMessage;
	
	public GreetingResponse() {}
	
	public GreetingResponse(String message) {
		this.greetingMessage = message;
	}

	public String getGreetingMessage() {
		return greetingMessage;
	}

	public void setGreetingMessage(String greetingMessage) {
		this.greetingMessage = greetingMessage;
	}
}
