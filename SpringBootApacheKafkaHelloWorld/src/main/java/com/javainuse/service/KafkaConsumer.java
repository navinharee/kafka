package com.javainuse.service;

//Java Program to Illustrate Kafka Consumer 


//Importing required classes 
import org.springframework.kafka.annotation.KafkaListener; 
import org.springframework.stereotype.Component; 

@Component
public class KafkaConsumer { 

	@KafkaListener(topics = "navin_test_topic", 
				groupId = "navi") 
	public void
	consume(String message) 
	{ 
		// Print statement 
		System.out.println("message = " + message); 
	} 
}
 