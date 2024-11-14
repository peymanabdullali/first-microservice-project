package az.mstest2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ms1")
public class    TestController {
    @GetMapping
    public String get() {
        return "Salam";
    }
}
