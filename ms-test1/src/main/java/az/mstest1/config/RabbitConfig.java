package az.mstest1.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    @Bean
    public Queue incrementQueue() {
        return new Queue("incrementQueue", false);
    }
}
