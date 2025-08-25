package apicall.webclient;

import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@org.springframework.context.annotation.Configuration
public class WebClientConfig {


    @Bean
    public WebClient webClient() {
        return WebClient.builder().codecs(configurer -> configurer.defaultCodecs().maxInMemorySize(13037900)).build();

    }

}
