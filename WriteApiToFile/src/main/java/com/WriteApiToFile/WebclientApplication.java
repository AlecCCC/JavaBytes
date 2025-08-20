package com.WriteApiToFile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@SpringBootApplication
public class WebclientApplication {

	public static void main(String[] args) {

		String url = "https://api.sleeper.app/v1/players/nfl";

		ApplicationContext context = SpringApplication.run(WebclientApplication.class, args);

		WebClient webClient = context.getBean(WebClient.class);

		String players = webClient.get()
				.uri(url)
				.retrieve()
				.bodyToMono(String.class)
				.block();
		try {
			FileWriter file = new FileWriter("players.txt");
			BufferedWriter output = new BufferedWriter(file);
			output.write(players);
			output.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		System.out.println(players);




	}

}
