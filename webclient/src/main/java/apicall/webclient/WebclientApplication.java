package apicall.webclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

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

		System.out.println(players);


	}

}
