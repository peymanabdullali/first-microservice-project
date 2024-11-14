package az.mstest1.service;


import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageSender {

    private final RabbitTemplate rabbitTemplate;


    public void sendIncrementMessage(String queueName, Object message) {
        rabbitTemplate.convertAndSend(queueName, message);
    }
}