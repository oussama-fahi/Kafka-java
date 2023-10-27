package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
//	public class Main {
//		public static void main(String[] args) {
//			KafkaConfig kafkaConfig = new KafkaConfig("localhost:9092");
//			String topic = "test-topic";
//			String groupId = "test-group";
//
//			// Create a Kafka producer service
//			KafkaProducerService<String> producerService = new KafkaProducerService<>(kafkaConfig, topic);
//			producerService.produce("key", "Hello, Kafka!");
//
//			// Create a Kafka consumer service
//			KafkaConsumerService<String> consumerService = new KafkaConsumerService<>(kafkaConfig, groupId, topic);
//			ConsumerRecord<String, String> record = consumerService.consume();
//
//			if (record != null) {
//				System.out.println("Received: " + record.value());
//			}
//
//			// Close the services
//			producerService.close();
//			consumerService.close();
//		}
//	}
}
