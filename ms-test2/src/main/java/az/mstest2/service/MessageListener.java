package az.mstest2.service;


import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class MessageListener {

    @RabbitListener(queues = "incrementQueue")
    @Transactional
    public void receiveIncrementMessage(String message) {
        System.out.println(message);
    }
}