package az.mstest1.controller;

import az.mstest1.service.MessageSender;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ms1")
@RequiredArgsConstructor
public class TestController {
    private final MessageSender sender;

    @GetMapping
    public String get() {
        sender.sendIncrementMessage("incrementQueue", "salam");
        return "ok";
    }
}
