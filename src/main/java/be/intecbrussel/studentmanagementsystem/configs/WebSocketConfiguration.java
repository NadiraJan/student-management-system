package be.intecbrussel.studentmanagementsystem.configs;


import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.*;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfiguration implements WebSocketMessageBrokerConfigurer {
    //private final static String CHAT_ENDPOINT = "/chat";

    @Override
    public void registerStompEndpoints(final StompEndpointRegistry registry) {
        registry.addEndpoint(":/chat-example").withSockJS();
    }

    @Override
    public void configureMessageBroker(final MessageBrokerRegistry registry) {
        registry.setApplicationDestinationPrefixes("/app");
        registry.enableSimpleBroker("/topic");
    }

    /*  @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {

        registry.addHandler(getChatWebSocketHandler(), CHAT_ENDPOINT)
                .setAllowedOriginPatterns("*");

    }

    @Bean
    public WebSocketHandler getChatWebSocketHandler() {
        return new ChatSocketHandler();

    }*/
}
