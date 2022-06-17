package com.praveenp;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.praveenp.enty.Bank;

@SpringBootApplication
@RestController
public class Application {
//	
//	@Autowired
//	private KafkaTemplate<String,Object> template;
//	private String topic = "praveenp";
//	
//	@GetMapping("/bank/{name}")
//	public String publishMessage(@PathVariable String name) {
//		template.send(topic, "Hi " + name + " Welcome to praveenp");
//		return "Data published";
//	}
//	
//
//	@GetMapping("/publishJson")
//	public String publishMessage() {
//		Bank bank = new Bank();
//		template.send(topic, bank);
//		return "Json Data published";
//	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("122222....application stated..Bank");
	}

}




//@SpringBootApplication
//@RestController
//public class KafkaPublisherApplication {
//
//	@Autowired
//	private KafkaTemplate<String, Object> template;
//
//	private String topic = "javatechie";
//
//	@GetMapping("/publish/{name}")
//	public String publishMessage(@PathVariable String name) {
//		template.send(topic, "Hi " + name + " Welcome to java techie");
//		return "Data published";
//	}
//
//	@GetMapping("/publishJson")
//	public String publishMessage() {
//		User user = new User(2532, "User88", new String[] { "Bangalore", "BTM", "house 90" });
//		template.send(topic, user);
//		return "Json Data published";
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(KafkaPublisherApplication.class, args);
//	}
//}