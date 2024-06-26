package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class SendController {
    private final StreamBridge streamBridge;

    @GetMapping()
    public String test(){
        streamBridge.send("news-out-0", "không ok");
        return "ok";
    }
}